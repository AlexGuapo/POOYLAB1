//Manda un un saludo a la pantalla

public class _p01_HolaMundo {
    public static void main(String[] args) {
        String compa = "Edgar";
        String carnal = "Panchito";
        String mensaje = String.format("Tanto %s como %s desean aprender Java",compa,carnal);

        System.out.println("Hola Mundo desde el lenguaje Java");
        System.out.println("\nHola compa " + compa + " bienvenido a Java");
        System.out.println("\nHola compa " + carnal + " bienvenido a Java");
        System.out.println("\nMi compa es  " + compa + " mi carnal es " + carnal);
        System.out.println("\n" + mensaje);
    }
}