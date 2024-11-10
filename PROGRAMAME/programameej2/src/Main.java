import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bucle para leer todos los casos de prueba
        while (true) {
            int cantidadBloques = scanner.nextInt();  // Leer la cantidad de bloques
            if (cantidadBloques == 0) break;  // Si la entrada es 0, terminamos

            int altura = 0;         // La altura o el número de niveles de la pirámide
            int bloquesTotales = 0; // Total de bloques acumulados hasta el nivel actual

            // Construir niveles hasta alcanzar o superar la cantidad de bloques deseada
            while (bloquesTotales < cantidadBloques) {
                altura++;  // Incrementa la altura de la pirámide en 1 para agregar un nuevo nivel
                int lado = 2 * altura - 1;  // Calcula el lado del nivel actual (1, 3, 5, 7, ...)
                int bloquesNivel = lado * lado;  // Calcula los bloques necesarios para el nivel actual
                bloquesTotales += bloquesNivel;  // Suma los bloques de este nivel al total
            }

            System.out.println(altura);  // Imprime la altura mínima para la cantidad de bloques dada
        }

        scanner.close();
    }
}
