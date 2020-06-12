
package clase2;


public class Clase2 {
/* Este programa calcula el sueldo en base a la cantidad de las trabajadas
  Donde hasta 40 horas el valor es de $16 para cada una, y luego las excedentes 
    de 40 tienen un valor de $20 cada una.  
*/
    public static void main(String[] args) {
        
        int horasTrabajadas=41; // Valor que vamos modificando
        int horasExtras=0; // La inicio con un valor pues la utilizo en fórmulas
        int precio1=16;
        int precio2=20;
        int Sueldo;
        int SueldoExtra=0;
        
        if (horasTrabajadas<=40){ //Condición de sueldo básico
            Sueldo=horasTrabajadas*precio1;
        }
        else {                  // Se ejecuta cuando hay más de 40 horas
            horasExtras=horasTrabajadas-40; // Calculo horas excedentes
            SueldoExtra=(horasExtras*precio2);  // El valor por horas extras
            Sueldo=(horasTrabajadas*40)+SueldoExtra; // Sumo el básico y extras
            
            
        }
        
        
        System.out.println("Usted trabajó " +horasTrabajadas+ " horas , por éso su Sueldo es = $" +Sueldo+ " del cual tiene en horas Extras = $" + SueldoExtra);
        
    }

}
