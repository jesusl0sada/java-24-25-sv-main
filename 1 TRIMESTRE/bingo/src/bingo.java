import java.util.Arrays;
import java.util.Random;

public class bingo {
    public static void main(String[] args) {
        // Crear una matriz de 3 filas y 9 columnas
        int[][] bingoCard = new int[3][9];
        Random generadorNumeros = new Random();

        // Llenar cada columna con números aleatorios en el rango adecuados es decir primera 10-19...
        for (int columna = 0; columna < 9; columna++) {
            int minimo = 10 + (columna * 10);  // Valor mínimo para esta columna
            int maximo = 19 + (columna * 10);  // Valor máximo para esta columna
            int[] numerosColumna = new int[3]; // Arreglo para los 3 números de la columna
        // he pensado en sacar minimos y máximos y crear una fórmula con estos y asociando una variable a cada columna.
            // Generar 3 números únicos para la columna
            for (int fila = 0; fila < 3; fila++) {
                int numeroAleatorio;
                boolean esRepetido;
                do {
                    numeroAleatorio = generadorNumeros.nextInt((maximo - minimo) + 1) + minimo;
                    esRepetido = false;

                    // Verificar si el número ya está en la columna
                    for (int i = 0; i < fila; i++) {
                        if (numerosColumna[i] == numeroAleatorio) {
                            esRepetido = true;
                            break;
                        }
                    }
                } while (esRepetido);

                numerosColumna[fila] = numeroAleatorio;  // Asignar el número a la columna
            }

            // Ordenar los números de la columna
            Arrays.sort(numerosColumna);

            // Asignar los números ordenados a la matriz bingoCard
            for (int fila = 0; fila < 3; fila++) {
                bingoCard[fila][columna] = numerosColumna[fila];
            }
        }
        System.out.println("------------CARTÓN BINGO------------");
        System.out.println();

        // Mostrar la matriz de bingo
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 9; columna++) {
                System.out.print(bingoCard[fila][columna] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("------------------------------------");
    }
}













