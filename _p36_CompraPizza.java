// Diseñe un programa que permita procesar la solicitud 

import java.util.Scanner;

public class _p36_CompraPizza {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        char op;
        float totalCompra, descuento, totalCompraDescuento, pizzaCH, pizzaMED, pizzaGDE, precioPizzaCH, precioPizzaMED, precioPizzaGDE;
        Scanner obj = new Scanner(System.in);

        System.out.println("Elija el tamaño de las pizzas:");
        System.out.print("[C] Pizza Chica\n");
        System.out.print("[M] Pizza Mediana\n");
        System.out.print("[G] Pizza Grande\n");
        System.out.print("Elije una opcion: ");
        op = Character.toUpperCase(obj.next().charAt(0) );

        precioPizzaCH = 5; precioPizzaMED = 10; precioPizzaGDE = 20;
        descuento = 0; totalCompra = 0; totalCompraDescuento = 0;

        if (op == 'C') {
            System.out.println("\nPedido de Pizzas chicas\n");
            System.out.print("Ingrese la cantidad de pizzas que desea comprar:"); pizzaCH = obj.nextInt();
            totalCompra = pizzaCH * precioPizzaCH;
            
            if (totalCompra > 2000) {
                descuento = (float) (totalCompra * 0.15);
                totalCompraDescuento = totalCompra - descuento;

                System.out.println("\nTICKET DE COMPRA\n");
                System.out.print(String.format("Total de pizzas: %.2f  \n",pizzaCH));
                System.out.print(String.format("Precio sin descuento: %.2f  \n",totalCompra));
                System.out.print(String.format("Descuento: %.2f  \n",descuento));
                System.out.print(String.format("Precio con descuento: %.2f  \n",totalCompraDescuento));
            }
            else if (totalCompra < 2000) {
                totalCompraDescuento = totalCompra - descuento;

                System.out.println("\nTICKET DE COMPRA\n");
                System.out.print(String.format("Total de pizzas: %.2f  \n",pizzaCH));
                System.out.print(String.format("Precio sin descuento: %.2f  \n",totalCompra));
                System.out.print(String.format("Descuento: %.2f  \n",descuento));
                System.out.print(String.format("Precio con descuento: %.2f  \n",totalCompraDescuento));

            }    
        }
        else if (op == 'M') {
            System.out.println("\nPedido de Pizzas medianas\n");
            System.out.print("Ingrese la cantidad de pizzas que desea comprar:"); pizzaMED = obj.nextInt();
            totalCompra = pizzaMED * precioPizzaMED;
            
            if (totalCompra > 2000) {
                descuento = (float) (totalCompra * 0.15);
                totalCompraDescuento = totalCompra - descuento;

                System.out.println("\nTICKET DE COMPRA\n");
                System.out.print(String.format("Total de pizzas: %.2f  \n",pizzaMED));
                System.out.print(String.format("Precio sin descuento: %.2f  \n",totalCompra));
                System.out.print(String.format("Descuento: %.2f  \n",descuento));
                System.out.print(String.format("Precio con descuento: %.2f  \n",totalCompraDescuento));
            }
            else if (totalCompra < 2000) {
                totalCompraDescuento = totalCompra - descuento;

                System.out.println("\nTICKET DE COMPRA\n");
                System.out.print(String.format("Total de pizzas: %.2f  \n",pizzaMED));
                System.out.print(String.format("Precio sin descuento: %.2f  \n",totalCompra));
                System.out.print(String.format("Descuento: %.2f  \n",descuento));
                System.out.print(String.format("Precio con descuento: %.2f  \n",totalCompraDescuento));

            }
        }
        else if (op == 'G') {
            System.out.println("\nPedido de Pizzas grandes\n");
            System.out.print("Ingrese la cantidad de pizzas que desea comprar:"); pizzaGDE = obj.nextInt();
            totalCompra = pizzaGDE * precioPizzaGDE;
            
            if (totalCompra > 2000) {
                descuento = (float) (totalCompra * 0.15);
                totalCompraDescuento = totalCompra - descuento;

                System.out.println("\nTICKET DE COMPRA\n");
                System.out.print(String.format("Total de pizzas: %.2f  \n",pizzaGDE));
                System.out.print(String.format("Precio sin descuento: %.2f  \n",totalCompra));
                System.out.print(String.format("Descuento: %.2f  \n",descuento));
                System.out.print(String.format("Precio con descuento: %.2f  \n",totalCompraDescuento));
            }
            else if (totalCompra < 2000) {
                totalCompraDescuento = totalCompra - descuento;

                System.out.println("\nTICKET DE COMPRA\n");
                System.out.print(String.format("Total de pizzas: %.2f  \n",pizzaGDE));
                System.out.print(String.format("Precio sin descuento: %.2f  \n",totalCompra));
                System.out.print(String.format("Descuento: %.2f  \n",descuento));
                System.out.print(String.format("Precio con descuento: %.2f  \n",totalCompraDescuento));

            }
        }
        else{
            System.out.println("\nOpcion Invalida \n");
            
        }
    obj.close();    
    }
}
