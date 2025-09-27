package src;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
       // Enunciado Pide tres notas a, b, c en escala 0.0–10.0. Calcula el promedio con dos decimales y muestra:

       //Promocionado si promedio ≥ 7.0
       //Regular si 4.0 ≤ promedio < 7.0
       //Reprobado si promedio < 4.0
       //Validación: cada nota debe estar en [0.0, 10.0]. Si alguna no lo está, imprime Nota invalida y termina el ejercicio.

       Scanner sc = new Scanner(System.in);
       double nota1 = 0.0;
       double nota2 = 0.0;
       double nota3 = 0.0;
       final double CONDICION = 4.0;
       String respuesta;

       double promedio = 0.0;
       double suma = 0.0;
       final double PROMOCIONADO = 7.0;

       System.out.println("Ingresar la nota 1:");
       nota1 = sc.nextDouble();
       System.out.println("Ingresar la nota 2:");
       nota2 = sc.nextDouble();
       System.out.println("Ingresar la nota 3:");
       nota3 = sc.nextDouble();
       if (nota1 >= 0.0 & nota1 <= 10.0) {
        if (nota2 >= 0.0 & nota2 <= 10.0) {
            if (nota3 >= 0.0 & nota3 <= 10.0) {
                suma = nota1 + nota2 + nota3;
                promedio = suma / 3;

                if (promedio >= PROMOCIONADO) {
                    respuesta = "Promocionado";
                    System.out.println( "El promedio es:" + promedio + " " + respuesta);

                    
                } else if ( promedio >= CONDICION & promedio < PROMOCIONADO){
                    respuesta = "Regular";
                    System.out.println( "El promedio es:" + promedio + " " + respuesta);

                    
                }else {
                    respuesta = "Reprobado";
                    System.out.println( "El promedio es:" + promedio + " " + respuesta);

                }
                
            }else{
                System.out.println("Nota fuera de rango");
                
            }
            
        }else {
            System.out.println("Nota fuera de rango");
        }
       }else {
        System.out.println("Nota fuera de rango");
       } 
        
       

       

       sc.close();
    }
}
