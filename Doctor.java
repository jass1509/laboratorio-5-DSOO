import java.util.ArrayList;

public class Doctor {
    private String codigo;
    private String nombre;
    private String especialidad;

    private static ArrayList<String> listaCodigo = new ArrayList<>();

    public Doctor(String codigo, String nombre, String especialidad) {
        setCodigo(codigo);
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }

    public void setCodigo(String codigo) {
        if (!Validador.noRepetir(codigo, listaCodigo)) {
            System.out.println("Código repetido");
        } else {
            this.codigo = codigo;
            listaCodigo.add(codigo);
        }
    }

    public String obtenerInformacion() {
        return "Doctor: " + nombre + " | Especialidad: " + especialidad + " | Código: " + codigo;
    }
}
