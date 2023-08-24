// Calcular el 3er ángulo de un triángulo

import java.util.Scanner;

public class _p11_CalcularAngulo {
    public static void main(String[] args) {
        int angulo1, angulo2;
        double angulo3;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame el primer angulo: "); angulo1 = obj.nextInt();
        System.out.print("Dame el segundo angulo: "); angulo2 = obj.nextInt();

        angulo3 = 180 - (angulo1 + angulo2);

        System.out.println(String.format("El tercer angulo es de %.2f°",angulo3));

        obj.close();

    }
}
