import java.util.Random;


public class bingoej4 {
    public static void main(String[] args) {
        Random random = new Random();
        int ArrayRandom = random.nextInt();
        int[][] matriz = new int[3][9];
        for (int i = 3; i <9 ; i++) {
            for (int j = 3; j <9 ; j++) {
                matriz[i][j] = ArrayRandom.nextInt
            }
            System.out.println("");
        }
    }
}