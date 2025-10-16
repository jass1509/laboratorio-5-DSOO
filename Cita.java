package javaapplication45;


public class Cita {
    private String codigo;
    private Paciente paciente;
    private Doctor doctor;


    public Cita(String codigo, Paciente paciente, Doctor doctor, LocalDate fecha, LocalTime hora) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.doctor = doctor;
        
    }

    public String getCodigo() { return codigo; }
    public Paciente getPaciente() { return paciente; }
    public Doctor getDoctor() { return doctor; }
   
}
