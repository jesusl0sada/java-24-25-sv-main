import java.util.Random;
public class bingo {
    public static void main(String[] args) {
        //CREAMOS UN ARRAY DE 3X9
        // lo llenamos de números aleatorios.
        Random rellenaraleatorios = new Random(); // queda definida la herramienta de rellenar aleatorios como rellenaraleatorios
        int array[][] = new int[3][9]; // definido el array de 3x9
        // recorremos el array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                array[i][j] = rellenaraleatorios.nextInt(20); // en la array siempre poner sus casillas.
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
