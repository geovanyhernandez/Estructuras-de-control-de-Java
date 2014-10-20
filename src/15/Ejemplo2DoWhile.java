 /*
 * Programa que lee un número entre 1 y 10 ambos incluidos
 */

//importa las clases que permiten acceso al sistema.
import java.util.*; 
// clase principal del programa.
public class Ejemplo2DoWhile {
//punto de inicio de programa 
    public static void main(String[] args) {
//difinimos n como int.
        int n;
//clase Scanner para recoger lo que introduzca del teclado y le llamamos sc
        Scanner sc = new Scanner( System.in );
       	//mientras se cumpla la condicion while se ejecutara el do
	 do {
//para mostrar lo que esta dentro del parentisis en pantalla.
            System.out.print("Escribe un número entre 1 y 10: ");
//asignamos el numero intruducido a n
            n = sc.nextInt();
        }
//entra al while si n es menor que uno y n es mayor de 10.
	while (n<1 || n >10);
//para mostrar lo que esta dentro del parentisis en pantalla.
        System.out.println("Ha introducido: " + n); 
 }
}
