// Calcular la hipotenusa de un triangulo rectangulo

import java.util.Scanner;

public class _p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        int longitudLado1, longitudLado2;
        double hipotenusa;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame la longitud del lado 1: "); longitudLado1 = obj.nextInt();
        System.out.print("Dame la longitud del lado 2: "); longitudLado2 = obj.nextInt();
        
        hipotenusa = Math.sqrt(longitudLado1 * longitudLado1 + longitudLado2 * longitudLado2);

        System.out.println(String.format("La hipotenusa de %d y %d es %.2f",longitudLado1,longitudLado2,hipotenusa));

        obj.close();
        
    }
}
