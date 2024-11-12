import java.util.Scanner;

public class Main {
    private static final String[] PALABRAS = {"sol", "luna", "estrella", "cielo", "mar", "montaña", "río", "nube", "flor", "árbol"};
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        iniciarJuego();
        SCANNER.close();
    }

    public static void iniciarJuego() {
        String[] respuestas = new String[PALABRAS.length];
        inicializarRespuestas(respuestas);

        for (int i = 0; i < PALABRAS.length; i++) {
            procesarTurno(respuestas, i);
        }

        mostrarMensajeFinal();
    }

    public static void inicializarRespuestas(String[] respuestas) {
        // Inicializar el array respuestas con valores vacíos
        for (int i = 0; i < respuestas.length; i++) {
            respuestas[i] = "";
        }
    }

    public static void procesarTurno(String[] respuestas, int turno) {
        mostrarPalabra(PALABRAS[turno]);
        respuestas[turno] = PALABRAS[turno];

        if (!verificarRespuesta(respuestas, turno)) {
            System.out.println("Intenta de nuevo desde el inicio.");
            reiniciarJuego(respuestas);
        } else {
            System.out.println("¡Correcto! Sigue a la siguiente palabra.\n");
        }
    }

    public static void mostrarPalabra(String palabra)
    {
        System.out.println("Palabra a memorizar: " + palabra);
    }

    public static boolean verificarRespuesta(String[] respuestas, int hasta) {
        System.out.print("Escribe todas las palabras memorizadas hasta ahora: ");
        String entrada = SCANNER.nextLine();

        String secuenciaCorrecta = construirSecuenciaCorrecta(respuestas, hasta);
        if (!entrada.equals(secuenciaCorrecta)) {
            System.out.println("¡Incorrecto! La secuencia era: " + secuenciaCorrecta);
            return false;
        }
        return true;
    }

    public static String construirSecuenciaCorrecta(String[] respuestas, int hasta) {
        StringBuilder correctas = new StringBuilder();
        for (int j = 0; j <= hasta; j++) {
            correctas.append(respuestas[j]).append(" ");
        }
        return correctas.toString().trim();
    }

    public static void reiniciarJuego(String[] respuestas) {
        for (int i = 0; i < respuestas.length; i++) {
            respuestas[i] = "";  // Limpiar el array de respuestas
        }
        iniciarJuego();  // Reiniciar el juego desde el principio
    }

    public static void mostrarMensajeFinal() {
        System.out.println("¡Felicidades! Has memorizado todas las palabras correctamente.");
    }
}
/*
HE ENTENDIDO QUE EL STRING BUILDER LO QUE SE USA ES PARA PODER "OPERAR" POR ASÍ DECIRLO ENTRE STRINGS
DE TAL FORMA QUE NOSOTROS PODREMOS AHORRAR ESPACIO EN MEMORIA Y NO TENDREMOS QUE ESTAR CONSTANTEMENTE DEFINIENDO
VARIABLES DE STRING Y ASIGNANDOLES VALORES; SINO QUE CON ESA SIMPLE FUNCIÓN Y UTILIZANDO COSAS COMO APPEND
PODEMOS SUMAR LOS STRINGS DE UNA FORMA SENCILLA Y SIN GASTAR MÁS RECURSOS, USAR MUCHAS LÍNEAS ,ETC...
NOS AYUDA A CONCATENAR CADENAS.
 */