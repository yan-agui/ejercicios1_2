
package tarea2_ejercicio4;

import java.util.Scanner;


public class Tarea2_ejercicio4 {

    public static void main(String[] args) {
        // pedir 3 numeros y mostrarlos ordenados de mayor a menor 
        
        Scanner sp   = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int numero1= sp.nextInt();
        System.out.println("Ingrese segundo numero");
        int numero2 = sp.nextInt();
        System.out.println("Ingrese tercer numero");
        int numero3 = sp.nextInt();
        if (numero1>numero2){
            if(numero1>numero3){
             if (numero2>numero3){
                    System.out.println(numero1+" "+numero2+" "+numero3 );
                       
        }else {
                 if  (numero2 >numero3){
                     if (numero1 > numero3){
                 }
                System.out.println(numero2+" "+numero1+" "+numero3);
                     System.out.println(numero2+" "+numero3+" "+numero1);
                 }
             }else{ 
                     System.out.println(numero2+" "+numero3+" "+numero1);
             }
            }else {
                    System.out.println(numero2+" "+numero1+" "+numero3);
            }
                    } else{
            System.out.println(numero3+" "+numero2+" "+numero1);
                
                
                
        
            }
            
        }
        
    }
    
}
