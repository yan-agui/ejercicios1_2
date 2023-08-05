
package tarea2_ejercicio2;

import java.util.Scanner;


public class Tarea2_ejercicio2 {


    public static void main(String[] args) {
        // Pedir un numero he indicar si es positivo o negativo
        Scanner sp  = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int numero  = sp.nextInt();
        if (numero>0)
            System.out.println("El numero es positivo");
        else{
            System.out.println("El numero es negativo");
        }
    }
    
}
