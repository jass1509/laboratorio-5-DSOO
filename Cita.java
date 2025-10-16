package javaapplication45;

public class Cita {
    private String codigo;
    private Paciente paciente;
    private Doctor doctor;
    private String fecha;
    private String estado; // Pendiente, Atendida, Cancelada

    public Cita(String codigo, Paciente paciente, Doctor doctor, String fecha) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
        this.estado = "PENDIENTE";
    }

    public String getCodigo() { return codigo; }
    public Paciente getPaciente() { return paciente; }
    public Doctor getDoctor() { return doctor; }
    public String getFecha() { return fecha; }
    public String getEstado() { return estado; }

    public void cambiarEstado(String nuevo) {
        if (nuevo.equalsIgnoreCase("PENDIENTE") ||
            nuevo.equalsIgnoreCase("ATENDIDA") ||
            nuevo.equalsIgnoreCase("CANCELADA")) {
            this.estado = nuevo.toUpperCase();
        } else {
            System.out.println(" Estado inválido.");
        }
    }

   
}
