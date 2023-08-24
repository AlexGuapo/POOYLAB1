// Calcular una temperatura de grados Fahrenheit a grados Celsius

import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        int fahrenheit;
        double celsius;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Ingresa los grados Fahrenheit: "); fahrenheit = obj.nextInt();
        
        celsius = (fahrenheit - 32) * (5.0 / 9.0);

        System.out.println(String.format("%d° Fahrenheit son equibalentes a %.2f° Celsius",fahrenheit,celsius));

        obj.close();

    }
}
