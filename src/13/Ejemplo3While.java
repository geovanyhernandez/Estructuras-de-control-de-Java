 /*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */

// clase principal del programa.
 public class Ejemplo3While {
    
	//punto de inicio de programa 
	public static void main(String[] args) { 

//definimos una variable de tipo int y le asignamos el valor 10 que no se podra modificar
        final int VALOR_INICIAL = 10;  // limite inf. tabla
//definimos una variable de tipo int y le asignamos el valor valor 100 que no se podra modificar
	final int VALOR_FINAL = 100;  // limite sup. tabla
//definimos una variable de tipo int y le asignamos el  valor 10 que no se podra modificar
        final int PASO = 10 ; // incremento
//difinimos una variable y de tipo int.
	int fahrenheit;
//difinimos una variable y de tipo double.
        double celsius;
//asignamos a fahrenheit el valor de la variable VALOR_INICIAL
        fahrenheit = VALOR_INICIAL;
//muestra en pantalla lo que esta en parentesis
        System.out.printf("Fahrenheit \t Celsius \n");
//entra al while si valor inicial es igual o menor a fahrenheit
        while (fahrenheit <= VALOR_FINAL ){
//asignamos a celsius el resultado de la operacion.	
               celsius = 5*(fahrenheit - 32)/9.0;
//para mostrar lo que esta dentro del parentisis en pantalla.
               System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
//suma el valor de las 2 variables, sumando en cada vuelta el valor de paso que es 10  y lo guarda en fahrenheit hasta que sea mayor de 100 y no entra al bucle                
		fahrenheit += PASO;
        }
    }
}
