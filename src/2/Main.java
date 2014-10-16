 /*
 * Programa que lee dos números de tipo double por teclado
 * y muestra su suma, resta y multiplicación.
 */
import java.util.*;   //importa todas las clases que permiten acceso al sistema.
public class Main {   // clase principal del programama.
    public static void main(String[] args){ //punto de inicio de programa.
        Scanner sc = new Scanner(System.in); // clase Scanner para recoger lo que introduzca del teclado.
       	double numero1, numero2; //declara numero1 y numero2 como double
        System.out.println("Introduce el primer número:"); //para mostrar lo que esta dentro del parentisis en pantalla.
   
        numero1 = sc.nextDouble();//guarda lo introducido en pantalla en numero1
        System.out.println("Introduce el segundo número:"); //para mostrar lo que esta dentro del parentisis en pantalla.

       numero2 = sc.nextDouble();//guarda lo introducido en pantalla en numero2
       System.out.println("Números introducido: " + numero1 + "  " + numero2);//para mostrar lo que esta dentro del parentisis en pantalla y concadena numero1 y numero2 para mostrarlos.
        System.out.println  
          (numero1 + " + " + numero2 + " = " + (numero1+numero2)); //muestra en pantalla numero1, numero2 y realiza una operacion de suma.
        System.out.println
          (numero1 + " - " + numero2 + " = " + (numero1-numero2));  //muestra en pantalla numero1, numero2 y realiza una operacion de resta.
        System.out.println
          (numero1 + " * " + numero2 + " = " + numero1*numero2);  //muestra en pantalla numero1, numero2 y realiza una operacion de multiplicac.
    }
}
