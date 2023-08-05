
package tarea2_ejercicio5;

import java.util.Calendar;
import java.util.Scanner;


public class Tarea2_ejercicio5 {

    
    public static void main(String[] args) {
        // pedir el dia mes y ano e indicar si la fecha es correcta con meses de 28,30,31 sin anos bisiestos
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el día:");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año:");
        int anio = sc.nextInt();
        
        
        
      
        Calendar fecha = Calendar.getInstance();
        fecha.set(anio, mes - 1, dia); 
        

        int maxDias = fecha.getActualMaximum(Calendar.DAY_OF_MONTH);
   
        
        
        if (dia > 0 && dia <= maxDias) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha es incorrecta");
        }
   
    }
}
    
    

