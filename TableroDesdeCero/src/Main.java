import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static int MAX_FILA = 10;
    static int MAX_COLUMNA = 10;
    static final char yoda = 'Y';
    static int filaYoda, columnaYoda, filaVader, columnaVader;
    static final char darthvader = 'V';
    static final char darthmaul = 'D';
    static Random randomizar = new Random();
    static Scanner lector = new Scanner(System.in);
    static final char vacio = 'L';
    static final char r2d2 = 'R';
    static final char muro = 'M';
    private static int turno;
    static char tableroYoda[][] = new char[MAX_FILA][MAX_COLUMNA];
    static char tableroVader[][] = new char[MAX_FILA][MAX_COLUMNA];

    public static void inicializartableroYoda() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                tableroYoda[i][j] = vacio;
            }
        }
    }

    public static void yodatableroYoda() {
        int filaYoda, columnaYoda;
        for (int i = 0; i < 1; i++) {
            do {
                filaYoda = randomizar.nextInt(MAX_FILA);
                columnaYoda = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroYoda[filaYoda][columnaYoda] != vacio);
            tableroYoda[filaYoda][columnaYoda] = yoda;
        }
    }

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

    public static void inicializartableroVader() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                tableroVader[i][j] = vacio;
            }
        }
    }

    public static void vadertableroVader() {
        int filaVader, columnaVader;
        for (int i = 0; i < 1; i++) {
            do {
                filaVader = randomizar.nextInt(MAX_FILA);
                columnaVader = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroVader[filaVader][columnaVader] != vacio);
            tableroVader[filaVader][columnaVader] = darthvader;
        }
    }

    public static void darthmaultableroYoda() {
        int filaMaul, columnaMaul;
        for (int i = 0; i < 5; i++) {
            do {
                filaMaul = randomizar.nextInt(MAX_FILA);
                columnaMaul = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroYoda[filaMaul][columnaMaul] != vacio);
            tableroYoda[filaMaul][columnaMaul] = darthmaul;
        }
    }

    public static void r2d2tableroVader() {
        int filar2d2, columnar2d2;
        for (int i = 0; i < 5; i++) {
            do {
                filar2d2 = randomizar.nextInt(MAX_FILA);
                columnar2d2 = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroVader[filar2d2][columnar2d2] != vacio);
            tableroVader[filar2d2][columnar2d2] = r2d2;
        }
    }

    public static void murostableroYoda() {
        int filamuroYoda, columnamuroYoda;
        for (int i = 0; i < 5; i++) {
            do {
                filamuroYoda = randomizar.nextInt(MAX_FILA);
                columnamuroYoda = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroYoda[filamuroYoda][columnamuroYoda] != vacio);
            tableroYoda[filamuroYoda][columnamuroYoda] = muro;
        }
    }

    public static void murostableroVader() {
        int filamuroVader, columnamuroVader;
        for (int i = 0; i < 5; i++) {
            do {
                filamuroVader = randomizar.nextInt(MAX_FILA);
                columnamuroVader = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroVader[filamuroVader][columnamuroVader] != vacio);
            tableroVader[filamuroVader][columnamuroVader] = muro;
        }
    }

    public static boolean movimientotablero() {
        int nuevaFY = filaYoda, nuevaCY = columnaYoda, nuevaFV = filaVader, nuevaCV = columnaVader;
        String movimientousuario;

        if (turno == 1) {
            System.out.println("DIME UN DESP PARA VADER W-A-S-D-Q-Z-E-C");
            movimientousuario = lector.nextLine().toUpperCase();
        } else {
            System.out.println("DIME UN DESP PARA YODA W-A-S-D-Q-Z-E-C");
            movimientousuario = lector.nextLine().toUpperCase();
        }

        if (turno == 1) {
            switch (movimientousuario) {
                case "W":
                    nuevaFY--;
                    break;
                case "A":
                    nuevaCY--;
                    break;
                case "S":
                    nuevaFY++;
                    break;
                case "D":
                    nuevaCY++;
                    break;
                case "Q":
                    nuevaCY--;
                    nuevaFY--;
                    break;
                case "E":
                    nuevaCY++;
                    nuevaFY--;
                    break;
                case "Z":
                    nuevaCY--;
                    nuevaFY++;
                    break;
                case "C":
                    nuevaCY++;
                    nuevaFY++;
                    break;
                default:
                    return false; // movimiento invalido
            }


            if (nuevaFY < 0 || nuevaCY < 0 || nuevaFY >= MAX_FILA || nuevaCY >= MAX_COLUMNA) {
                System.out.println("fuera de limites de tab");
                return false;

            }

            filaYoda = nuevaFY;
            columnaYoda = nuevaCY;
            tableroYoda[filaYoda][columnaYoda] = yoda;

        }


        else if(turno==2){
            switch (movimientousuario) {
                case "W":
                    nuevaFY--;
                    break;
                case "A":
                    nuevaCY--;
                    break;
                case "S":
                    nuevaFY++;
                    break;
                case "D":
                    nuevaCY++;
                    break;
                case "Q":
                    nuevaCY--;
                    nuevaFY--;
                    break;
                case "E":
                    nuevaCY++;
                    nuevaFY--;
                    break;
                case "Z":
                    nuevaCY--;
                    nuevaFY++;
                    break;
                case "C":
                    nuevaCY++;
                    nuevaFY++;
                    break;
                default:
                    return false; // movimiento invalido

            }
            // LIMITAR EL TABLERO, ESTABLECER LÍMITES
            if (nuevaFV < 0 || nuevaCV < 0 || nuevaFV > MAX_FILA || nuevaCV > MAX_COLUMNA) {
                System.out.println("No puedes pasar, estás saliendo del tablero, elige otra dirección");
                return false;
            }
            // LAS VARIABLES LAS ACTUALIZAS
            nuevaFV = filaVader;
            nuevaCV = filaVader;
            tableroVader[filaVader][columnaVader] = darthvader;
        }
        return true;
    }


        public static void main (String[]args){

            System.out.println("");

            //TABLERO YODA
            inicializartableroYoda();
            yodatableroYoda();
            darthmaultableroYoda();
            murostableroYoda();
            imprimirtableroYoda();
            movimientotablero();
            imprimirtableroYoda();

            System.out.println("");

            //TABLERO VADER
            inicializartableroVader();
            vadertableroVader();
            r2d2tableroVader();
            murostableroVader();
            imprimirtableroVader();
            movimientotablero();
            imprimirtableroVader();
        }
    }