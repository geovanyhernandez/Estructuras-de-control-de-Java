 /*
 * programa que lee un número n y muestra n asteriscos
 */
import java.util.*;//importa las clases que permiten acceso al sistema.
public class Ejemplo2While {// clase principal del programa.
    public static void main(String[] args) {//punto de inicio de programa 
        Scanner sc = new Scanner(System.in);//clase Scanner para recoger lo que introduzca del teclado.
        int n, contador = 0;//definimos n como int y contador como int con valor a 0.
        System.out.print("Introduce un número: ");//para mostrar lo que esta dentro del parentisis en pantalla.
        n = sc.nextInt(); //el valor introducido en pantalla lo guarada en n.
        while (contador < n){ //entra al bucle si contador que es 0 es mayor que el valor que ingresamos
               System.out.println(" * ");//para mostrar lo que esta dentro del parentisis en pantalla cada vez que cumpla el while.
               contador++;//cuando llega aka, aumenta el valor de la variable contador en 1 y lo compara hasta que contador no sea menor que n .
        }
    }
}
