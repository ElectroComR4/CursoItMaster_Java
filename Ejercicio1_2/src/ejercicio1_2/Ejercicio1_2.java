/*Pide un número del 1 al 12 y entrega el mes correspondiente*/
package ejercicio1_2;

import java.util.Scanner;


public class Ejercicio1_2 {


    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Ingrese un numero del 1 al 12 para conocer su mes = ");
        n = sc.nextInt();
        
        switch (n) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febreo");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break; 
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Error, sólo es válido un entero entre el 1 y 12");
        }
     
    }

}
