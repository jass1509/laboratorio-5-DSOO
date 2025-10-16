public class Main {
    public static void main(String[] args) {
        //Crear el sistema
        SistemaCitas sistema = new SistemaCitas();
        //Crear pacientes iniciales ----
        Paciente p1 = new Paciente("PAC001", "Juan Pérez", 25, "12345678");
        Paciente p2 = new Paciente("PAC002", "María Flores", 30, "87654321");
        sistema.registrarPaciente(p1);
        sistema.registrarPaciente(p2);
        //Crear doctores iniciales 
        Doctor d1 = new Doctor("DOC001", "Carlos Medina", "Cardiología");
        Doctor d2 = new Doctor("DOC002", "Sofía Luna", "Pediatría");
        sistema.registrarDoctor(d1);
        sistema.registrarDoctor(d2);
        //Crear citas iniciales 
        Cita c1 = new Cita("CIT001", p1, d1, "20-10-2025", "09:00");
        Cita c2 = new Cita("CIT002", p2, d2, "22-10-2025", "11:30");
        sistema.registrarCita(c1);
        sistema.registrarCita(c2);
        //Mostrar información inicial
        System.out.println("=== Pacientes Registrados ===");
        System.out.println(p1.obtenerInformacion());
        System.out.println(p2.obtenerInformacion());
        System.out.println("\n=== Doctores Registrados ===");
        System.out.println(d1.obtenerInformacion());
        System.out.println(d2.obtenerInformacion());
        System.out.println("\n=== Citas Registradas ===");
        sistema.listarCitas();
        //Menu iterativo
        Menu menu = new Menu(sistema);
        menu.mostrarMenu();

        System.out.println("\n=== Resumen Final de Citas ===");
        sistema.listarCitas();
        System.out.println("Total de citas atendidas: " + sistema.totalAtendidas());
        System.out.println("Total de citas canceladas: " + sistema.totalCanceladas());
    }
}
