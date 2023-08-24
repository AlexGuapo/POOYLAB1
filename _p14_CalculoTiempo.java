// Calcular el Tiempo

import java.util.Scanner;

public class _p14_CalculoTiempo {
    public static void main(String[] args) {
        int dia, hora, minuto, segundo;
        Scanner obj = new Scanner(System.in);

        System.out.print("Ingresa los dias: "); dia = obj.nextInt();

        hora = dia * 24; 
        minuto = hora * 60; 
        segundo = minuto * 60;

        System.out.println(String.format("En %d Dias hay:", dia));
        System.out.print(String.format("%d Horas.\n%d Minutos.\n%d Segundos.", hora, minuto,segundo));

        obj.close();
    }
}
