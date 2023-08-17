// Calcula el area de in Circulo

import java.util.Scanner;

public class _p02_AreaCirculo {
   public static void main(String[] args) {
        double radio, area;
        Scanner lradio = new Scanner(System.in);

        System.out.println("\nCalculando el area de un circulo\n");
        System.out.println("Dame el Radio ?");
        radio = lradio.nextFloat();

        area = Math.PI * Math.pow(radio,2);

        System.out.println("El circulo con radio "+ radio + " tiene un area de " + area);
    }
}
