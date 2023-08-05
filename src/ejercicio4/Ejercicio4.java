package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

 
    public static void main(String[] args) {
        Scanner sp  =new Scanner(System.in);
        System.out.println("Ingrese Temperatura");
        System.out.println("La temperatura en FAH es: "+(32+(9*(sp.nextInt()/5))));
        
        
        
    }
    
}

