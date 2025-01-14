import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final int SIZE = 4; // Tamaño del tablero (4x4)
    private static int[][] tableroOculto = new int[SIZE][SIZE]; // Tablero oculto con parejas
    private static char[][] tableroUsuario = new char[SIZE][SIZE]; // Tablero visible del usuario con 'X'
    private static int numeroSeleccionado; // Número seleccionado por el usuario
    private static ArrayList<int[]> posicionesReveladas = new ArrayList<>(); // Lista para almacenar posiciones reveladas

    public static void main(String[] args) {
        generarTableroOculto(); // Generar el tablero oculto
        inicializarTableroUsuario(); // Inicializar el tablero del usuario
        jugar(); // Iniciar el ciclo del juego
    }

    public static void generarTableroOculto() {
        System.out.println("--MEMORIZA LAS POSICIONES EN LAS QUE ESTÁN LAS PAREJAS...");
        ArrayList<Integer> listaNumeros8 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j <= 8; j++) {
                listaNumeros8.add(j);
            }
        }
        Collections.shuffle(listaNumeros8); // Mezclar los números

        // Llenar el tablero oculto con los números mezclados
        int index = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tableroOculto[i][j] = listaNumeros8.get(index++);
            }
        }
    }

    public static void inicializarTableroUsuario() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tableroUsuario[i][j] = 'X'; // Inicializa con 'X'
            }
        }
    }

    public static void jugar() {
        while (true) {
            solicitudNumero(); // Solicitar un número al usuario
            mostrarTableroOculto(); // Mostrar el tablero oculto
            pausar(2000); // Pausar por 2 segundos
            ocultarTablero(); // Regresar a mostrar el tablero del usuario

            // Pedir coordenadas al usuario
            int[] coordenadas = solicitarCoordenadas();
            if (coordenadas != null) {
                int x = coordenadas[0];
                int y = coordenadas[1];

                // Verificar si acierta
                if (tableroOculto[x][y] == numeroSeleccionado) {
                    System.out.println("¡Acertaste! Se revela una pareja.");
                    revelarPosicion(x, y); // Revelar la posición seleccionada
                    // Buscar y revelar la otra posición del mismo número
                    buscarYRevelarOtraPosicion();
                } else {
                    System.out.println("Fallaste. Intenta de nuevo.");
                    // Aquí puedes implementar lógica adicional si lo deseas
                }
                mostrarTableroUsuario(); // Muestra el estado actualizado del tablero del usuario
            }
        }
    }

    public static void mostrarTableroOculto() {
        System.out.println("Tablero Oculto:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(tableroOculto[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void ocultarTablero() {
        System.out.println("\nTablero del Usuario (oculto):");
        mostrarTableroUsuario(); // Muestra el tablero del usuario
    }

    public static void mostrarTableroUsuario() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(tableroUsuario[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void solicitudNumero() {
        System.out.println("Introduce un número del 1 al 8:");
        Scanner lector = new Scanner(System.in);
        numeroSeleccionado = lector.nextInt();

        // Validación del número
        while (numeroSeleccionado < 1 || numeroSeleccionado > 8) {
            System.out.println("El número no está entre el rango deseado, introduce otro...");
            numeroSeleccionado = lector.nextInt();
        }
        System.out.println("Has seleccionado el número " + numeroSeleccionado);
    }

    public static int[] solicitarCoordenadas() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce las coordenadas de la pareja (X Y):");
        int x = lector.nextInt();
        int y = lector.nextInt();

        // Validación de coordenadas
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            System.out.println("Coordenadas no válidas. Deben estar entre 0 y " + (SIZE - 1));
            return null; // Retorna null si las coordenadas son inválidas
        }
        return new int[]{x, y}; // Retorna las coordenadas válidas
    }

    public static void pausar(int milliseconds) {
        try {
            Thread.sleep(milliseconds); // Pausa por el tiempo especificado
        } catch (InterruptedException e) {
            e.printStackTrace(); // Manejo de excepciones
        }
    }

    public static void revelarPosicion(int x, int y) {
        tableroUsuario[x][y] = (char) ('0' + numeroSeleccionado); // Revelar la posición en el tablero del usuario
        posicionesReveladas.add(new int[]{x, y}); // Agregar posición revelada a la lista
    }
    
    public static void buscarYRevelarOtraPosicion() {
        boolean encontrado = false;
        for (int i = 0; i < SIZE && !encontrado; i++) {
            for (int j = 0; j < SIZE && !encontrado; j++) {
                if (tableroOculto[i][j] == numeroSeleccionado && !posicionesReveladas.contains(new int[]{i, j})) {
                    tableroUsuario[i][j] = (char) ('0' + numeroSeleccionado); // Revelar la otra posición en el tablero del usuario
                    posicionesReveladas.add(new int[]{i, j}); // Agregar posición revelada a la lista
                    encontrado = true; // Se encontró la otra posición
                }
            }
        }
    }
}
