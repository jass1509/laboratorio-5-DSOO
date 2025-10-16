import java.util.ArrayList;

public class SistemaCitas {
    private ArrayList<Doctor> doctores;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Cita> citas;

    public SistemaCitas() {
        doctores = new ArrayList<>();
        pacientes = new ArrayList<>();
        citas = new ArrayList<>();
    }

    //Registro
    public boolean registrarDoctor(Doctor d) {
        for (Doctor doc : doctores) {
            if (doc.getCodigo().equalsIgnoreCase(d.getCodigo())) {
                System.out.println("Error: Código de doctor repetido.");
                return false;
            }
        }
        doctores.add(d);
        return true;
    }

    public boolean registrarPaciente(Paciente p) {
        for (Paciente pa : pacientes) {
            if (pa.getCodigo().equalsIgnoreCase(p.getCodigo())) {
                System.out.println("Error: Código de paciente repetido.");
                return false;
            }
            if (pa.getDocumento().equalsIgnoreCase(p.getDocumento())) {
                System.out.println("Error: Documento de paciente repetido.");
                return false;
            }
        }
        pacientes.add(p);
        return true;
    }

    public boolean registrarCita(Cita c) {
        for (Cita ci : citas) {
            if (ci.getDoctor().getCodigo().equalsIgnoreCase(c.getDoctor().getCodigo()) &&
                ci.getFecha().equals(c.getFecha()) &&
                ci.getHora().equals(c.getHora())) {
                System.out.println("Error: Doctor ocupado en esa fecha y hora.");
                return false;
            }
        }
        citas.add(c);
        return true;
    }

    //Reportes
    public void listarCitas() {
        for (Cita c : citas) {
            c.mostrarCita();
        }
    }

    public void listarPorDoctor(String codigoDoctor) {
        for (Cita c : citas) {
            if (c.getDoctor().getCodigo().equalsIgnoreCase(codigoDoctor)) {
                c.mostrarCita();
            }
        }
    }

    public void listarPorPaciente(String codigoPaciente) {
        for (Cita c : citas) {
            if (c.getPaciente().getCodigo().equalsIgnoreCase(codigoPaciente)) {
                c.mostrarCita();
            }
        }
    }

    public int totalAtendidas() {
        int contador = 0;
        for (Cita c : citas) {
            if (c.getEstado().equalsIgnoreCase("ATENDIDA")) {
                contador++;
            }
        }
        return contador;
    }

    public int totalCanceladas() {
        int contador = 0;
        for (Cita c : citas) {
            if (c.getEstado().equalsIgnoreCase("CANCELADA")) {
                contador++;
            }
        }
        return contador;
    }

    public boolean cambiarEstadoCita(String codigoCita, String nuevoEstado) {
        for (Cita c : citas) {
            if (c.getCodigo().equalsIgnoreCase(codigoCita)) {
                c.cambiarEstado(nuevoEstado);
                return true;
            }
        }
        System.out.println("Cita no encontrada.");
        return false;
    }

    //Getters
    public ArrayList<Cita> getCitas() {
        return citas;
    }
    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
}
