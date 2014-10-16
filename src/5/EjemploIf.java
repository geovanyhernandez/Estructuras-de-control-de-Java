 /*
 * programa que pide un número por teclado y calcula si es par o impar
 */
import java.util.*;  //importa todas las clases que permiten acceso al sistema.
public class EjemploIf { // clase principal del programa.
    public static void main(String[] args) { //punto de inicio de programa.
        Scanner sc = new Scanner(System.in); // clase Scanner para recoger lo que introduzca del teclado.
        int num;      //declaramos num como int.
        System.out.println("Introduzca numero: ");//para mostrar lo que esta dentro del parentisis en pantalla.
        num = sc.nextInt();//el valor introducido en pantalla lo guarada en num.
        if ((num%2)==0)// si cumple la condicion num porcentaje2 es igual a 0 entonces entra al if.
           System.out.println("PAR");//para mostrar lo que esta dentro del parentisis en pantalla.
        else //si no cumple la condicion del if que haga esto.
            System.out.println("IMPAR");//para mostrar lo que esta dentro del parentisis en pantalla.
    }
}
