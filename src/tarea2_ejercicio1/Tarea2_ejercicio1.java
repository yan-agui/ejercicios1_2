

package tarea2_ejercicio1;

import java.util.Scanner;


public class Tarea2_ejercicio1 {


    public static void main(String[] args) {
        // programa que pida 2 numeros y nos indiquen si son iguales o no 
        
        Scanner sp  = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int numero1 = sp.nextInt();
        System.out.println("Ingrese segundo numero" );
        int numero2 = sp.nextInt();
        if (numero1==numero2){
            System.out.println("Los numeros son iguales");
            
        }else {
            System.out.println("Los numeros no son iguales");
        }