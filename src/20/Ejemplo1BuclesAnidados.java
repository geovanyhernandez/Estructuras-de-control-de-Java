 /*
 * Programa que dibuja un rectángulo sólido de asteriscos.
 * El número de filas y columnas se pide por teclado
 */
import java.util.*;//importa las clases que permiten acceso al sistema.
// clase principal del programa.
public class Ejemplo1BuclesAnidados {
//punto de inicio de programa 
    public static void main(String[] args) {
//clase Scanner para recoger lo que introduzca del teclado y le llamamos sc.
        Scanner sc = new Scanner(System.in);
//declaramos filas,columnas como int        
	int filas, columnas;
// se ejecuta siempre que entre al while
        do{
//para mostrar lo que esta dentro del parentisis en pantalla.
           System.out.print("Introduce número de filas: ");
//asigna el numero a filas.
           filas = sc.nextInt();
        }
//si filas es menor que uno entra a la condicion.
	while(filas<1);
        //leer número de columnas hasta que sea un número > 0
// se ejecuta siempre que entre al while

	do{
//para mostrar lo que esta dentro del parentisis en pantalla.
           System.out.print("Introduce número de columnas: ");
//asigna el numero introducido a columnas.           
	columnas = sc.nextInt();
        }
// si columnas es menor q 1 entra a la condicion.
	while(columnas<1);
// le asigna 1 al valor de i y si  i es menor que filas le suma 1 cada vez q se repita el bucle
        for(int i = 1; i<=filas; i++){    //filas
//le asigna 1 a j  y si j es menor o igual que las columnas le suma +1 cada vez que se repita el bucle.
            for(int j = 1; j<=columnas; j++){   //columnas
//para mostrar lo que esta dentro del parentisis en pantalla.
                 System.out.print(" * ");
            }
//para mostrar lo que esta dentro del parentisis en pantalla.
            System.out.println();
        }
       
    }
}
