public class Cita {
    private String codigo;
    private Paciente paciente;
    private Doctor doctor;
    private String fecha;
    private String hora;
    private String estado;

    public Cita(String codigo, Paciente paciente, Doctor doctor, String fecha, String hora) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.doctor = doctor;

        if (!Validador.formatoFechaValido(fecha) || !Validador.formatoHoraValido(hora)) {
            System.out.println("Fecha u hora con formato incorrecto");
        } else {
            this.fecha = fecha;
            this.hora = hora;
        }

        this.estado = "PENDIENTE";
    }

    public String getCodigo() { return codigo; }
    public Paciente getPaciente() { return paciente; }
    public Doctor getDoctor() { return doctor; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public String getEstado() { return estado; }

    public void cambiarEstado(String nuevoEstado) {
        if (nuevoEstado.equalsIgnoreCase("PENDIENTE") ||
            nuevoEstado.equalsIgnoreCase("ATENDIDA") ||
            nuevoEstado.equalsIgnoreCase("CANCELADA")) {
            this.estado = nuevoEstado.toUpperCase();
        } else {
            System.out.println("Estado inválido.");
        }
    }

    public void mostrarCita() {
        System.out.println("Cita: " + codigo + " | Paciente: " + paciente.getNombre() +
                " | Doctor: " + doctor.getNombre() + " | Fecha: " + fecha +
                " | Hora: " + hora + " | Estado: " + estado);
    }
}
