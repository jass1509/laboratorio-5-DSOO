import javaapplication45.Cita;

public class Validador {
     // Validar que no esté repetido
    public static boolean NoRepetir(String algo, java.util.List<String> Existentes) {
        return Existentes.contains(algo);
    }

    // Validar que la edad sea mayor que 0
    public static boolean edadValida(int edad) {
        return edad > 0;
    }

    // Validar formato de fecha (yyyy-MM-dd)
    public static boolean formatoFechaValido(String fecha) {
        return fecha.matches("\\d{2}-\\d{2}-\\d{4}");
    }

    // Validar formato de hora (HH:mm)
    public static boolean formatoHoraValido(String hora) {
        return hora.matches("\\d{2}:\\d{2}");
    }
}
