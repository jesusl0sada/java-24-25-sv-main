import java.util.Scanner;

public class Main {

    // Apartado de funciones tenemos 3, impresión de los bloques y bloques en sí.
    static String block;

    // Función para imprimir el bloque seleccionado
    public static void imprimirBloque() {
        System.out.println("Has seleccionado el bloque " + block);
    }

    // Función que maneja la selección de bloques
    public static void bloques() {
        // Crear escáner
        Scanner lector = new Scanner(System.in);

        // Bucle para pedir al usuario que introduzca el bloque hasta que sea válido
        do {
            // Pedir al usuario que introduzca el parámetro
            System.out.println("Introduce el bloque que quieres utilizar:");
            block = lector.nextLine().toUpperCase();  // Convertimos la entrada a mayúsculas

            // Switch para los bloques
            switch (block) {
                case "IRON", "BED", "BED_BLOCK", "CACTUS", "BRICK_STAIRS", "BIRCH_WOOD_STAIRS",
                     "BREWING_STAND", "CAKE", "CAKE_BLOCK", "CAULDRON", "CHEST", "CLAY",
                     "SAND", "BURNING_FURNACE", "COBBLESTONE_STAIRS", "FENCE", "FENCE_GATE",
                     "FIRE", "GRAVEL", "IRON_DOOR_BLOCK", "IRON_FENCE", "IRON_DOOR",
                     "LADDER", "MELON", "LEAVES", "LOCKED_CHEST", "SANDSTONE_STAIRS":
                    imprimirBloque();
                    break;
                default:
                    System.out.println("Bloque no reconocido. Por favor, intenta de nuevo.");
                    break; // Si no es válido, se repite el bucle
            }
        } while (!isBloqueValido(block)); // Continuar hasta que se introduzca un bloque válido

        // Cerrar el escáner
        lector.close();
    }

    // Función para verificar si el bloque es válido
    public static boolean isBloqueValido(String bloque) {
        return switch (bloque) {
            case "IRON", "BED", "BED_BLOCK", "CACTUS", "BRICK_STAIRS", "BIRCH_WOOD_STAIRS",
                 "BREWING_STAND", "CAKE", "CAKE_BLOCK", "CAULDRON", "CHEST", "CLAY",
                 "SAND", "BURNING_FURNACE", "COBBLESTONE_STAIRS", "FENCE", "FENCE_GATE",
                 "FIRE", "GRAVEL", "IRON_DOOR_BLOCK", "IRON_FENCE", "IRON_DOOR",
                 "LADDER", "MELON", "LEAVES", "LOCKED_CHEST", "SANDSTONE_STAIRS" -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        // Llamada a la función para ejecutar el código
        bloques();
    }
}


