// Convertir pesos a dolares

import java.util.Scanner;

public class _p15_ConvertirADolares {
    public static void main(String[] args) {
        double cantidadPesos, cotizacionDolar, equivalenteDolares;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad en pesos: "); cantidadPesos = scanner.nextDouble();
        System.out.print("Ingresa la cotización del dólar: "); cotizacionDolar = scanner.nextDouble();
        
        equivalenteDolares = cantidadPesos / cotizacionDolar;

        System.out.println(String.format("%.2f pesos equivalen a %.2f dólares", cantidadPesos, equivalenteDolares));

        scanner.close();
    }
}
