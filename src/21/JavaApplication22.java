 /*
 * Programa que muestra una tabla con las potencias de x (x x2 x3 x4)
 * para valores de x desde 1 hasta XMAX
 */
public class JavaApplication22 {// clase principal del programa.
    public static void main(String[] args) {//punto de inicio de programa 
//declaramos XMAX el valor de 10 y no se puede cambiar en nimgun momento.
        final int XMAX = 10;
//declaramos x,n como int.
        int x, n;
        //mostrar la cabecera de la tabla con espacio %10.
        System.out.printf("%10s%10s%10s%10s%n", "x","x^2","x^3","x^4");
//asigna el valor de 1 a x y si que es menor o igual XMAX le suma 1 en cada vuelta 
        for (x = 1; x <= XMAX; x++){   //filas
//asigna 1 a n y si es menor o igual a 4 le suma 1 en cada vuelta.
             for (n = 1; n <= 4; n++){   //columnas
//para mostrar lo que esta dentro del parentisis en pantalla y imprime espacio %10s y eleva x a n 
                  System.out.printf("%10.0f", Math.pow(x,n));
             }
//para mostrar lo que esta dentro del parentisis en pantalla.
             System.out.println();
        }
    }
}
