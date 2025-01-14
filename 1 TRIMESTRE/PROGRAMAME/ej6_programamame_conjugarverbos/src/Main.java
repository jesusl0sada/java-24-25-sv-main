import java.util.Scanner;

public class Main {

    // Método que conjuga un verbo en presente según la persona indicada
    public static String conjugarPresente(String verbo, String sujeto) {
        String raizVerbo = verbo.substring(0, verbo.length() - 2); // Obtener la raíz eliminando "ar", "er", o "ir"
        String sufijo = ""; // Sufijo que se agregará a la raíz

        // Verificar la terminación del verbo y conjugar según la persona
        if (verbo.endsWith("ar")) {
            switch (sujeto) {
                case "yo": sufijo = "o"; break;
                case "tu": sufijo = "as"; break;
                case "el": sufijo = "a"; break;
                case "nosotros": sufijo = "amos"; break;
                case "vosotros": sufijo = "áis"; break;
                case "ellos": sufijo = "an"; break;
            }
        } else if (verbo.endsWith("er")) {
            switch (sujeto) {
                case "yo": sufijo = "o"; break;
                case "tu": sufijo = "es"; break;
                case "el": sufijo = "e"; break;
                case "nosotros": sufijo = "emos"; break;
                case "vosotros": sufijo = "éis"; break;
                case "ellos": sufijo = "en"; break;
            }
        } else if (verbo.endsWith("ir")) {
            switch (sujeto) {
                case "yo": sufijo = "o"; break;
                case "tu": sufijo = "es"; break;
                case "el": sufijo = "e"; break;
                case "nosotros": sufijo = "imos"; break;
                case "vosotros": sufijo = "ís"; break;
                case "ellos": sufijo = "en"; break;
            }
        }
        return sujeto + " " + raizVerbo + sufijo;
    }

    // Método que conjuga un verbo en pretérito según la persona indicada
    public static String conjugarPreterito(String verbo, String sujeto) {
        String raizVerbo = verbo.substring(0, verbo.length() - 2);
        String sufijo = "";

        // Conjugar verbos terminados en "ar"
        if (verbo.endsWith("ar")) {
            switch (sujeto) {
                case "yo": sufijo = "é"; break;
                case "tu": sufijo = "aste"; break;
                case "el": sufijo = "ó"; break;
                case "nosotros": sufijo = "amos"; break;
                case "vosotros": sufijo = "asteis"; break;
                case "ellos": sufijo = "aron"; break;
            }
        }
        // Conjugar verbos terminados en "er" o "ir"
        else if (verbo.endsWith("er") || verbo.endsWith("ir")) {
            switch (sujeto) {
                case "yo": sufijo = "í"; break;
                case "tu": sufijo = "iste"; break;
                case "el": sufijo = "ió"; break;
                case "nosotros": sufijo = "imos"; break;
                case "vosotros": sufijo = "isteis"; break;
                case "ellos": sufijo = "ieron"; break;
            }
        }
        return sujeto + " " + raizVerbo + sufijo;
    }

    // Método que conjuga un verbo en futuro según la persona indicada
    public static String conjugarFuturo(String verbo, String sujeto) {
        String sufijo = "";

        // Todos los verbos regulares tienen las mismas terminaciones en futuro
        switch (sujeto) {
            case "yo": sufijo = "é"; break;
            case "tu": sufijo = "ás"; break;
            case "el": sufijo = "á"; break;
            case "nosotros": sufijo = "emos"; break;
            case "vosotros": sufijo = "éis"; break;
            case "ellos": sufijo = "án"; break;
        }
        return sujeto + " " + verbo + sufijo;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean esPrimeraVez = true;

        // Bucle principal para solicitar verbos y tiempos al usuario
        while (true) {
            System.out.print("Introduce un verbo: ");
            String verbo = entrada.next();
            System.out.print("Introduce el tiempo (A para presente, P para pretérito, F para futuro, T para terminar): ");
            String tiempo = entrada.next();

            // Si el usuario ingresa "T", finaliza el programa
            if (tiempo.equals("T")) break;

            // Añadir un salto de línea para mejorar la legibilidad
            if (!esPrimeraVez) {
                System.out.println();
            }
            esPrimeraVez = false;

            // Array de personas para conjugar el verbo
            String[] sujetos = {"yo", "tu", "el", "nosotros", "vosotros", "ellos"};

            // Conjugar el verbo según el tiempo solicitado
            for (String sujeto : sujetos) {
                switch (tiempo) {
                    case "A":
                        System.out.println(conjugarPresente(verbo, sujeto));
                        break;
                    case "P":
                        System.out.println(conjugarPreterito(verbo, sujeto));
                        break;
                    case "F":
                        System.out.println(conjugarFuturo(verbo, sujeto));
                        break;
                    default:
                        System.out.println("Tiempo no válido.");
                }
            }
        }
        entrada.close(); // Cerrar el scanner para evitar fugas de memoria
    }
}

