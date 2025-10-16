package javaapplication45;

public class Paciente {
    private String codigo;
    private String nombre;
    private int edad;
    private String documento;

    public Paciente(String codigo, String nombre, int edad, String documento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getDocumento() { return documento; }
}
