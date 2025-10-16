package javaapplication45;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Cita {
    private String codigo;
    private Paciente paciente;
    private Doctor doctor;
    private LocalDate fecha;
    private LocalTime hora;
    private String estado;

    public Cita(String codigo, Paciente paciente, Doctor doctor, LocalDate fecha, LocalTime hora) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = "PENDIENTE";
    }

    public String getCodigo() { return codigo; }
    public Paciente getPaciente() { return paciente; }
    public Doctor getDoctor() { return doctor; }
    public LocalDate getFecha() { return fecha; }
    public LocalTime getHora() { return hora; }
    public String getEstado() { return estado; }

    public void cambiarEstado(String nuevoEstado) {
        if (nuevoEstado.equalsIgnoreCase("ATENDIDA") || nuevoEstado.equalsIgnoreCase("CANCELADA") || nuevoEstado.equalsIgnoreCase("PENDIENTE")) {
            this.estado = nuevoEstado.toUpperCase();
        } else {
            System.out.println("⚠ Estado inválido.");
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("HH:mm");
        return String.format("Cita [%s] %s con %s - %s %s (%s)",
                codigo, paciente.getNombre(), doctor.getNombre(),
                fecha.format(f1), hora.format(f2), estado);
    }
}
