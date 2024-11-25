import java.util.Arrays;
public class Main {
    static int MAX_ARRAY = 10;
    static int array[] = new int[MAX_ARRAY];

    public static void arrayAscendente(){
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println("Array en orden ascendente: " + Arrays.toString(array));
    }
    public static void arrayInverso(){
        System.out.print("Array en orden inverso: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void arrayPares(){
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        System.out.println("Array con números pares: " + Arrays.toString(array));
    }
    public static void arraydeDosenDos(){
        System.out.print("Elementos de dos en dos: ");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print("[" + array[i] + ", " + (i + 1 < array.length ? array[i + 1] : " ") + "] ");
        }
        System.out.println();
    }
    public static void arrayImpares(){
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 1;
        }
        System.out.println("Array con números impares: " + Arrays.toString(array));
    }
    public static void duplicarelementoArray(){
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        System.out.println("Array con cada elemento duplicado: " + Arrays.toString(array));
    }
    public static void calcularsumaelementosArray(){
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        System.out.println("Suma de todos los elementos: " + suma);
    }
    public static void buscarMaxMinArray(){
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
    }

    public static void main(String[] args) {
        // EJEMPLO
        arrayPares();
        buscarMaxMinArray();
    }
}

