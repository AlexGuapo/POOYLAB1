// Calcular el volumen de un cilindro

import java.util.Scanner;

public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        int radio, altura;
        double volumen;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame el radio: "); radio = obj.nextInt();
        System.out.print("Dame la altura: "); altura = obj.nextInt();

        volumen = Math.PI * (radio * radio) * altura;

        System.out.println(String.format("El volumen del cilindro con altura %d y radio %d es de %.2f", altura, radio, volumen));

        obj.close();
    }
}
