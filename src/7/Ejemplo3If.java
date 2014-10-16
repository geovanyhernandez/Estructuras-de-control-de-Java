/*
 * programa que lee una nota y escribe la calificación correspondiente
 */
import java.util.*; //importa todas las clases que permiten acceso al sistema.
public class Ejemplo3If { // clase principal del programa.
    public static void main(String[] args) { //punto de inicio de programa.
      Scanner sc = new Scanner(System.in); // clase Scanner para recoger lo que introduzca del teclado.
      double nota; //declaramos nota como double.
      System.out.println("Introduzca una nota entre 0 y 10: ");//para mostrar lo que esta dentro del parentisis en pantalla.
      nota = sc.nextDouble(); //guardamos el valor introducido en pantalla en nota.
      System.out.println("La calificación del alumno es ");//para mostrar lo que esta dentro del parentisis en pantalla.
      if(nota < 0 || nota > 10)  //si cumple la condicion de nota menor que cero o nota mayor que 10 entra al if.
         System.out.println("Nota no válida");//para mostrar lo que esta dentro del parentisis en pantalla.
      else if(nota==10) //si cumple la condicion de nota es igual a 10 entra al else if.
           System.out.println("Matrícula de Honor");//para mostrar lo que esta dentro del parentisis en pantalla.
      else if (nota >= 9)  //si cumple la condicion de nota es mayor o igual a 9 entra al else if.
           System.out.println("Sobresaliente");  //si cumple la condicion de nota es mayor o igual a 9 entra al else if.
      else if (nota >= 7) //si cumple la condicion de nota es mayor o igual a 7 entra al else if.
           System.out.println("Notable");//para mostrar lo que esta dentro del parentisis en pantalla.
      else if (nota >= 6) //si cumple la condicion de nota es mayor o igual a 6 entra al else if.
           System.out.println("Bien");//para mostrar lo que esta dentro del parentisis en pantalla.
      else if (nota >= 5)//si cumple la condicion de nota es mayor o igual a 5 entra al else if.
           System.out.println("Suficiente");//para mostrar lo que esta dentro del parentisis en pantalla.
      else //si no cumplio nimguna de las condicones del if o else if entonces entra al else
           System.out.println("Suspenso");//para mostrar lo que esta dentro del parentisis en pantalla.
    }
}

