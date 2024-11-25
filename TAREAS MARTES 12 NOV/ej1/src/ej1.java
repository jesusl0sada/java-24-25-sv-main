import java.util.Arrays;
import java.util.Random;

public class Main {
    static int MAX_FILA = 3; // DEFINIMOS LAS FILAS
    static int MAX_COLUMNA = 9; // DEFINIMOS LAS COLUMNAS
    static int matriz[][] = new int[MAX_FILA][MAX_COLUMNA]; // DEFINIMOS EL ARRAY QUE LUEGO USAREMOS
    public static void inicializarMatriz(){
        Random randomizarnumeros = new Random();
        for (int columna = 0; columna < matriz[0].length; columna++) {
            int min = 10 + (columna * 10); // valor mínimo para la columna actual
            int max = min + 9;     	// valor máximo para la columna actual
            for (int row = 0; row < matriz.length; row++) {
                matriz[row][columna] = randomizarnumeros.nextInt(max - min + 1) + min;
            }
        }
    }
    public static void ordenarColumnas(){
        for (int col = 0; col < matriz[0].length; col++) {
            int arrayTemporal[] = new int[matriz.length];

            // Copiar elementos de la columna en arrayTemporal
            for (int row = 0; row < matriz.length; row++) {
                arrayTemporal[row] = matriz[row][col];
            }

            // Ordenar arrayTemporal
            Arrays.sort(arrayTemporal);

            // Reasignar los valores ordenados a la columna de la matriz
            for (int row = 0; row < matriz.length; row++) {
                matriz[row][col] = arrayTemporal[row];
            }
        }
    }
    public static void imprimirMatriz(){
        for (int row = 0; row < matriz.length; row++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print(matriz[row][col] + "\t");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        inicializarMatriz();
        ordenarColumnas();
        imprimirMatriz();
    }
}
