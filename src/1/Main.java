import java.util.*; //importa las clases que permiten acceso al sistema.
public class Main {  // clase principal del programam.
    public static void main(String[] args){ //punto de inicio de programa.
        //declaración de variables
        int n1, n2;        //declaramos n1, n2 como enteros.
        Scanner sc = new Scanner(System.in); // clase Scanner para recoger lo que introduzca del teclado.
        //leer el primer número
        System.out.println("Introduce un número entero: "); //para mostrar lo que esta dentro del parentisis en pantalla.
        n1 = sc.nextInt();      //lee un entero por teclado   //el valor introducido en pantalla lo guarada en n1.
        //leer el segundo número
        System.out.println("Introduce otro número entero: "); //para mostrar lo que esta dentro del parentisis en pantalla.
        n2 = sc.nextInt();      //lee un entero por teclado    //el valor introducido en pantalla lo guarada en n1.
       
        //mostrar resultado
        System.out.println("Ha introducido los números: " + n1 + " y " + n2); //muestra lo que esta dentro del parentesis y concadena n1 y n2 para mostralos en pantalla.
    }
}
