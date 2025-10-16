import java.util.List;

public class Validador {

    public static boolean edadValida(int edad) {
        return edad > 0 && edad < 120;
    }

    public static boolean formatoFechaValido(String fecha) {
        return fecha.matches("\\d{2}-\\d{2}-\\d{4}");
    }

    public static boolean formatoHoraValido(String hora) {
        return hora.matches("\\d{2}:\\d{2}");
    }

    public static boolean noRepetir(String valor, List<String> existentes) {
        return !existentes.contains(valor);
    }
}
