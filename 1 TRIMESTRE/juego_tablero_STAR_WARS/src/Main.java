import java.util.Random;
import java.util.Scanner;
public class Main {
    static Random randomizar = new Random();
    static Scanner lector = new Scanner(System.in);
    static char tableroYoda[][] = new char[10][10];
    static char tableroVader[][] = new char[10][10];
    final static int MAX_FILA = 10;
    final static int MAX_COLUMNA = 10;
    final static char yoda = 'Y';
    final static char vader = 'V';
    final static char darthMaul = 'D';
    final static char r2d2 = 'R';
    final static char pocima = 'P';
    final static char muro = 'M';
    final static char vacio = 'L';
    final static char meta = '!'; // CASILLA 9 / 9
    static int filaYoda;
    static int filaVader;
    static int columnaYoda;
    static int columnaVader;
    static int filadarthMaul;
    static int filar2d2;
    static int columnadarthMaul;
    static int columnar2d2;
    static int filaMuro;
    static int columnaMuro;
    static int filaPocima;
    static int columnaPocima;
    static int vidasYoda = 3;
    static int vidasVader = 3;
    static String movimientousuarioYoda;

    //TABLERO YODA
    public static void inicializartableroYoda() { // LLENARLO DE VACÍOS
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                tableroYoda[i][j] = vacio;
            }
        }
    }
    public static void yodatableroYoda() {
        for (int i = 0; i < 1; i++) {
            do {
                filaYoda = randomizar.nextInt(MAX_FILA);
                columnaYoda = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroYoda[filaYoda][columnaYoda] != vacio);
        }
        tableroYoda[filaYoda][columnaYoda] = yoda;
    }
    public static void enemigostableroYoda() { // DARTH MAUL
        for (int i = 0; i < 5; i++) {
            do {
                filadarthMaul = randomizar.nextInt(MAX_FILA);
                columnadarthMaul = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroYoda[filadarthMaul][columnadarthMaul] != vacio);
            tableroYoda[filadarthMaul][columnadarthMaul] = darthMaul;
            // SI ES DISTINTO DE VACIO REPETIREMOS EL DO TANTAS VECES HASTA QUE DEMOS CON UNA CASILLA QUE ESTÁ VACÍA
        }
    }
    public static void murostableroYoda() {
        for (int i = 0; i < 5; i++) {
            do {
                filaMuro = randomizar.nextInt(MAX_FILA);
                columnaMuro = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroYoda[filaMuro][columnaMuro] != vacio);
            tableroYoda[filaMuro][columnaMuro] = muro;
        }
    }
    public static void pocimastableroYoda() {
        for (int i = 0; i < 5; i++) {
            do {
                filaPocima = randomizar.nextInt(MAX_FILA);
                columnaPocima = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroYoda[filaPocima][columnaPocima] != vacio);
            tableroYoda[filaPocima][columnaPocima] = pocima;
        }
    }
    public static void metatableroYoda() {
        tableroYoda[9][9] = meta;
    }
    public static void imprimirtableroYoda() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                System.out.print(tableroYoda[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void juegotableroYoda() {
        // 1) EL USUARIO TE PUEDA METER EL MOVIMIENTO LA TECLA
        System.out.println("A DÓNDE TE QUIERES MOVER W/A/S/D/Q/E/Z/C");
        int nuevafilaYoda, nuevacolumnaYoda;
        nuevafilaYoda = filaYoda;
        nuevacolumnaYoda = columnaYoda;
        movimientousuarioYoda = lector.nextLine().toUpperCase();

        //2) MOVIMIENTOS QUE HAY
        switch (movimientousuarioYoda) {
            case "W": // ARRIBA
                nuevafilaYoda = (nuevafilaYoda - 1 + MAX_FILA) % 10;
                break;
            case "A": // IZQUIERDA
                nuevacolumnaYoda = (nuevacolumnaYoda - 1 + MAX_COLUMNA) % 10;
                break;
            case "S": // ABAJO
                nuevafilaYoda = (nuevafilaYoda + 1 + MAX_FILA) % 10;
                break;
            case "D": // DERECHA
                nuevacolumnaYoda = (nuevacolumnaYoda + 1 + MAX_COLUMNA) % 10;
                break;
            case "Q": // ARRIBA IZQUIERDA
                nuevafilaYoda = (nuevafilaYoda - 1 + MAX_FILA) % 10;
                nuevacolumnaYoda = (nuevacolumnaYoda - 1 + MAX_COLUMNA) % 10;
                break;
            case "E": // ARRIBA DERECHA
                nuevafilaYoda = (nuevafilaYoda - 1 + MAX_FILA) % 10;
                nuevacolumnaYoda = (nuevacolumnaYoda + 1 + MAX_COLUMNA) % 10;
                break;
            case "Z": // ABAJO IZQUIERDA
                nuevafilaYoda = (nuevafilaYoda + 1 + MAX_FILA) % 10;
                nuevacolumnaYoda = (nuevacolumnaYoda - 1 + MAX_COLUMNA) % 10;
                break;
            case "C": // ABAJO DERECHA
                nuevafilaYoda = (nuevafilaYoda + 1 + MAX_FILA) % 10;
                nuevacolumnaYoda = (nuevacolumnaYoda + 1 + MAX_COLUMNA) % 10;
                break;
            default:
                System.out.println("MOVIMIENTO NO VÁLIDO, INGRESA W/A/S/D/Q/E/Z/C");
                return;
        }

        //3) VALIDAR MOVIMIENTOS EN EL TABLERO
        // PARA ELLO GUARDAREMOS EL CARÁCTER ESCRITO EN ESA FILA Y COLUMNA, ES DECIR GUARDAR POR ASÍ DECIRLO LO QUE CONTIENE EL CAJÓN
        char Casilladestino;
        Casilladestino = tableroYoda[nuevafilaYoda][nuevacolumnaYoda];
        if (Casilladestino == muro) {
            System.out.println("No puedes avanzar, hay un muro");
            return;
        } else if (Casilladestino == darthMaul) {
            System.out.println("Te has chocado con darth maul, pierdes una vida");
            vidasYoda = vidasYoda - 1;
            System.out.println("Te quedan las siguientes vidas :" + vidasYoda);
        }
        if (vidasYoda == 0) {
            System.out.println("HAS PERDIDO, GANADOR: DARTH VADER!!!!!!");
            System.exit(0);
        } else if (Casilladestino == meta) {
            System.out.println("Has llegado a la meta, enhorabuena; ganador: YODA");
            System.exit(0);
        } else if (Casilladestino == pocima) {
            System.out.println("TE HAS ENCONTRADO UNA PÓCIMA, TPEANDO A YODA A UN SITIO RANDOM.....");
            int nuevafilaPocima, nuevacolumnaPocima;

            nuevafilaPocima = nuevafilaYoda;
            nuevacolumnaPocima = nuevacolumnaYoda;
            do {
                nuevafilaPocima = randomizar.nextInt(MAX_FILA);
                nuevacolumnaPocima = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroYoda[nuevafilaPocima][nuevacolumnaPocima] != vacio);

            nuevafilaYoda = nuevafilaPocima;
            nuevacolumnaYoda = nuevacolumnaPocima;
        }

        //4) FUNCIÓN DE SALTO EN EL TABLERO DE YODA
        saltotableroYoda();

        // 5) ACTUALIZAR POSICIONES
        // 1) LIMPIAMOS LA ANTERIOR CASILLA
        tableroYoda[filaYoda][columnaYoda] = vacio;
        filaYoda = nuevafilaYoda;
        columnaYoda = nuevacolumnaYoda;
        tableroYoda[filaYoda][columnaYoda] = yoda;
    }
    public static void saltotableroYoda(){
        int nuevafiladarthMaul, nuevacolumnadarthMaul; // Declaración fuera del bucle
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                if (tableroYoda[i][j] == darthMaul) { // BUSCAMOS A DARTH MAUL Y SI LO ENCONTRAMOS
                    do {
                        nuevafiladarthMaul = randomizar.nextInt(MAX_FILA);
                        nuevacolumnadarthMaul = randomizar.nextInt(MAX_COLUMNA);
                    } while (tableroYoda[nuevafiladarthMaul][nuevacolumnadarthMaul] != vacio ||
                            (nuevafiladarthMaul == i && nuevacolumnadarthMaul == j));
                    tableroYoda[i][j] = vacio;
                    tableroYoda[nuevafiladarthMaul][nuevacolumnadarthMaul] = darthMaul;
                }
            }
        }
    }
    //TABLERO VADER
    public static void inicializartableroVader(){
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                tableroVader[i][j] = vacio;
            }
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
    public static void vadertableroVader() {
        for (int i = 0; i < 1; i++) {
            do {
                filaVader = randomizar.nextInt(MAX_FILA);
                columnaVader = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroVader[filaVader][columnaVader] != vacio);
            tableroVader[filaVader][columnaVader] = vader;
        }
    }
    public static void enemigostableroVader() {
        for (int i = 0; i < 5; i++) {
            do {
                filar2d2 = randomizar.nextInt(MAX_FILA);
                columnar2d2 = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroVader[filar2d2][columnar2d2] != vacio);
            tableroVader[filar2d2][columnar2d2] = r2d2;
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
    public static void pocimastableroVader() {
        for (int i = 0; i < 5; i++) {
            do {
                filaPocima = randomizar.nextInt(MAX_FILA);
                columnaPocima = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroVader[filaPocima][columnaPocima] != vacio);
            tableroVader[filaPocima][columnaPocima] = pocima;
        }
    }
    public static void metatableroVader() {
        tableroVader[9][9] = meta;
    }
    public static void juegotableroVader(){
        //1) DECLARAMOS VARIABLES (STRING, FILAS NUEVAS, SUSTITUIMOS ESAS POR LAS VIEJAS Y EL STRING ES EL LECTOR)
        System.out.println("¿En qué dirección te quieres mover? W/A/S/D/Q/E/Z/C");
        int nuevafilaVader, nuevacolumnaVader;
        String movimientousuarioVader;
        nuevafilaVader = filaVader;
        nuevacolumnaVader = columnaVader;
        movimientousuarioVader = lector.nextLine().toUpperCase();
        // 2) ESTABLECEMOS LOS MOVIMIENTOS CON SWITCHES
        switch (movimientousuarioVader){
            case "W": // ARRIBA
                nuevafilaVader = (nuevafilaVader - 1 + MAX_FILA) % 10;
                break;
            case "A": // IZQUIERDA
                nuevacolumnaVader = (nuevacolumnaVader - 1 + MAX_COLUMNA) % 10;
                break;
            case "S": // ABAJO
                nuevafilaVader = (nuevafilaVader + 1 + MAX_FILA) % 10;
                break;
            case "D": // DERECHA
                nuevacolumnaVader = (nuevacolumnaVader + 1 + MAX_COLUMNA) % 10;
                break;
            case "Q": // ARRIBA IZQUIERDA
                nuevafilaVader = (nuevafilaVader - 1 + MAX_FILA) % 10;
                nuevacolumnaVader = (nuevacolumnaVader - 1 + MAX_COLUMNA) % 10;
                break;
            case "E": // ARRIBA DERECHA
                nuevafilaVader = (nuevafilaVader - 1 + MAX_FILA) % 10;
                nuevacolumnaVader = (nuevacolumnaVader + 1 + MAX_COLUMNA) % 10;
                break;
            case "Z": // ABAJO IZQUIERDA
                nuevafilaVader = (nuevafilaVader + 1 + MAX_FILA) % 10;
                nuevacolumnaVader = (nuevacolumnaVader - 1 + MAX_COLUMNA) % 10;
                break;
            case "C": // ABAJO DERECHA
                nuevafilaVader = (nuevafilaVader + 1 + MAX_FILA) % 10;
                nuevacolumnaVader = (nuevacolumnaVader + 1 + MAX_COLUMNA) % 10;
                break;
            default:
                System.out.println("MOVIMIENTO NO VÁLIDO, INGRESA W/A/S/D/Q/E/Z/C");
                return;
        }
        // 3º) REVISAMOS POSIBILIDADES, ESTABLECEMOS CONDICIONES, ETC...
        // PARA ELLO CREAMOS UNA VARIABLE CASILLA DESTINO QUE VA A GUARDAR EL CARÁCTER DE LA CASILLA A LA QUE SE MUEVE EL PERSONAJE.
        char casillaDestinoVader;
        casillaDestinoVader = tableroVader[nuevafilaVader][nuevacolumnaVader];
        if (casillaDestinoVader == muro){
            System.out.println("No puedes pasar, el camino está limitado con un muro, toma otra dirección");
            return;
        } else if (casillaDestinoVader == r2d2) {
            vidasVader = vidasVader - 1;
            System.out.println("Te has topado con r2d2, pierdes una vida, te quedan :" + vidasVader);
            if (vidasVader == 0){
                System.out.println("Se acabó, ha ganado YODA, VADER ha perdido");
                System.exit(0);
            }
        }
            else if (casillaDestinoVader == pocima) {
                System.out.println("¡Has encontrado una pócima! Vader se teletransporta a una posición aleatoria.");
                int nuevafilapocimaVader, nuevacolumnapocimaVader; // IREMOS A UN LUGAR RANDOM SI LA PISAMOS

                nuevafilapocimaVader = nuevafilaVader;
                nuevacolumnapocimaVader = nuevacolumnaVader;

                do {
                    nuevafilapocimaVader = randomizar.nextInt(MAX_FILA);
                    nuevacolumnapocimaVader = randomizar.nextInt(MAX_COLUMNA);
                }while (tableroVader[nuevafilapocimaVader][nuevacolumnapocimaVader] != vacio || tableroVader[nuevafilapocimaVader][nuevacolumnapocimaVader] != r2d2); // REPETIMOS HASTA QUE ESTÉN VACÍAS, COMO YA TENEMOS UN YODA NO HACE FALTA PONER OTRO EN OTRA COLUMNA RANDOM, SIMPLEMENTE VAMOS A APUNTAR A UN LUGAR DE LA MATRIZ Y DEPOSITAR AHÍ NUESTRA VIEJA VARIABLE, ME EXPLICO.
                // DEVOLVEMOS LAS VARIABLES A LAS ORIGINALES PARA QUE EL PROGRAMA SIGA SU CURSO YA QUE ESTAS SOLO FUNCIONAN A MODO TEMPORAL, NO SIEMPRE
                nuevafilaVader = nuevafilapocimaVader;
                nuevacolumnaVader = nuevacolumnapocimaVader;
            }

        //4) FUNCIÓN SALTO
        saltotableroVader();

        // 5) DEVOLVEMOS LAS VARIABLES A LAS ORIGINALES, ACTUALIZAMOS LAS ORIGINALES YA QUE TODO FUNCIONA CON ESTAS, NECESITAMOS DE UNA VARIABLE TEMPORAL COMO ES NUEVA FILA VADER Y NUEVA COLUMNA VADER
        // 1) VACIAMOS LA ULTIMA CASILLA, la vieja = filavader y columna vader
        tableroVader[filaVader][columnaVader] = vacio;
        filaVader = nuevafilaVader;
        columnaVader = nuevacolumnaVader;
        tableroVader[filaVader][columnaVader] = vader; // EFECTO VISUAL PARA EL USUARIO
    }
    public static void saltotableroVader(){
        int nuevafilar2d2, nuevacolumnar2d2;// Declaración fuera del bucle
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                if (tableroVader[i][j] == r2d2) { // BUSCAMOS A DARTH MAUL Y SI LO ENCONTRAMOS
                    do {
                        nuevafilar2d2 = randomizar.nextInt(MAX_FILA);
                        nuevacolumnar2d2 = randomizar.nextInt(MAX_COLUMNA);
                    } while (tableroVader[nuevafilar2d2][nuevacolumnar2d2] != vacio ||
                            (nuevafilar2d2 == i && nuevacolumnar2d2 == j));
                    tableroVader[i][j] = vacio;
                    tableroVader[nuevafilar2d2][nuevacolumnar2d2] = r2d2;
                }
            }
        }
    }
    public static void main(String[] args) {
        // Inicializamos los tableros
        inicializartableroYoda();
        yodatableroYoda();
        enemigostableroYoda();
        murostableroYoda();
        pocimastableroYoda();
        metatableroYoda();

        inicializartableroVader();
        vadertableroVader();
        enemigostableroVader();
        murostableroVader();
        pocimastableroVader();
        metatableroVader();

        boolean turnoYoda = true;

        // Bucle del juego
        while (true) {
            if (turnoYoda) {
                System.out.println("TURNO DE YODA");
                System.out.println("\n=================================");
                System.out.println("TABLERO YODA:");
                imprimirtableroYoda();
                juegotableroYoda(); // Ya incluye verificación de victoria/derrota
            } else {
                System.out.println("\n=================================");
                System.out.println("TURNO DE VADER");
                System.out.println("TABLERO VADER:");
                imprimirtableroVader();
                juegotableroVader(); // Ya incluye verificación de victoria/derrota
            }
            turnoYoda = !turnoYoda; // Cambia el turno
        }
    }
}








