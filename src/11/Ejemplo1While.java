 /*
 * Programa que lee números hasta que se lee un negativo y muestra la
 * suma de los números leídos
 */
import java.util.*;//importa las clases que permiten acceso al sistema
public class Ejemplo1While {// clase principal del programa.
    public static void main(String[] args) {//punto de inicio de programa 
        int suma = 0, num; //definimos num como int. suma le damos el valor de 0,
        Scanner sc = new Scanner(System.in);//clase Scanner para recoger lo que introduzca del teclado.
        System.out.print("Introduzca un número: ");//para mostrar lo que esta dentro del parentisis en pantalla.
        num = sc.nextInt();//el valor introducido en pantalla lo guarada en num.
        while (num >= 0){ // entra el bucle si num es mayor o igual a cero 
               suma = suma + num; //hace una sum del num y cero y la guarda en suma.
               System.out.print("Introduzca un número: "); //para mostrar lo que esta dentro del parentisis en pantalla.
               num = sc.nextInt(); //el valor introducido en pantalla lo guarada en num.
        }
        System.out.println("La suma es: " + suma );//para mostrar lo que esta dentro del parentisis en pantalla y concadena suma  y entra a un bucle que no saldra de el.
    }
}
