/*
 * Programa que pide dos números y un operador y muestra el resultado
 */
import java.util.*; //importa las clases que permiten acceso al sistema.
import java.io.*; //importa las clases que nos permite gestionar las entradas y salidas del sistema.
public class Ejemplo1Switch { // clase principal del programa.
    public static void main(String[] args) throws IOException{ //punto de inicio de programa y arranca una exepcion en la que esta definida en el package java.io para qye exceptuelos errores de entra y salida
        int A,B, Resultado = 0 ; //difinimos las variables A y B como integer y le damos el valor de 0.
        char operador; //definimos operador como char.
        boolean calculado = true; //difine calculodo como boolean con el valor true q es 0 true y 1 false. 
        Scanner sc = new Scanner(System.in);//clase Scanner para recoger lo que introduzca del teclado.
        System.out.print("Introduzca un numero entero:");//para mostrar lo que esta dentro del parentisis en pantalla.
        A = sc.nextInt();//el valor introducido en pantalla lo guarada en A.
        System.out.print("Introduzca otro numero entero:");//para mostrar lo que esta dentro del parentisis en pantalla.
        B = sc.nextInt();//el valor introducido en pantalla lo guarada en B.
        System.out.print("Introduzca un operador (+,-,*,/):");//para mostrar lo que esta dentro del parentisis en pantalla.
        operador = (char)System.in.read();//guardamos el operador ingresa en la variable operador, El método read() acepta un byte proveniente del teclado y retorna un entero,Char convierte el entero  obtenido de read() en un caracter.
        switch (operador) {//switch es una instruccion  para comparar una lista multiple posibilidades solo se utiliza con int o char.
                case '-' : Resultado = A - B; //si el operador es -  nos hara la operacion A - B y la guardara en Resultado.
                           break; //corta la ejecucion y no evalua las siguientes.
                case '+' : Resultado = A + B; //si el operador es +  nos hara la operacion A + B y la guardara en Resultado.
                           break; //corta la ejecucion y no evalua las siguientes.
                case '*' : Resultado = A * B;  //si el operador es *  nos hara la operacion A * B y la guardara en Resultado.
                           break; //corta la ejecucion y no evalua las siguientes.
                case '/' : if(B!=0)  //si el operador es / y si la la variable B es diferente de 0  entonces entra al if.
                              Resultado = A / B; //hara la division A / B y la guarda en Resultado
                           else{ // si no cumplio las condiciones del if entra al else.
                              System.out.println("\nNo se puede dividir por cero");//para mostrar lo que esta dentro del parentisis en pantalla.
                              calculado = false;// le damos false a la variable calculado
                           }
                           break; //corta la ejecucion y no evalua las siguientes.
                default : System.out.println("\nOperador no valido");//si no se ingresa uno de los operadores  (+,-,*,/) y mostrara lo que esta dentro del parentisis en pantalla.
                          calculado = false; // le dara false a la variable calculado.
                         
        }
        if(calculado){ //si la variable se mantien en true como la hemos declarado en el principio entrara al if
            System.out.println("\nEl resultado es: " + Resultado);  //mostrara lo que esta dentro del parentisis en pantalla.
        }
    }
}

