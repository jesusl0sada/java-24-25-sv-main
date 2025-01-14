import java.util.Random;
import java.util.Scanner;
public class Main {
    static char vacio = 'L';
    static char yoda = 'Y';
    static char vader = 'V';
    static char darthMaul = 'D';
    static char r2d2 = 'R';
    static char muro = 'M';
    static int MAX_FILA = 10;
    static int MAX_COLUMNA = 10;
    static char tableroYoda[][] = new char[MAX_FILA][MAX_COLUMNA];
    static char tableroVader[][] = new char[MAX_FILA][MAX_COLUMNA];

    static Random randomizar = new Random();

    public static int vidas = 3;

    public static void rellenartableroYodavacio() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                tableroYoda[i][j] = vacio;
            }
        }
    }

    public static void rellenartableroVadervacio() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                tableroVader[i][j] = vacio;
            }
        }
    }

    public static void imprimirtableroYoda() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                System.out.print(tableroYoda[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirtableroVader() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                System.out.print(tableroVader[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rellenartableroYodaYODA() {
        int filaRandomYoda, columnaRandomYoda;
        do {
            filaRandomYoda = randomizar.nextInt(MAX_FILA);
            columnaRandomYoda = randomizar.nextInt(MAX_COLUMNA);
        } while (tableroYoda[filaRandomYoda][columnaRandomYoda] != 'L');
        tableroYoda[filaRandomYoda][columnaRandomYoda] = yoda;
    }

    public static void rellenartablerovaderVADER() {
        int filaRandomVader, columnaRandomVader;
        do {
            filaRandomVader = randomizar.nextInt(MAX_FILA);
            columnaRandomVader = randomizar.nextInt(MAX_COLUMNA);
        } while (tableroVader[filaRandomVader][columnaRandomVader] != 'L');
        tableroVader[filaRandomVader][columnaRandomVader] = vader;
    }

    public static void rellenartableryodaDARTHMAUL() {
        int filaAleatoriaMaul, columnaAleatoriaMaul;
        for (int i = 0; i < 5; i++) {
            do {
                filaAleatoriaMaul = randomizar.nextInt(MAX_FILA);
                columnaAleatoriaMaul = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroYoda[filaAleatoriaMaul][columnaAleatoriaMaul] != vacio);
            tableroYoda[filaAleatoriaMaul][columnaAleatoriaMaul] = darthMaul;
        }
    }

    public static void rellenartablervaderR2D2(){
        int filaAleatoriaR2D2, columnaAleatoriaR2D2;
        for (int i = 0; i < 5; i++) {
            do {
                filaAleatoriaR2D2 = randomizar.nextInt(MAX_FILA);
                columnaAleatoriaR2D2 = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroVader[filaAleatoriaR2D2][columnaAleatoriaR2D2] != vacio);
            tableroVader[filaAleatoriaR2D2][columnaAleatoriaR2D2] = r2d2;
        }
    }

    public static void rellenartableroyodaMUROS(){
        int filaMurosYoda, columnaMurosYoda;
        for (int i = 0; i < 5; i++) {
            do {
                filaMurosYoda = randomizar.nextInt(MAX_FILA);
                columnaMurosYoda = randomizar.nextInt(MAX_COLUMNA);
            }while(tableroYoda[filaMurosYoda][columnaMurosYoda] != vacio);
            tableroYoda[filaMurosYoda][columnaMurosYoda] = muro;
        }
    }

    public static void rellenartablerovaderMUROS(){
        int filaMuroVADER, columnaMuroVader;
        for (int i = 0; i < 5; i++) {
            do {
                filaMuroVADER = randomizar.nextInt(MAX_FILA);
                columnaMuroVader = randomizar.nextInt(MAX_COLUMNA);
            } while (tableroVader[filaMuroVADER][columnaMuroVader] != vacio);
            tableroVader[filaMuroVADER][columnaMuroVader] = muro;
        }
    }



    public static void main(String[] args) {
        rellenartableroYodavacio();
        rellenartableroYodaYODA();
        rellenartableryodaDARTHMAUL();
        rellenartableroyodaMUROS();
        imprimirtableroYoda();

        System.out.println("");

        rellenartableroVadervacio();
        rellenartablerovaderVADER();
        rellenartablervaderR2D2();
        rellenartablerovaderMUROS();
        imprimirtableroVader();
    }
}