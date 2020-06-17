/*Ejercicio 1 de 4 que solicita al usuario un numero y dice su paridad*/
package ejercicio1_1;

import java.util.Scanner;


public class Ejercicio1_1 {


    public static void main(String[] args) {
        
        int n; // Entero que ingresará el Usuario
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Ingrese un entero para conocer su paridad = ");
        n = sc.nextInt();
        
        if (n%2==0){
            
        
            System.out.println("El numero ingresado es PAR ");
        
        }
        else {
            System.out.println("El numero ingresado es IMPAR ");
        }
        
        
    }
    
}