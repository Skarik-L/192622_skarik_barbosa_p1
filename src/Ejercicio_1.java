package src;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        //Enunciado Solicita dos números reales x y y.

        //Si x >= y: muestra la suma (x + y) y la diferencia (x - y).
        //Si x < y: muestra el producto (x * y) y la división (x / y, del primero respecto al segundo).
        //Si debes dividir y y == 0, imprime: No se puede dividir entre cero y no intentes la división.

        Scanner sc = new Scanner(System.in);
        double numero1 = 0.0;
        double numero2 = 0.0;
        double suma = 0;
        double resta = 0;
        double producto = 0;
        double division = 0;


        System.out.println("Ingresar el numero 1:");
        numero1 = sc.nextDouble();

        System.out.println("Ingresar el numero 2:");
        numero2 = sc.nextDouble();

        if ( numero1 >= numero2) {
            suma = numero1 + numero2;
            resta = numero1 - numero2;
            System.out.println("La suma es:" + suma);
            System.out.println("La resta es:" + resta);
        } else {
            
            if (numero2 == 0) {
                System.out.println("No se puede dividir entre 0");
            } else {
                producto = numero1 * numero2;
                division = numero1 / numero2;
            }
            System.out.println("El producto es:" + producto);
            System.out.println("La division es:" + division);
        }
       

        sc.close();
    }
}
