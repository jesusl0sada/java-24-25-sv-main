import java.util.Scanner;
public class Main {
    public static void Pedirnumeros() {
            System.out.println("Escribe un número");
            Scanner lector = new Scanner(System.in);
            int A = lector.nextInt();
            int B = lector.nextInt();
            int C = lector.nextInt();
            System.out.println("Has escogido el número"  +A);
            System.out.println("Has escogido el número"  +B);
            System.out.println("Has escogido el número"  +C);
        }
    }
    public static void main(String[] args) {
    Pedirnumeros();

    }
}


