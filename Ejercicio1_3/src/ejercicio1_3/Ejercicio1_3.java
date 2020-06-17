/*Megaplaza, hace descuento del 20% si su compra supera los $300*/
package ejercicio1_3;

import java.util.Scanner;


public class Ejercicio1_3 {


    public static void main(String[] args) {
       
        double compra;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Ingrese el monto de su compra = $");
        compra = sc.nextDouble();
        
        // Análisis del descuento
        if (compra>0 && compra<=300) {
            
            System.out.println("Su compra no incluye descuento y pagará = $"+compra);
            
        } else if (compra>300) {
            compra = compra - (compra*0.2); // Descuento del 20%
            System.out.println("Felicitaciones! su compra es con 20% de descuento y pagará = $"+compra);
            
        } else {
            System.out.println("Error, no ingresó un valor de compra válido");
        } 
        
    }

}
