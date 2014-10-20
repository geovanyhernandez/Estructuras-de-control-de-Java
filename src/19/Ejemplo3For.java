
/*
 * programa que muestra el valor de a, b y su suma mientras que la suma de
 * ambas es menor de 10. En cada iteración el valor de a se incrementa en
 * 1 unidad y el de b en 2
 */
public class Ejemplo3For {// clase principal del programa.
    public static void main(String[] args) { //punto de inicio de programa
//declaramo a,b como int.
        int a, b;
//asignamos a 1 y a b 2 , sumamos a y b mientras que sea menor q 10 incrementa 1 en a y b le incrementara b= +2 
        for(a = 1, b = 1; a + b < 10; a++, b+=2){
//para mostrar lo que esta dentro del parentisis en pantalla y concadena a ,b y hace la suma de a+b.
            System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a+b));
        }
    }
}

