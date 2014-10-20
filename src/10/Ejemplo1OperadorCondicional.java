
 /*
  * programa que pide un número por teclado y calcula si es par o impar
  */
import java.util.*;//importa las clases que permiten acceso al sistema.
public class Ejemplo1OperadorCondicional {// clase principal del programa.
    public static void main(String[] args) {//punto de inicio de programa 
        Scanner sc = new Scanner(System.in);//clase Scanner para recoger lo que introduzca del teclado.
        int num;    //definimos num como int.  
        System.out.println("Introduzca numero: ");//para mostrar lo que esta dentro del parentisis en pantalla.
        num = sc.nextInt();//el valor introducido en pantalla lo guarada en num.
        System.out.println((num%2)==0 ? "PAR" : "IMPAR");//para mostrar lo que esta dentro del parentisis en pantalla y hacer el calculo si es par o impar si es par sera = 0 y nos mostrara par en pantalla y si no es igual a cero nos mostrara impar.
    }
}

