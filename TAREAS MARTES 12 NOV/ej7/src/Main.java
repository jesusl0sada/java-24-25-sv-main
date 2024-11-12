import java.util.Scanner;

public class Main {
    static int suma;
    static int n;
    static Scanner lectornum = new Scanner(System.in);
    public static void solicituddeNumero(){
        System.out.print("Introduce un número entero positivo: ");
        int n = lectornum.nextInt();
        suma = 0;
    }
    public static void calculosumaPares() {
        for (int i = 2; i <= n; i += 2) { // ES SIMPLEMENTE IR RECORRIENDO DE DOS EN DOS Y NO DE UNO EN UNO; ASI ANALIZAS LA MITAD.
            if (i % 2 == 0) {
                suma += i;
            }
        }
    }
    public static void resultadoImpreso(){
        System.out.println("La suma de los números pares de 1 a " + n + " es: " + suma);
        lectornum.close();
    }
    public static void main(String[] args) {
        solicituddeNumero();
        calculosumaPares();
        resultadoImpreso();
    }
}
