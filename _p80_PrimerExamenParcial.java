//Programa que lleva el control de la inscripción de los participantes y el dinero recaudado.

import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner obj = new Scanner(System.in);
        
        char sexo, tipoParticipante;;
        int totalAlumnos, totalDocentes, totalTrabajadores, totalHombres, totalMujeres, totalParticipantes, totalDineroAlumnos, totalDineroDocentes, totalDineroTrabajadores, totalDineroGeneral, totalEdades;
        totalAlumnos = 0;
        totalDocentes = 0;
        totalTrabajadores = 0;
        totalHombres = 0;
        totalMujeres = 0;
        totalParticipantes = 0;
        totalDineroAlumnos = 0;
        totalDineroDocentes = 0;
        totalDineroTrabajadores = 0;
        totalDineroGeneral = 0;
        totalEdades = 0;

        while (true) {
            System.out.println("Ingrese el nombre del participante : ");
            System.out.println("O escriba ('salir') para termirar el programa");
            String nombre = obj.nextLine();
            
            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.println("Ingrese la edad de " + nombre + ": ");int edad = obj.nextInt();
            
            System.out.println("Ingrese el sexo de " + nombre);
            System.out.print("[M] Masculino\n");
            System.out.print("[F] Femenino\n");
            System.out.print("Elije una opcion: ");
            sexo = Character.toUpperCase(obj.next().charAt(0) );
            
            System.out.println("Ingrese el tipo de participante de " + nombre + " (Alumno/Docente/Trabajador): ");
            System.out.print("[A] Alumno\n");
            System.out.print("[D] Docente\n");
            System.out.print("[T] Trabajador\n");
            System.out.print("Elije una opcion: ");
            tipoParticipante = Character.toUpperCase(obj.next().charAt(0) );

            if (edad >= 18) {
                totalParticipantes++;
                totalEdades += edad;

                if (tipoParticipante != 'A') {
                     totalAlumnos++;
                    totalDineroAlumnos += 50;
                    break;
                }else if (tipoParticipante != 'D') {
                    totalDocentes++;
                    totalDineroDocentes += 80;
                    break;
                }else if (tipoParticipante != 'T') {
                    totalTrabajadores++;
                    totalDineroTrabajadores += 60;
                    break;
                }

                if (sexo == 'M') {
                    totalHombres++;
                } else if (sexo == 'F') {
                    totalMujeres++;
                }
            }
        }

        totalDineroGeneral = totalDineroAlumnos + totalDineroDocentes + totalDineroTrabajadores;
        double promedioEdad = (double) totalEdades / totalParticipantes;

        System.out.println("\nResumen de inscripciones:");
        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres en general: " + totalHombres);
        System.out.println("Total de Mujeres en general: " + totalMujeres);
        System.out.println("Total de todos los participantes: " + totalParticipantes);
        System.out.println("Promedio de la edad de todos los participantes: " + promedioEdad);
        
        System.out.println("\nResumen de dinero recaudado:\n");
        System.out.println("Total dinero recaudado de Alumnos: " + totalDineroAlumnos);
        System.out.println("Total dinero recaudado de Docentes: " + totalDineroDocentes);
        System.out.println("Total dinero recaudado de Trabajadores: " + totalDineroTrabajadores);
        System.out.println("Total dinero en general: " + totalDineroGeneral);
        
        System.out.println("\nMensaje final de despedida:");

        if (totalDineroGeneral < 100) {
            System.out.println("El evento concluye con ganancias BAJAS");
        } else if (totalDineroGeneral >= 100 && totalDineroGeneral < 200) {
            System.out.println("El evento concluye con ganancias MODERADAS");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias");
        }
        obj.close();
    }
    
}