//MATRIZ 10X10 CON ALEATORIOS
//HERRAMIENTAS:
import java.util.Random;

public class ejercicio2 {
    public static void main(String[] args) {
        int Matriz[][] = new int[10][10]; // creamos la matriz, la recorremos y dentro la llenamos de números random.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Random numerosrandommatriz = new Random();
                Matriz[i][j] = numerosrandommatriz.nextInt(10);
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}