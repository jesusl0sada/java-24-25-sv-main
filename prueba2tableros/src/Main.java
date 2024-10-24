// herramientas
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Main {
    static int intentos=10;
    static int[][] tablerooculto = new int[10][10];
    static String[][] tablerousuario = new String[10][10];

    // Generar el tablero oculto con números aleatorios
    public static void tableroOculto() {
        Random randomizartablero = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablerooculto[i][j] = randomizartablero.nextInt(90) + 10; // Números del 10 al 99
            }
        }
    }
    public static void imprimirTableroOculto() {
        System.out.println("Este es el tablero oculto:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablerooculto[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void tableroUsuario() {
        System.out.println("Este es el tablero del usuario:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablerousuario[i][j] = "XX";  // Asignar 'X' en cada posición
                System.out.print(tablerousuario[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // Preguntar al usuario por 10 números
    public static void preguntaalUsuario() {
        Scanner lector = new Scanner(System.in);
        for (int k = 0; k < 10; k++) {
            System.out.println("Introduce un número que creas que está en el tablero:");
            int numerosuario = lector.nextInt();
            comprobarcoincidencia(numerosuario);
        }
    }

    // Comprobar si el número del usuario está en el tablero oculto y revelar su posición
    public static void comprobarcoincidencia(int numerosuario) {
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tablerooculto[i][j] == numerosuario) {
                    tablerousuario[i][j] = (String) (numerosuario + "");  // Revelar el número
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("El número " + numerosuario + " no está en el tablero.");
            intentos = intentos - 1;
            System.out.println("Intentos restantes: " + intentos);
        } else {
            System.out.println("¡Número encontrado!");
            intentos = intentos-1;
            System.out.println("Intentos restantes: " +  intentos );

        }
        ImprimirTableroUsuario();
    }

    // Imprimir el tablero del usuario con las coincidencias reveladas
    public static void ImprimirTableroUsuario() {
        System.out.println("PRUEBA DE NUEVO EN EL TABLERO:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablerousuario[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        tableroOculto();  // Generar el tablero oculto
        tableroUsuario(); // Inicializar el tablero de usuario
        preguntaalUsuario();// Pedir números al usuario
    }
}




