/*Calula las tablas */
package ejercicio1_4;

import java.util.Scanner;


public class Ejercicio1_4 {


    public static void main(String[] args) {
        
        int n;
        int i;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Ingrese el entero de la tabla que quiere conocer ");
        n = sc.nextInt();
        
        //Recorrido de la tabla
        for (i = 1; i <=10; i++){
            System.out.println(n+"x"+i+"="+(i*n));
        }
        
    }

}
