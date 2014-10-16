/*
 * Programa que pide un número de mes y muestra el nombre correspondiente
 */
import java.util.*; //importa todas las clases que permiten acceso al sistema.
public class Ejemplo0Switch {  // clase principal del programa.
    public static void main(String[] args) {//punto de inicio de programa.
        int mes; //declaramos mes como int.
        Scanner sc = new Scanner(System.in);// clase Scanner para recoger lo que introduzca del teclado.
        System.out.print("Introduzca un numero de mes: ");//para mostrar lo que esta dentro del parentisis en pantalla.
        mes = sc.nextInt();//guardamos el valor introducido en pantalla en mes.
        switch (mes) // estructuramos para comparar una lista multiple posibilidades solo se utiliza con int o char.
        {
                case 1: System.out.println("ENERO"); //si la condicion case es igual al switch muestra el system.out.printl en pantalla
                           break; //corta la ejecucion y no evalua las siguientes.
                case 2: System.out.println("FEBRERO");
                           break;
                case 3: System.out.println("MARZO");
                           break;
                case 4: System.out.println("ABRIL");
                           break;
                case 5: System.out.println("MAYO");
                           break;
                case 6: System.out.println("JUNIO");
                           break;
                case 7: System.out.println("JULIO");
                           break;
                case 8: System.out.println("AGOSTO");
                           break;
                case 9: System.out.println("SEPTIEMBRE");
                           break;
                case 10: System.out.println("OCTUBRE");
                             break;
                case 11: System.out.println("NOVIEMBRE");
                             break;
                case 12: System.out.println("DICIEMBRE");
                             break;
                default : System.out.println("Mes no válido"); // si la variable switch no coincide con el mes entoces entra al defaul                     
        }
    }
}

