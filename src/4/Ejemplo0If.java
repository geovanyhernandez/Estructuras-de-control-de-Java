 /*
 * Programa que pide una nota por teclado y muestra si se ha aprobado o no
 */
import java.util.*;   //importa todas las clases que permiten acceso al sistema.
public class Ejemplo0If {  // clase principal del programa.
    public static void main( String[] args ){ //punto de inicio de programa.
        Scanner sc = new Scanner( System.in );// clase Scanner para recoger lo que introduzca del teclado.
        System.out.print("Nota: ");//para mostrar lo que esta dentro del parentisis en pantalla.
        int nota = sc.nextInt(); //declara nota como int y guarda lo introducido en pantalla en nota.
        if (nota >= 5 ){ //si nota cumple la condicion de ser mayor o igual de 5 entonces que entre en el if.
            System.out.println("Enorabuena!!");//para mostrar lo que esta dentro del parentisis en pantalla.
            System.out.println("Has aprobado");//para mostrar lo que esta dentro del parentisis en pantalla.
        }
        else //si  nota  no cumplio la condicion de if entonces entra en else.
            System.out.println("Lo Siento, has suspendido");//para mostrar lo que esta dentro del parentisis en pantalla.

    }
}
