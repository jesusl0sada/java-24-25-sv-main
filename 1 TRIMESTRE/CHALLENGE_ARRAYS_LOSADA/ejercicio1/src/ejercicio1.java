import java.util.Random;

// EJERCICIO 1: Array de 10 dimensiones con números aleatorios.
public class ejercicio1 {
    static Random numerosarrayrandom= new Random();
    public static void main(String[] args) {

    int Array[] = new int [10]; //SE DEFINE ARRAY CON int array[] = new int
            for (int i = 0; i < 10; i++) {
                Random numerosarrayrandom= new Random(); // para el azar ponemos new también y para las arrays
                Array[i]=numerosarrayrandom.nextInt(10); //hemos definido antes los aleatorios y para llenar el array de aleatorios, metemos la asignación que le hemos dado al random .nextInt, el valor entre paréntesis es el bound, hasta donde es el azar.
            }
        for (int i = 0; i < 10; i++) { // tienes que volverlo a recorrer para imprimirlo.
            System.out.print(Array[i] + " ");
        }
        System.out.println(" ");
        }
    }

