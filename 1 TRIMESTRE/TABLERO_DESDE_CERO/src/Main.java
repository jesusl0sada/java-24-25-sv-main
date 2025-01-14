import java.util.Locale;
import java.util.Random; // UTILIDAD RANDOM.
import java.util.Scanner; // UTILIDAD LECTOR.
public class Main {
    // DEFINIMOS TODAS LAS VARIABLES QUE VAMOS A EMPLEAR A NIVEL GLOBAL.
    static final int MAX_FILA = 10;
    static final int MAX_COLUMNA = 10;
    static int vidas = 3;
    // DIMENSIONES 10x10
    static int filaMuro;
    static int columnaMuro;
    // MUROS ALEATORIOS
    static int filaYoda;
    static int columnaYoda;
    // YODA ALEATORIOS
    static int filaMaul;
    static int columnaMaul;
    // MAUL ALEATORIOS
    static int columnaVader;
    static int filaVader;
    // VADER ALEATORIOS
    static int filaR2D2;
    static int columnaR2D2;
    // R2D2 ALEATORIOS
    static final char darthmaul = 'M';
    static final char yoda = 'Y';
    static final char r2d2 = 'R';
    static char darthvader = 'D';
    static final char muro = 'M';
    static final char vacio = 'L';
    // CARÁCTERES = LETRAS.
    static Random randomizar = new Random();
    // FUNCIÓN RANDOM
    static Scanner lector = new Scanner(System.in);
    // FUNCIÓN ESCÁNER
    static char tableroYoda[][] = new char[10][10];
    static char tableroVader[][] = new char[10][10];

    // MATRICES
    // FUNCIONES:
    public static void inicializartableroYoda() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                tableroYoda[i][j] = vacio;
            }
        }
    }

    public static void inicializartableroVader() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                tableroVader[i][j] = vacio;
            }
        }
    }

    // 2 TABLEROS INICIALIZADO 10X10
    public static void imprimirtableroYoda() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                System.out.print(tableroYoda[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void imprimirtableroVader() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                System.out.print(tableroVader[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // METEMOS A LOS PERSONAJES PRINCIPALES EN EL TABLERO
    public static void yodatableroYoda() {
        // LAS VARIABLES FILA Y COLUMNA YODA QUE VAN A APARECER RANDOM EN EL TABLERO YA ESTÁN DEFINIDAS.
        for (int i = 0; i < 1; i++) {
            do {
                filaYoda = randomizar.nextInt(MAX_FILA);
                columnaYoda = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroYoda[filaYoda][columnaYoda] != vacio);
            tableroYoda[filaYoda][columnaYoda] = yoda;
        }
    }

    public static void vadertableroVader() {
        for (int i = 0; i < 1; i++) {
            do {
                filaVader = randomizar.nextInt(MAX_FILA);
                columnaVader = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroVader[filaVader][columnaVader] != vacio);
            tableroVader[filaVader][columnaVader] = darthvader;
        }
    }

    // METEMOS A LOS ENEMIGOS EN CADA TABLERO
    public static void enemigostableroYoda() {
        for (int i = 0; i < 5; i++) {
            do {
                filaMaul = randomizar.nextInt(MAX_FILA);
                columnaMaul = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroYoda[filaMaul][columnaMaul] != vacio);
            tableroYoda[filaMaul][columnaMaul] = darthmaul;
        }
    }

    public static void enemigostableroVader() {
        for (int i = 0; i < 5; i++) {
            do {
                filaR2D2 = randomizar.nextInt(MAX_FILA);
                columnaR2D2 = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroVader[filaR2D2][columnaR2D2] != vacio);
            tableroVader[r2d2][r2d2] = r2d2;
        }
    }

    // METEMOS A LOS MUROS EN CADA TABLERO
    public static void murostableroYoda() {
        for (int i = 0; i < 5; i++) {
            do {
                filaMuro = randomizar.nextInt(MAX_FILA);
                columnaMuro = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroYoda[filaMuro][columnaMuro] != vacio);
            tableroYoda[filaMuro][columnaMuro] = muro;
        }
    }

    public static void murostableroVader() {
        for (int i = 0; i < 5; i++) {
            do {
                filaMuro = randomizar.nextInt(MAX_FILA);
                columnaMuro = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroVader[filaMuro][columnaMuro] != vacio);
            tableroVader[filaMuro][columnaMuro] = muro;
        }
    }

    // IMPRIMIR TABLEROS
    public static void movimientoinfinitoYoda() {
        //1 ERO DEFINIMOS LAS VARIABLES QUE VAMOS A UTILIZAR
        int nuevafilaYoda, nuevacolumnaYoda;
        String movimientoYoda;
        nuevafilaYoda = filaYoda; // la inicializamos en la fila vieja
        nuevacolumnaYoda = columnaYoda; // la inicializamos en la columna vieja
        System.out.println("¿En qué dirección quieres que se mueva YODA W/A/S/D/E/Q/Z/C");
        movimientoYoda = lector.nextLine().toUpperCase();
        // PATRÓN DE MOVIMIENTOS
        switch (movimientoYoda) {
            case "W":
                nuevafilaYoda = (nuevafilaYoda--) % 10; // PARA HACERLO INFINITO % 10
                break;
            case "A":
                nuevacolumnaYoda = (nuevacolumnaYoda--) % 10;
                break;
                return;
        }
    }
        public static void main (String[]args){

            //TABLERO YODA
            System.out.println("Tablero Yoda");
            inicializartableroYoda();
            yodatableroYoda();
            enemigostableroYoda();
            imprimirtableroYoda();

            System.out.println("");

            // TABLERO VADER
            System.out.println("Tablero Vader");
            inicializartableroVader();
            vadertableroVader();
            enemigostableroVader();
            imprimirtableroVader();
        }
}

