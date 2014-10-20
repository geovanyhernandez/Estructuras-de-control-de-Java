 /*
 * Programa que obliga al usuario a introducir un número menor que 100
 */

//importa las clases que permiten acceso al sistema.
import java.util.*;
// clase principal del programa.
public class Ejemplo1DoWhile {

//clase Scanner para recoger lo que introduzca del teclado.
    public static void main(String[] args) {
//asignamos valor como int.
        int valor;
//clase Scanner para recoger lo que introduzca del teclado y la nombramos in
        Scanner in = new Scanner( System.in );
//para mostrar lo que esta dentro del parentisis en pantalla.
        do {
            System.out.print("Escribe un entero < 100: ");
//asignamos a valor el numero ingresado en pantalla.           
	    valor = in.nextInt();
        }
//entra al while si el valor es mayor o igual que 100.
	while (valor >= 100);
//para mostrar lo que esta dentro del parentisis en pantalla y concadena el valor.
        System.out.println("Ha introducido: " + valor);
    }
}
