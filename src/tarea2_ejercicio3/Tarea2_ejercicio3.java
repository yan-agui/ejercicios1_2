
package tarea2_ejercicio3;

import java.util.Scanner;

public class Tarea2_ejercicio3 {

  
    public static void main(String[] args) {
        // pedir 2 numeros y mostrarlos de mayor a menor 
        Scanner sp  = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int numero1 = sp.nextInt();
        System.out.println("Ingrese segundo numero");
        int numero2 = sp.nextInt();
        if (numero1==numero2 ){
            System.out.println("Los numeros son iguales");
        }else if (numero1>numero2){
                    System.out.println(numero1 + "  "+ numero2);
        }else{
            System.out.println(numero2 +"  "+numero1);
        }
              