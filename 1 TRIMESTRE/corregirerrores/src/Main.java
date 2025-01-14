import java.util.Random;
public class Main {
    // FUNCIONES Y HERRAMIENTAS FUERA DEL MAIN.
    static int filas = 10; // DEFINIR UN NÚMERO DE FILAS FIJAS.
    static int columnas = 9; // DEFINIR UN NÚMERO DE COLUMNAS FIJAS.
    static int tablero[][] = new int[filas][columnas]; // CREAR EL ARRAY -> MATRIZ.

    public static void creacionyrandom() {
        //CREACIÓN Y RANDOMIZACIÓN DEL TABLERO
        Random numalea = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int rellenar = numalea.nextInt(10) + 10 * (j + 1); //10 - 19
                tablero[i][j] = rellenar; // lo tiene que almacenar en la nueva variable que ha sido creada, llamada rellenar.
            }
        }
    } // CREACIÓN DEL TABLERO CON LOS NÚMEROS ALEATORIOS.

    public static void recorrertablero() {
        int cont = 0;
        do {
            for (int i = 0; i < filas - 1; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (tablero[i][j] > tablero[i + 1][j]) {
                        int aux;
                        aux = tablero[i][j];
                        tablero[i][j] = tablero[i + 1][j];
                        tablero[i + 1][j] = aux;
                    }
                }
            }
            cont++;
        } while (cont < filas);


        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                for (int k = 0; k < filas - 1; k++) {
                    if (tablero[k][j] > tablero[k + 1][j]) {
                        int aux = tablero[k][j];
                        tablero[k][j] = tablero[k + 1][j];
                        tablero[k + 1][j] = aux;
                    }
                }
            }
        }
        for (int i = 0; i < filas - 1; i++) { // [0,0][1,0], [1,0][2,0]
            for (int j = 0; j < columnas; j++) {
                if (tablero[i][j] > tablero[i + 1][j]) {
                    int aux = tablero[i + 1][j];
                    tablero[i][j] = tablero[i + 1][j];
                    tablero[i + 1][j] = aux;
                }
            }
        }
        for (int columna = 0; columna < 9; columna++) {

            for (int i = 0; i < filas - 1; i++) {
                for (int j = i; j < filas; j++) {
                    if (tablero[i][columna] > tablero[j][columna]) {
                        int aux = tablero[i][columna];
                        tablero[i][columna] = tablero[j][columna];
                        tablero[j][columna] = aux;
                    }
                }
            }

        }
    } // LLENAR EL TABLERO DE CIERTAS CONDICIONES.

    public static void imprimirtablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    } // IMPRIMIR EL TABLERO.

    public static void main(String[] args) {
        //CREACIÓN Y RANDOMIZACIÓN DEL TABLERO
        Random numalea = new Random();
        creacionyrandom();
        recorrertablero();
        imprimirtablero();
    } // MAIN CON TODAS LAS FUNCIONES.
}


