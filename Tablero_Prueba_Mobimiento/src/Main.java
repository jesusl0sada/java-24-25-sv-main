import java.util.Random;
import java.util.Scanner;

public class Main {
    static char vacio = 'L';
    static int MAX_FILA = 5;
    static char yoda = 'Y';
    static Random randomizar = new Random();
    static int MAX_COLUMNA = 5;

    static int vidas = 3;
    static char tablero[][] = new char[MAX_FILA][MAX_COLUMNA];
    public static void tablero() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                tablero[i][j] = vacio;
            }
        }
    }
    public static void imprimirtablero() {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void llenartablero(){
        int filayoda, columnayoda;
        for (int i = 0; i < 1; i++) {
            do {
                filayoda = randomizar.nextInt(MAX_FILA);
                columnayoda = randomizar.nextInt(MAX_COLUMNA);
            }while(tablero[filayoda][columnayoda] != vacio);
            tablero[filayoda][columnayoda] = yoda;
        }
        System.out.println("¿En qué dirección te quieres mover W/A/S/D?");
        Scanner lectormovimientos = new Scanner(System.in);
        String movimiento = lectormovimientos.nextLine();
        if(movimiento.equals("W")) columnayoda = columnayoda - 1;
    }
    public static void movimiento(){


    }
    public static void main(String[] args) {
    tablero();
    llenartablero();
    imprimirtablero();
    movimiento();
        }
    }
