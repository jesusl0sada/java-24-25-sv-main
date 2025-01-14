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
        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe un número");
            String cadenaUsuario = lector.next();
            int numeroUsuario = Integer.parseInt(cadenaUsuario);
            boolean encontrado = false;


            //COMPARAR Y REEMPLAZAR
            // VOLVEMOS A RECORRER EL ARRAY CON UN FOR -> CONTADOR
            // EN CASO DE QUE SE ENCUENTRE Y SEA EL MISMO, ES DECIR SE TIENEN QUE SUSTITUIR.
            for (int x = 0; x < 10; x++) {
                for (int y = 0; y < 10; y++) {
                    if (Matriz[x][y] == numeroUsuario) {
                        Matriz[x][y] = -1;
                        encontrado = true;

                    }
                }
            }
            // EN CASO DE QUE SEAN DISTINTOS.
            if (encontrado == false) { // distinto de !
                System.out.println("El número no pertenece al array.");
            }
// VOLVEMOS A IMPRIMIR LA MATRIZ CON LOS CAMBIOS EFECTUADOS//.
            //PARA ELLO LA TENEMOS QUE VOLVER A RECORRER CON EL CONTADOR
            for (int x = 0; x < 10; x++) {
                for (int y = 0; y < 10; y++) {
                    if (Matriz[x][y] == -1) {
                        System.out.print("X ");
                    } else {
                        System.out.print(Matriz[x][y] + " ");
                    }
                }
                    System.out.println("");
                }
            }
        lector.close();
    }
}





