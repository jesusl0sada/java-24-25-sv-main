import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int FILAS = 10;
    private static final int COLUMNAS = 10;
    private static char[][] campo1;
    private static char[][] campo2;
    private static int posicionYodaFila;
    private static int posicionYodaColumna;
    private static int posicionVaderFila;
    private static int posicionVaderColumna;
    static int saludVader = 3;
    static int saludYoda = 3;

    // Método para llenar el tablero con 'L' (espacios libres).
    private static void llenarTablero1(char simbolo) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                campo1[i][j] = simbolo;
            }
        }
    }

    private static void llenarTablero2(char simbolo) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                campo2[i][j] = simbolo;
            }
        }
    }

    // Método para colocar personajes en el tablero de forma aleatoria.
    private static void colocarPersonajesEnTablero1(char simbolo, int cantidad) {
        Random aleatorio = new Random();
        int filaRandomYoda = -1;
        int columnaRandomYoda = -1;
        for (int i = 0; i < cantidad; i++) {
            do {
                filaRandomYoda = aleatorio.nextInt(FILAS);
                columnaRandomYoda = aleatorio.nextInt(COLUMNAS);
            } while (campo1[filaRandomYoda][columnaRandomYoda] != 'L');
            campo1[filaRandomYoda][columnaRandomYoda] = simbolo;
        }
        if (simbolo == 'Y') {
            posicionYodaFila = filaRandomYoda;
            posicionYodaColumna = columnaRandomYoda;
        }
    }

    private static void colocarPersonajesEnTablero2(char simbolo, int cantidad) {
        Random aleatorio = new Random();
        int filaRandomVader = -1;
        int columnaRandomVader = -1;
        for (int i = 0; i < cantidad; i++) {
            do {
                filaRandomVader = aleatorio.nextInt(FILAS);
                columnaRandomVader = aleatorio.nextInt(COLUMNAS);
            } while (campo2[filaRandomVader][columnaRandomVader] != 'L');
            campo2[filaRandomVader][columnaRandomVader] = simbolo;
        }
        if (simbolo == 'V') {
            posicionVaderFila = filaRandomVader;
            posicionVaderColumna = columnaRandomVader;
        }
    }

    // Método para imprimir el tablero.
    private static void mostrarTablero1() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(campo1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }

    private static void mostrarTablero2() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(campo2[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }

    public static void main(String[] args) {
        campo1 = new char[FILAS][COLUMNAS];
        llenarTablero1('L');
        campo1[9][9] = 'F';  // Meta
        colocarPersonajesEnTablero1('Y', 1); // Yoda
        colocarPersonajesEnTablero1('D', 5); // Darth Maul
        colocarPersonajesEnTablero1('M', 5); // Muro
        colocarPersonajesEnTablero1('P', 5); // Poción

        campo2 = new char[FILAS][COLUMNAS];
        llenarTablero2('L');
        campo2[9][9] = 'F';  // Meta
        colocarPersonajesEnTablero2('V', 1); // Darth Vader
        colocarPersonajesEnTablero2('R', 5); // R2D2
        colocarPersonajesEnTablero2('M', 5); // Muro
        colocarPersonajesEnTablero2('P', 5); // Poción

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del primer jugador: ");
        String jugador1 = scanner.nextLine();
        System.out.println("Introduce el nombre del segundo jugador: ");
        String jugador2 = scanner.nextLine();

        while (saludYoda > 0 && saludVader > 0) {
            mostrarTablero1();
            System.out.println("Es el turno de " + jugador1 + " (Yoda)");
            String movimientoYoda = scanner.nextLine().toUpperCase();
            int pasosYoda = movimientoYoda.length() > 1 ? Integer.parseInt(movimientoYoda.substring(0, movimientoYoda.length() - 1)) : 1;
            char direccionYoda = movimientoYoda.charAt(movimientoYoda.length() - 1);

            moverJugador(campo1, 'Y', direccionYoda, pasosYoda);
            mostrarTablero1();

            try {
                Thread.sleep(3000); // Pausa de 3 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            mostrarTablero2();
            System.out.println("Es el turno de " + jugador2 + " (Vader)");
            String movimientoVader = scanner.nextLine().toUpperCase();
            int pasosVader = movimientoVader.length() > 1 ? Integer.parseInt(movimientoVader.substring(0, movimientoVader.length() - 1)) : 1;
            char direccionVader = movimientoVader.charAt(movimientoVader.length() - 1);

            moverJugador(campo2, 'V', direccionVader, pasosVader);
            mostrarTablero2();

            try {
                Thread.sleep(3000); // Pausa de 3 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (saludYoda <= 0) {
            System.out.println(jugador1 + " ha perdido todas las vidas. ¡GAME OVER!");
            System.out.println(jugador2 + " ha ganado!");
        } else if (saludVader <= 0) {
            System.out.println(jugador2 + " ha perdido todas las vidas. ¡GAME OVER!");
            System.out.println(jugador1 + " ha ganado!");
        }
    }

    // Método para mover los jugadores.
    private static void moverJugador(char[][] campo, char jugador, char direccion, int pasos) {
        int fila = jugador == 'Y' ? posicionYodaFila : posicionVaderFila;
        int columna = jugador == 'Y' ? posicionYodaColumna : posicionVaderColumna;

        for (int i = 0; i < pasos; i++) {
            int filaAnterior = fila;
            int columnaAnterior = columna;

            switch (direccion) {
                case 'A':
                    columna = (columna - 1 + COLUMNAS) % COLUMNAS;
                    break;
                case 'D':
                    columna = (columna + 1) % COLUMNAS;
                    break;
                case 'W':
                    fila = (fila - 1 + FILAS) % FILAS;
                    break;
                case 'S':
                    fila = (fila + 1) % FILAS;
                    break;
                case 'Q':
                    fila = (fila - 1 + FILAS) % FILAS;
                    columna = (columna - 1 + COLUMNAS) % COLUMNAS;
                    break;
                case 'E':
                    fila = (fila - 1 + FILAS) % FILAS;
                    columna = (columna + 1) % COLUMNAS;
                    break;
                case 'Z':
                    fila = (fila + 1) % FILAS;
                    columna = (columna - 1 + COLUMNAS) % COLUMNAS;
                    break;
                case 'C':
                    fila = (fila + 1) % FILAS;
                    columna = (columna + 1) % COLUMNAS;
                    break;
                default:
                    System.out.println("Movimiento no válido.");
                    return;
            }

            char posicionActual = campo[fila][columna];

            if (posicionActual == 'D' && jugador == 'Y') {
                saludYoda--;
                System.out.println("Yoda ha perdido una vida. Le quedan " + saludYoda + " vidas.");
            } else if (posicionActual == 'R' && jugador == 'V') {
                saludVader--;
                System.out.println("Vader ha perdido una vida. Le quedan " + saludVader + " vidas.");
            } else if (posicionActual == 'M') {
                System.out.println("Hay un muro. No puedes avanzar.");
                return;
            } else if (posicionActual == 'F') {
                System.out.println("¡Felicitaciones! Has llegado al final.");
                return;
            }
        }

        if (jugador == 'Y') {
            posicionYodaFila = fila;
            posicionYodaColumna = columna;
        } else {
            posicionVaderFila = fila;
            posicionVaderColumna = columna;
        }
    }
}





















