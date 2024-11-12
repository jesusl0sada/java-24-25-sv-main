// Importamos la clase Random para generar números aleatorios.
import java.util.Random;

public class Main {
    // Constantes que definen el tamaño del tablero.
    static final int FILAS = 6; // Número de filas del tablero.
    static final int COLUMNAS = 6; // Número de columnas del tablero.

    // Declaramos una matriz 2D de caracteres que representará el tablero.
    static char[][] tablero = new char[FILAS][COLUMNAS];

    // Creamos un objeto Random para generar números aleatorios.
    static Random rand = new Random();

    // Array de palabras que vamos a insertar en el tablero.
    static String[] palabras = {"SOL", "LUNA", "MAR", "DANI"};

    // Método principal que ejecuta el programa.
    public static void main(String[] args) {
        inicializarTablero(); // Llenamos el tablero con letras aleatorias.
        imprimirTablero(); // Mostramos el tablero inicial.

        System.out.println("\nInsertando palabras...");
        insertarPalabras(); // Insertamos las palabras en el tablero.

        System.out.println("\nTablero con palabras:");
        imprimirTablero(); // Mostramos el tablero con las palabras insertadas.
    }

    /**
     * Método que inicializa el tablero con letras aleatorias.
     */
    public static void inicializarTablero() {
        // Recorremos cada fila del tablero.
        for (int i = 0; i < FILAS; i++) {
            // Recorremos cada columna de la fila actual.
            for (int j = 0; j < COLUMNAS; j++) {
                // Asignamos una letra aleatoria entre 'A' y 'Z' a la posición actual.
                tablero[i][j] = (char) (rand.nextInt(26) + 'A');
            }
        }
    }

    /**
     * Método que imprime el tablero en la consola.
     */
    public static void imprimirTablero() {
        // Recorremos cada fila del tablero.
        for (int i = 0; i < FILAS; i++) {
            // Recorremos cada columna de la fila actual.
            for (int j = 0; j < COLUMNAS; j++) {
                // Imprimimos el carácter en la posición actual, seguido de un espacio.
                System.out.print(tablero[i][j] + " ");
            }
            // Hacemos un salto de línea al final de cada fila.
            System.out.println();
        } 
    }


    //Método que intenta insertar cada palabra en una fila aleatoria.

    public static void insertarPalabras() {
        for (String palabra : palabras) {
            while (true) {
                int fila = rand.nextInt(FILAS); // Fila aleatoria
                int columna = rand.nextInt(COLUMNAS); // Columna aleatoria

                // Decidir aleatoriamente si la palabra se coloca horizontal o verticalmente
                if (rand.nextBoolean()) {
                    // Intentar colocar en horizontal
                    if (columna + palabra.length() <= COLUMNAS) {
                        for (int k = 0; k < palabra.length(); k++) {
                            tablero[fila][columna + k] = palabra.charAt(k);
                        }
                        break; // Salimos del while, palabra colocada
                    }
                } else {
                    // Intentar colocar en vertical
                    if (fila + palabra.length() <= FILAS) {
                        for (int k = 0; k < palabra.length(); k++) {
                            tablero[fila + k][columna] = palabra.charAt(k);
                        }
                        break; // Salimos del while, palabra colocada
                    }
                }
            }
        }
    }
}


