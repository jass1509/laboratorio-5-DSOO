import java.util.Scanner;

public class Menu {
    private SistemaCitas sistema;
    private Scanner sc;

    public Menu(SistemaCitas sistema) {
        this.sistema = sistema;
        this.sc = new Scanner(System.in);
    }

    public void mostrarMenu() {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== SISTEMA DE CITAS MÉDICAS ===");
            System.out.println("1. Registrar Doctor");
            System.out.println("2. Registrar Paciente");
            System.out.println("3. Registrar Cita");
            System.out.println("4. Cambiar Estado de Cita");
            System.out.println("5. Mostrar todas las Citas");
            System.out.println("6. Mostrar Citas por Doctor");
            System.out.println("7. Mostrar Citas por Paciente");
            System.out.println("8. Mostrar Totales de Citas");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: registrarDoctor(); break;
                case 2: registrarPaciente(); break;
                case 3: registrarCita(); break;
                case 4: cambiarEstadoCita(); break;
                case 5: sistema.listarCitas(); break;
                case 6: listarPorDoctor(); break;
                case 7: listarPorPaciente(); break;
                case 8: mostrarTotales(); break;
                case 9: salir = true; System.out.println("Saliendo del sistema..."); break;
                default: System.out.println("Opción inválida.");
            }
        }
    }

    private void registrarDoctor() {
        System.out.print("Código: ");
        String codDoc = sc.nextLine();
        System.out.print("Nombre: ");
        String nomDoc = sc.nextLine();
        System.out.print("Especialidad: ");
        String espDoc = sc.nextLine();

        Doctor d = new Doctor(codDoc, nomDoc, espDoc);
        sistema.registrarDoctor(d);
    }

    private void registrarPaciente() {
        System.out.print("Código: ");
        String codPac = sc.nextLine();
        System.out.print("Nombre: ");
        String nomPac = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Documento: ");
        String docPac = sc.nextLine();

        Paciente p = new Paciente(codPac, nomPac, edad, docPac);
        sistema.registrarPaciente(p);
    }

    private void registrarCita() {
        System.out.print("Código de Cita: ");
        String codCita = sc.nextLine();

        System.out.print("Código de Paciente: ");
        String codPacCita = sc.nextLine();
        Paciente paciente = null;
        
        for (Paciente pa : sistema.getPacientes()) {
            if (pa.getCodigo().equalsIgnoreCase(codPacCita)) {
                paciente = pa;
                break;
            }
        }
        if (paciente == null) {
            System.out.println("Paciente no encontrado.");
            return;
        }

        System.out.print("Código de Doctor: ");
        String codDocCita = sc.nextLine();
        Doctor doctor = null;
        for (Doctor doc : sistema.getDoctores()) {
            if (doc.getCodigo().equalsIgnoreCase(codDocCita)) {
                doctor = doc;
                break;
            }
        }
        if (doctor == null) {
            System.out.println("Doctor no encontrado.");
            return;
        }

        System.out.print("Fecha (dd-MM-yyyy): ");
        String fecha = sc.nextLine();
        System.out.print("Hora (HH:mm): ");
        String hora = sc.nextLine();

        Cita cita = new Cita(codCita, paciente, doctor, fecha, hora);
        sistema.registrarCita(cita);
    }

    private void cambiarEstadoCita() {
        System.out.print("Código de Cita: ");
        String codC = sc.nextLine();
        System.out.print("Nuevo Estado (PENDIENTE/ATENDIDA/CANCELADA): ");
        String estado = sc.nextLine();
        sistema.cambiarEstadoCita(codC, estado);
    }

    private void listarPorDoctor() {
        System.out.print("Código de Doctor: ");
        String codDoc = sc.nextLine();
        sistema.listarPorDoctor(codDoc);
    }

    private void listarPorPaciente() {
        System.out.print("Código de Paciente: ");
        String codPac = sc.nextLine();
        sistema.listarPorPaciente(codPac);
    }

    private void mostrarTotales() {
        System.out.println("Total de citas atendidas: " + sistema.totalAtendidas());
        System.out.println("Total de citas canceladas: " + sistema.totalCanceladas());
    }
}

