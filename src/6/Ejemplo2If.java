 /*
 * Programa que muestra un saludo distinto según la hora introducida
 */
import java.util.*; //importa todas las clases que permiten acceso al sistema.
public class Ejemplo2If {  // clase principal del programa.
    public static void main(String[] args) { //punto de inicio de programa.
      Scanner sc = new Scanner(System.in); // clase Scanner para recoger lo que introduzca del teclado.
      int hora; //declaramos hora como int.
      System.out.println("Introduzca una hora (un valor entero): ");//para mostrar lo que esta dentro del parentisis en pantalla.
      hora = sc.nextInt(); //guardamos el valor introducido en pantalla en hora.
      if (hora >= 0 && hora < 12) //si cumple la condicion de hora mayor o igual de cero y menor que 12 entonces entra al if.
          System.out.println("Buenos días");//para mostrar lo que esta dentro del parentisis en pantalla.
      else if (hora >= 12 && hora < 21) //si cumple la condicion de hora mayor o igual a 12 y menor que 21 entonces entra al else if.
           System.out.println("Buenas tardes");//para mostrar lo que esta dentro del parentisis en pantalla.
      else if (hora >= 21 && hora < 24) //si cumple la condicion de hora mayor o igual a 21 y menor que 24 entonces entra al else if.
            System.out.println("Buenas noches");//para mostrar lo que esta dentro del parentisis en pantalla.
      else //si no cumple la condicion de los if y else if entonces entra al else.
            System.out.println("Hora no válida"); //para mostrar lo que esta dentro del parentisis en pantalla.
    }
}
