package javaapplication45;


public class Doctor {
    private String codigo;
    private String nombre;
    private String especialidad;


    public Doctor(String codigo, String nombre, String especialidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;

    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }


    
}
