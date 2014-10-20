
/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
public class Ejemplo1For {// clase principal del programa.
    public static void main(String[] args) {//punto de inicio de programa 

//declaramos VALOR_INICIAL como tipo int con valor 10 y no se podra cambiar.
        final int VALOR_INICIAL = 10; // limite inf. tabla
//declaramos VALOR_INICIAL como tipo int con valor 100 y no se podra cambiar.
        final int VALOR_FINAL = 100; // limite sup. tabla
//declaramos PASO como tipo int con valor 10 y no se podra cambiar.
        
        final int PASO = 10 ; // incremento
//declaramos fahrenheit como int.
        int fahrenheit;
//declaramos celsius como double.
        double celsius;
//asignamos VALOR_INICIAL A fahrenheit.se repite en el fot
        fahrenheit = VALOR_INICIAL;
//para mostrar lo que esta dentro del parentisis en pantalla.
        System.out.printf("Fahrenheit \t Celsius \n");
//asignamos VALOR_INICIAL a fanherenheit y mientras que fanherenheit sea menor igual a VALOR_FINAL y se le sumara a fahrenheit el valor de paso
        for (fahrenheit = VALOR_INICIAL; fahrenheit <= VALOR_FINAL;
              fahrenheit+= PASO) {
//hara la operacion y le asignara el resultado a celsius
             celsius = 5*(fahrenheit - 32)/9.0;
//para mostrar lo que esta dentro del parentisis en pantalla.
             System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
        }
    }
}

