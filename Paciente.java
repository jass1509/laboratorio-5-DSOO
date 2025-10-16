import java.util.ArrayList;

public class Paciente {
    private String codigo;
    private String nombre;
    private int edad;
    private String documento;

    private static ArrayList<String> listaDocumento = new ArrayList<>();
    private static ArrayList<String> listaCodigo = new ArrayList<>();

    public Paciente(String codigo, String nombre, int edad, String documento) {
        this.nombre = nombre;
        setEdad(edad);
        setCodigo(codigo);
        setDocumento(documento);
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getDocumento() { return documento; }

    public void setEdad(int edad) {
        if (!Validador.edadValida(edad)) {
            System.out.println("Edad no válida");
        } else {
            this.edad = edad;
        }
    }

    public void setCodigo(String codigo) {
        if (!Validador.noRepetir(codigo, listaCodigo)) {
            System.out.println("Código repetido");
        } else {
            this.codigo = codigo;
            listaCodigo.add(codigo);
        }
    }

    public void setDocumento(String documento) {
        if (!Validador.noRepetir(documento, listaDocumento)) {
            System.out.println("Documento repetido");
        } else {
            this.documento = documento;
            listaDocumento.add(documento);
        }
    }

    public String obtenerInformacion() {
        return "Paciente: " + nombre + " | Edad: " + edad + " | DNI: " + documento;
    }
}

