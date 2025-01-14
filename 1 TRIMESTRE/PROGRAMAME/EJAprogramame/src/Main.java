import java.util.Scanner;

public class Main {
    public static int A;
    public static int B;
    public static int C;

    public static void Pedirnumeros() {
        Scanner lector = new Scanner(System.in);  // Declaración del Scanner

        // Bucle para pedir A con las condiciones
        do {
            System.out.println("Introduce un número A dentro del rango (-100000, 100000) y que no sea 0:");
            A = lector.nextInt();
            if (A <= -100001 || A >= 100001 || A == 0) {
                System.out.println("Número inválido. Inténtalo de nuevo.");
            }
        } while (A <= -100001 || A >= 100001 || A == 0);

        // Bucle para pedir B con las condiciones
        do {
            System.out.println("Introduce un número B dentro del rango (-100000, 100000) y que no sea 0:");
            B = lector.nextInt();
            if (B <= -100001 || B >= 100001 || B == 0) {
                System.out.println("Número inválido. Inténtalo de nuevo.");
            }
        } while (B <= -100001 || B >= 100001 || B == 0);

        // Bucle para pedir C con las condiciones
        do {
            System.out.println("Introduce un número C dentro del rango (-100000, 100000) y que no sea 0:");
            C = lector.nextInt();
            if (C <= -100001 || C >= 100001 || C == 0) {
                System.out.println("Número inválido. Inténtalo de nuevo.");
            }
        } while (C <= -100001 || C >= 100001 || C == 0);

        // Mostrar los números escogidos
        System.out.println("Has escogido el número A = " + A);
        System.out.println("Has escogido el número B = " + B);
        System.out.println("Has escogido el número C = " + C);

        lector.close();
    }

    public static void CompararCasos() {
        // Comparaciones de los valores
        if (A > B && B > C) {
            System.out.println("A es mayor que B, y B es mayor que C (A > B > C)");
        } else if (A > B && B == C) {
            System.out.println("A es mayor que B y C, pero B y C son iguales (A > B = C)");
        } else if (A == B && B > C) {
            System.out.println("A y B son iguales, y ambos son mayores que C (A = B > C)");
        } else if (A == B && B == C) {
            System.out.println("A, B y C son iguales");
        } else if (A < B && B < C) {
            System.out.println("A es menor que B, y B es menor que C (A < B < C)");
        } else if (A < B && B == C) {
            System.out.println("A es menor que B, y B es igual que C");
        } else if (A == C && C > B) {
            System.out.println("A y C son iguales y mayores que B.");
        } else if (A == C && C < B) {
            System.out.println("A y C son iguales y menores que B.");
        } else {
            System.out.println("No se detectó ninguna relación específica entre A, B y C.");
        }
    }

    public static void main(String[] args) {
        Pedirnumeros();
        CompararCasos();
    }
}








