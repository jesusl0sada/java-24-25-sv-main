// IMPORTACIÓN DE HERRAMIENTAS.
import java.util.Random;
import java.util.Scanner;
public class Main {
    //DEFINIMOS TODAS LAS VARIABLES QUE VAMOS A EMPLEAR PARA HACER ESTO.
    public static int MAXFILA = 10;
    public static int MAXCOLUMNA = 10;
    public static char darthvader = 'D';
    public static char vacio = 'L';
    public static char casillafinal = 'F';
    public static char yoda = 'Y';
    public static char r2d2 = 'R';
    public static char muro = 'M';
    public static int vidasYoda = 3;
    public static int vidasVader = 3;
    public static char tableroYODA[][] = new char[MAXFILA][MAXCOLUMNA];
    public static char tableroVADER[][] = new char[MAXFILA][MAXCOLUMNA];

    // COMENZAMOS DEFINIENDO DOS TABLEROS ALREDEDOR DE LOS QUE VAMOS A TRABAJAR.

    // AQUÍ FUNCIONES DEL TABLERO YODA...
    public static void inicializartableroYoda() { // primero vamos a crear un tablero que es el que va a contener 10x10 de yoda, con la Y, luego
        for (int i = 0; i < MAXFILA; i++) {
            for (int j = 0; j < MAXCOLUMNA; j++) {
                tableroYODA[i][j] = vacio;
            }
        }
    }

    // 1ERO METEMOS UN YODA
    public static void llenartablerodeYoda() {
        Random rand = new Random();
        int filayoda, columnayoda; // como va a ser en una columna random lo creamos, va a crear esa variable.
        do {
            filayoda = rand.nextInt(MAXFILA);       // Genera una fila aleatoria.
            columnayoda = rand.nextInt(MAXCOLUMNA); // Genera una columna aleatoria.
        } while (tableroYODA[filayoda][columnayoda] != vacio); // Repite mientras la posición no esté vacía.

        tableroYODA[filayoda][columnayoda] = yoda; // Coloca 'Y' una vez encontrada la posición vacía.
    }

    // 2DO METEMOS 5 DARTHMAULS
    public static void llenartablerodeMaul() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) { // .
            int filaMaul, columnaMaul;
            do {
                filaMaul = rand.nextInt(MAXFILA);
                columnaMaul = rand.nextInt(MAXCOLUMNA);
            } while (tableroYODA[filaMaul][columnaMaul] != vacio);
            tableroYODA[filaMaul][columnaMaul] = darthvader;
        }
    }

    // 3ERO METEMOS 5 MUROS
    public static void llenartableroyodadeMuros() {
        Random randomizarmuros = new Random();
        for (int i = 0; i < 5; i++) {
            int filaMuros, columnaMuros;
            do {
                filaMuros = randomizarmuros.nextInt(MAXFILA);
                columnaMuros = randomizarmuros.nextInt(MAXCOLUMNA);
            } while (tableroYODA[filaMuros][columnaMuros] != vacio);
            tableroYODA[filaMuros][columnaMuros] = muro;
        }
    }

    // 4O IMPRIMIMOS EL TABLERO YODA
    public static void imprimirTableroyoda() {
        for (int i = 0; i < MAXFILA; i++) {
            for (int j = 0; j < MAXCOLUMNA; j++) {
                System.out.print("[" + tableroYODA[i][j] + "]");
            }
            System.out.println("");
        }
    }
    // TERMINADAS LAS FUNCIONES DEL TABLERO YODA

    // INICIAMOS EL TABLERO VADER
    public static void inicializartableroVader() {
        for (int i = 0; i < MAXFILA; i++) {
            for (int j = 0; j < MAXCOLUMNA; j++) {
                tableroVADER[i][j] = vacio;
            }
        }
    }

    public static void llenartablerodeVader() {
        Random vaderrandom = new Random();
        int filarandomVader, columnarandomVader;
        for (int i = 0; i < 1; i++) {
            do {
                filarandomVader = vaderrandom.nextInt(MAXFILA);
                columnarandomVader = vaderrandom.nextInt(MAXCOLUMNA);
            } while (tableroVADER[filarandomVader][columnarandomVader] != vacio);
            tableroVADER[filarandomVader][columnarandomVader] = darthvader;
        }
    }

    public static void llenartableror2d2() {
        //CREACIÓN DE VARIABLES DE LA FILA Y COLUMNA ALEATORIA EN DONDE SE DEPOSITARÁ LA LETRA.
        Random randomizarr2d2 = new Random();
        int filar2d2aleatoria, columnar2d2aleatoria;
        for (int i = 0; i < 5; i++) {
            do {
                filar2d2aleatoria = randomizarr2d2.nextInt(MAXFILA);
                columnar2d2aleatoria = randomizarr2d2.nextInt(MAXCOLUMNA);
            } while (tableroVADER[filar2d2aleatoria][columnar2d2aleatoria] != vacio);
            tableroVADER[filar2d2aleatoria][columnar2d2aleatoria] = r2d2;
        }
    }

    public static void llenartablerovaderdeMuros() {
        int filamuros, columnamuros;
        Random randomizarmuros = new Random();
        do {
            filamuros = randomizarmuros.nextInt(MAXFILA);
            columnamuros = randomizarmuros.nextInt(MAXCOLUMNA);
        } while (tableroVADER[filamuros][columnamuros] != vacio);
        tableroVADER[filamuros][columnamuros] = muro;
    }

    public static void casillafinalyoda() {
        tableroYODA[9][9] = casillafinal;
    }

    public static void casillafinalvader() {
        tableroVADER[9][9] = casillafinal;
    }

    public static void imprimirtableroVader() {
        for (int i = 0; i < MAXFILA; i++) {
            for (int j = 0; j < MAXCOLUMNA; j++) {
                System.out.print("[" + tableroVADER[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void moverYoda(char direccion) {
        int[] posicion = encontrarYoda(); // Ubica la posición actual de Yoda
        int filaActual = posicion[0];
        int columnaActual = posicion[1];

        int nuevaFila = filaActual;
        int nuevaColumna = columnaActual;
        // GUARDA LAS FILAS EN LAS QUE HA ENCONTRADO A YODA EN FILA NUEVA Y COLUMNA NUEVA ->:

        // Movimiento basado en la dirección
        switch (direccion) {
            case 'W': // Arriba
                nuevaFila--;
                break;
            case 'S': // Abajo
                nuevaFila++;
                break;
            case 'A': // Izquierda
                nuevaColumna--;
                break;
            case 'D': // Derecha
                nuevaColumna++;
                break;
            case 'Q': // Diagonal superior izquierda
                nuevaFila--;
                nuevaColumna--;
                break;
            case 'E': // Diagonal superior derecha
                nuevaFila--;
                nuevaColumna++;
                break;
            case 'Z': // Diagonal inferior izquierda
                nuevaFila++;
                nuevaColumna--;
                break;
            case 'C': // Diagonal inferior derecha
                nuevaFila++;
                nuevaColumna++;
                break;
            default:
                System.out.println("Dirección no válida.");
                return;
        }

        // Tablero infinito: corrige las coordenadas si se sale del tablero
        nuevaFila = (nuevaFila + MAXFILA) % MAXFILA;
        nuevaColumna = (nuevaColumna + MAXCOLUMNA) % MAXCOLUMNA;

        // Validar la nueva posición
        if (tableroYODA[nuevaFila][nuevaColumna] == muro) {
            System.out.println("¡Chocaste con un muro! Intenta otra dirección.");
            return;
        }

        if (tableroYODA[nuevaFila][nuevaColumna] == darthvader) {
            vidasYoda--;
            System.out.println("¡Darth Maul te ha atacado! Vidas restantes: " + vidasYoda);
            if (vidasYoda == 0) {
                System.out.println("Has perdido todas las vidas. ¡Juego terminado!");
                System.exit(0);
            }
        } else if (tableroYODA[nuevaFila][nuevaColumna] == casillafinal) {
            System.out.println("¡Has llegado a la meta! ¡Victoria!");
            System.exit(0);
        }

        // Mover Yoda y limpiar la casilla anterior
        tableroYODA[filaActual][columnaActual] = vacio;
        tableroYODA[nuevaFila][nuevaColumna] = yoda;

        imprimirTableroyoda();
    }

    public static int[] encontrarYoda() {
        for (int i = 0; i < MAXFILA; i++) {
            for (int j = 0; j < MAXCOLUMNA; j++) {
                if (tableroYODA[i][j] == yoda) {
                    return new int[]{i, j}; // Devuelve la posición [fila, columna].
                }
            }
        }
        return null; // No debería pasar si Yoda siempre está en el tablero.
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

// TABLERO YODA

/*
        System.out.println("TABLERO YODA");

        inicializartableroYoda();
        llenartablerodeYoda();
        llenartablerodeMaul();
        llenartableroyodadeMuros();
        casillafinalyoda();
        imprimirTableroyoda();

        while (true) {
            System.out.println("Introduce un movimiento (W/A/S/D/Q/E/Z/C): ");
            char movimiento = sc.next().charAt(0);
            moverYoda(movimiento);
*/
            // FIN TABLERO YODA
            //SEPARACIÓN
            // TABLERO VADER



        System.out.println("TABLERO DARTH VADER:");
        System.out.println("");
            inicializartableroVader();
            llenartablerodeVader();
            llenartableror2d2();
            llenartablerovaderdeMuros();
            casillafinalvader();
            imprimirtableroVader();


        }
    }









