package javaapplication45;

import java.time.LocalTime;

public class Doctor {
    private String codigo;
    private String nombre;
    private String especialidad;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Doctor(String codigo, String nombre, String especialidad, LocalTime horaInicio, LocalTime horaFin) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }

    public boolean estaDisponible(LocalTime hora) {
        return !hora.isBefore(horaInicio) && !hora.isAfter(horaFin);
    }

    @Override
    public String toString() {
        return String.format("[%s] %s - %s (%s–%s)", codigo, nombre, especialidad, horaInicio, horaFin);
    }
}
