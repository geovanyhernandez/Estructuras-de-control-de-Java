 /*
 * Programa que pide una nota por teclado y muestra un mensaje si la nota es
 * mayor o igual que 5
 */
import java.util.*;//importa todas las clases que permiten acceso al sistema.
public class Ejemplo0If {  // clase principal del programama.
    public static void main( String[] args ){//punto de inicio de programa.
        Scanner sc = new Scanner( System.in );// clase Scanner para recoger lo que introduzca del teclado.
        System.out.print("Nota: ");//para mostrar lo que esta dentro del parentisis en pantalla.
        int nota = sc.nextInt(); //declaramos la variable nota y guardamos en nota lo introducido en pantalla.
        if (nota >= 5 ){ // establecemos una condicion que si nota es mayor o igual de 5 haga lo sig y si no cumple finalize el programa.
            System.out.println("Enorabuena!!"); //para mostrar lo que esta dentro del parentisis en pantalla.
            System.out.println("Has aprobado"); //para mostrar lo que esta dentro del parentisis en pantalla.
        }
    }
}
