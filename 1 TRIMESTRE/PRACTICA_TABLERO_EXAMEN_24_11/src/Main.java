import java.util.Random;
import java.util.Scanner;
public class Main {
    // CARÁCTERES, ENTEROS, ETC EMPLEADOS...
    final static char yoda = 'Y';
    final static char darthVader = 'V';
    final static char darthMaul = 'D';
    final static char r2d2 = 'R';
    final static char muro = 'M';
    final static char vacio = 'L';
    final static char meta = '!';
    final static char pocima = 'P';
    final static int MAX_FILA = 10;
    final static int MAX_COLUMNA = 10;
    static int filaYoda; // FILA ALEATORIA DE YODA -> LA GUARDAMOS YA QUE EN EL FUTURO TENDREMOS QUE UBICARLO A NIVEL GLOBAL.
    static int columnaYoda;
    static int filaVader; // FILA ALEATORIA DE VADER -> LA GUARDAMOS YA QUE EN EL FUTURO TENDREMOS QUE UBICARLO A NIVEL GLOBAL.
    static int columnaVader;
    static int filaDarthMaul;
    static int columnaDarthMaul;
    static int filaR2D2;
    static int columnaR2D2;
    static int filaMuro;
    static int columnaMuro;
    static int filaPocima;
    static int columnaPocima;
    public static int vidasYoda = 3;
    public static int vidasVader = 3;
    public static Scanner lector = new Scanner(System.in);
    //TABLEROS
    static char tableroYoda[][] = new char[10][10];
    static char tableroVader[][] = new char[10][10];
    static Random randomizar = new Random();

    // INICIALIZAMOS TABLEROS
    public static void inicializartableroYoda() {// METERLE VACIOS AL TABLERO, LLENARLO DE L
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

    // IMPRIMIMOS TABLEROS
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

    // METEMOS A LOS PERSONAJES PRINCIPALES
    public static void yodatableroYoda() {
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
            tableroVader[filaVader][columnaVader] = darthVader;
        }
    }

    // METEMOS A LOS VILLANOS
    public static void villanostableroYoda() { // DARTH MAUL
        for (int i = 0; i < 5; i++) {
            do {
                filaDarthMaul = randomizar.nextInt(MAX_FILA);
                columnaDarthMaul = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroYoda[filaDarthMaul][columnaDarthMaul] != vacio);
            tableroYoda[filaDarthMaul][columnaDarthMaul] = darthMaul;
        }
    }

    public static void villanostableroVader() { // R2D2
        for (int i = 0; i < 5; i++) {
            do {
                filaR2D2 = randomizar.nextInt(MAX_FILA);
                columnaR2D2 = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroVader[filaR2D2][columnaR2D2] != vacio);
            tableroVader[filaR2D2][columnaR2D2] = r2d2;
        }
    }

    // METEMOS LOS MUROS
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

    // METEMOS LAS PÓCIMAS
    public static void pocimastableroYoda() {
        for (int i = 0; i < 5; i++) {
            do {
                filaPocima = randomizar.nextInt(MAX_FILA);
                columnaPocima = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroYoda[filaPocima][columnaPocima] != vacio);
            tableroYoda[filaPocima][columnaPocima] = pocima;
        }
    }

    public static void pocimastableroVader() {
        for (int i = 0; i < 5; i++) {
            do {
                filaPocima = randomizar.nextInt(MAX_FILA);
                columnaPocima = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroVader[filaPocima][columnaPocima] != vacio);
            tableroVader[filaPocima][columnaPocima] = pocima;
        }
    }

    // CASILLAS DE META
    public static void casillametaYoda() {
        tableroYoda[9][9] = meta;
    }

    public static void casillametaVader() {
        tableroVader[9][9] = meta;
    }

    // MOVIMIENTO
    public static void juegoYoda() {
        // 1) DEFINIMOS LAS VARIABLES A EMPLEAR
        int nuevafilaYoda, nuevacolumnaYoda;
        nuevafilaYoda = filaYoda; // INICIALIZAMOS LA VARIABLE EN LA COLUMNA, FILA VIEJA
        nuevacolumnaYoda = columnaYoda; // INICIALIZAMOS LA VARIABLE EN LA COLUMNA, FILA VIEJA
        String movimientousuarioYoda;
        System.out.println("A DÓNDE TE QUIERES DESPLAZAR W/A/S/D/Q/E/Z/C");
        movimientousuarioYoda = lector.nextLine().toUpperCase();
        // 2) HACEMOS EL MOVIMIENTO
        switch (movimientousuarioYoda) {
            case "W": // Arriba
                nuevafilaYoda = (nuevafilaYoda - 1 + MAX_FILA) % MAX_FILA;
                break;
            case "A": // Izquierda
                nuevacolumnaYoda = (nuevacolumnaYoda - 1 + MAX_COLUMNA) % MAX_COLUMNA;
                break;
            case "S": // Abajo
                nuevafilaYoda = (nuevafilaYoda + 1 + MAX_FILA) % MAX_FILA;
                break;
            case "D": // Derecha
                nuevacolumnaYoda = (nuevacolumnaYoda + 1 +MAX_COLUMNA) % MAX_COLUMNA;
                break;
            case "Q": // Diagonal arriba-izquierda
                nuevafilaYoda = (nuevafilaYoda - 1 + MAX_FILA) % MAX_FILA;
                nuevacolumnaYoda = (nuevacolumnaYoda - 1 + MAX_COLUMNA) % MAX_COLUMNA;
                break;
            case "E": // Diagonal arriba-derecha
                nuevafilaYoda = (nuevafilaYoda - 1 + MAX_FILA) % MAX_FILA;
                nuevacolumnaYoda = (nuevacolumnaYoda + 1) % MAX_COLUMNA;
                break;
            case "Z": // Diagonal abajo-izquierda
                nuevafilaYoda = (nuevafilaYoda + 1 + MAX_FILA) % MAX_FILA;
                nuevacolumnaYoda = (nuevacolumnaYoda - 1 + MAX_COLUMNA) % MAX_COLUMNA;
                break;
            case "C": // Diagonal abajo-derecha
                nuevafilaYoda = (nuevafilaYoda + 1 + MAX_FILA) % MAX_FILA;
                nuevacolumnaYoda = (nuevacolumnaYoda + 1 + MAX_COLUMNA) % MAX_COLUMNA;
                break;
            default:
                System.out.println("MOVIMIENTO NO VÁLIDO. INTENTA DE NUEVO");
                return; // No hace nada, espera un movimiento válido
        }
        // 3) VALIDACIÓN
        // VAMOS A UNIR LA FILA Y COLUMNA EN EL TABLERO Y GUARDAREMOS EL CARÁCTER QUE CONTIENE, CASILLADESTINO
        char casillaDestino;
        casillaDestino = tableroYoda[nuevafilaYoda][nuevacolumnaYoda];
        if (casillaDestino == muro) {
            System.out.println("Te has chocado con un muro, vuelve");
            return;
        } else if (casillaDestino == darthMaul) {
            System.out.println("Te has chocado con darth maul, has perdido una vida");
            vidasYoda = vidasYoda - 1;
            System.out.println("Te quedan las siguientes vidas" + ":" + vidasYoda);
            if (vidasYoda == 0) {
                System.out.println("Te has quedado sin vidas, gana vader");
                System.exit(0); // SE TERMINÓ EL JUEGO
            }
        } else if (casillaDestino == meta) {
            System.out.println("Enhorabuena has ganado");
            System.out.println("GANADOR: YODA");
            System.exit(0);
        } else if (casillaDestino == pocima) {
            System.out.println("¡Has encontrado una pócima! Yoda se teletransporta a una posición aleatoria.");
            int FilaPocimaYoda, ColumnaPocimaYoda;
            // Inicializar con las coordenadas actuales, aunque no es necesario
            FilaPocimaYoda = nuevafilaYoda;
            ColumnaPocimaYoda = nuevacolumnaYoda;

            // Generar nueva posición aleatoria
            do {
                FilaPocimaYoda = randomizar.nextInt(MAX_FILA);
                ColumnaPocimaYoda = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroYoda[FilaPocimaYoda][ColumnaPocimaYoda] != vacio); // Asegurarse de que sea una casilla válida

            // Asignar la posición generada a las variables de movimiento
            nuevafilaYoda = FilaPocimaYoda;
            nuevacolumnaYoda = ColumnaPocimaYoda;
        }

        // 4ª) ACTUALIZACIÓN PARA GENERAR ESE BUCLE DE MOVIMIENTO Y LIMPIAR LA CASILLA ANTERIOR
        tableroYoda[filaYoda][columnaYoda]=vacio; // VACIAMOS LA CASILLA VIEJA
        filaYoda=nuevafilaYoda; // LA VARIABLE DE LA FILA NUEVA LA CAMBIAMOS POR LA VIEJA
        columnaYoda=nuevacolumnaYoda; // LA VARIABLE DE LA COLUMNA NUEVA LA CAMBIAMOS POR LA VIEJA
        tableroYoda[filaYoda][columnaYoda]=yoda; // PONEMOS A YODA EN EL NUEVO SITIO, EFECTO VISUAL PARA EL USUARIO DE QUE LO HA MOVIDO.
    }

    public static void main(String[] args) {
        // TABLERO YODA
        System.out.println("Tablero Yoda:");
        inicializartableroYoda();
        yodatableroYoda();
        villanostableroYoda();
        murostableroYoda();
        pocimastableroYoda();
        casillametaYoda();
        imprimirtableroYoda();

       // FUNCIONES DE JUEGO YODA
        while (true) {
            juegoYoda();
            imprimirtableroYoda();
        }

        /*

        System.out.println(""); // SALTO DE LINEA

        // CASILLAS VADER
        System.out.println("Tablero Vader:");
        inicializartableroVader();
        vadertableroVader();
        villanostableroVader();
        murostableroVader();
        pocimastableroVader();
        casillametaVader();
        imprimirtableroVader();

         */
    }
}