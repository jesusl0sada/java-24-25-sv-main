//MATRIZ 10X10 CON ALEATORIOS
//HERRAMIENTAS:
import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random numerosrandommatriz = new Random();
        int Matriz[][] = new int[10][10]; // creamos la matriz, la recorremos y dentro la llenamos de números random.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                Matriz[i][j] = numerosrandommatriz.nextInt(10);
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println("");
        }
        String cadenaUsuario = "";
        for (int i = 0; i <3; i++) {
            System.out.println("Escribe un número");
            cadenaUsuario = lector.next();
            for (int i = 0; i < 10 ; i++); {
                if (numerosrandommatriz == cadenaUsuario);

                for (int j = 0; j <10 ; j++) {
                    if (numerosrandommatriz == cadenaUsuario); {

                    }
                }
            }
        }
    }
}
