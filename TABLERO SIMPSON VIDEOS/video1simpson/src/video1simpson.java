package video1simpson;

import java.util.Random;

public class video1simpson {
    //0ª) Creo la variable tablero, a la cual luego le daremos valores, ahora sólo es algo que existe en memoria pero no posee ningún valor, hemos definido la variable que será una matriz.
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10; // CON ESTO ESTAMOS CREANDO UNA VARIABLE DE FILAS PARA NO TENER QUE ESTAR CAMBIANDO TODO EL RATO MANUALMENTE LAS FILAS, ASÍ SOLO DEBEREMOS CAMBIARLAS AQUI EN ESTA VARIABLE Y SE CAMBIARÁN EN LAS DEMÁS.
    private static char[][] tablero;

    public static void main(String[] args) {
        // 1º) Inicializo la variable de tablero con filas y columnas, pero aún no tienen valores, solo tenemos el hueco.
        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO]; // es como si tenemos en excel 10x10 casillas vacías que tenemso que llenar ahora.
        //2º) Rellenar el tablero 'L' a partir de un eje de coordenadas, como si fueran en excel la fila y columna
        for (int i = 0; i < MAX_FILA_TABLERO; i++) { // LO RELLENAMOS CON BUCLES, EN ESTE CASO FORI
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                // señalamos el tablero q es la matriz, como si fueran las sillas, llenalo de L.
                // [0,0] [1,0], [2,0], [3,0], es decir llena primero columnas, luego filas, se ejecuta el bucle hasta el máximo de la columna del tablero, entonces dirá que no es mayor que lo que hemos definido y empezará a llenar lo otro.
                tablero[i][j] = 'L';
            }
        }
        // 3º IMPRIMIMOS EL TABLERO CON sout.
        imprimirTablero();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        //4ª Asignar a Bart
        Random aleatorio = new Random(); // creamos una clase llamada aleatorio
        int filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO); // 0-N-1 SIEMPRE (0 A 9) PORQUE AQUÍ SON 10 EN PSEINT NO
        int columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO); // RELLENAMOS LAS FILAS Y COLUMNAS DE NÚMEROS ALEATORIOS.
        // HEMOS SEÑALADO EN EL TABLERO, APUNTANDO AL ARRAY, ESTAMOS PUNTUANDO/ SEÑALANDO A POSICIONES ALEATORIOS QUE VAN DEL 0 AL 9 EN LAS COLUMNAS Y EN LAS FILAS, Y VAMOS DICIENDO [][] PORQUE ES UNA MATRIZ CON FILAS Y COLUMNAS.
        tablero[filaAleatorio][columnaAleatorio] = 'B'; // TENEMOS QUE IMPRIMIRLO
        //5º IMPRIMIMOS EL TABLERO OTRA VEZ CON BART
        imprimirTablero();

        System.out.println("");
        System.out.println("");
        // 6º) REPARTIR 10 HOMER DENTRO DEL TABLERO.
        // YA TENEMOS CREADO UN PUNTERO EN MEMORIA QUE TE CREA COSAS ALEATORIAS, EN ESTE CASO EN LA FILA 35 = Random aleatorio = new Random();
        // // como son 10 homer lo metemos en un fori, repetir.
        int filaAleatorioHomer;
        int columnaAleatorioHomer;
        for (int i = 0; i < 10; i++) {
            do {
                filaAleatorioHomer = aleatorio.nextInt(MAX_FILA_TABLERO); //0-9
                columnaAleatorioHomer = aleatorio.nextInt(MAX_COLUMNA_TABLERO); //0-9
            } while (tablero[filaAleatorioHomer][columnaAleatorioHomer] != 'L');
            //cuando la casilla sea distinta de L el bucle no se hará, si la encuentra si y entonces meterá un homer, así te aseguras de que esa casilla no la usa nadie mas
            tablero[filaAleatorioHomer][columnaAleatorioHomer] = 'H'; // le metemos una H, hemos tenido que crear otras 2 variables porque las anteriores estaban asociadas a una B de bart, entonces creamos dos nuevas, señalamos al tablero, y en este caso nos busca un sitio random del tablero dónde coloca 10 porque metemos esto en un bucle de 10 saltos.
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //7º VOLVEMOS A IMPRIMIR EL TABLERO YA CON LOS HOMER:
        imprimirTablero();
        int filaAleatorioMuro;
        int columnaAleatorioMuro;
        for (int i = 0; i < 10; i++) {
            do {
                filaAleatorioMuro = aleatorio.nextInt(MAX_FILA_TABLERO);
                columnaAleatorioMuro = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            } while (tablero[filaAleatorioMuro][columnaAleatorioMuro]!='L');
            tablero[filaAleatorioMuro][columnaAleatorioMuro] = 'M';
            System.out.println("");
        }
        imprimirTablero();
        tablero[MAX_FILA_TABLERO-1][MAX_COLUMNA_TABLERO-1]= 'F';
        imprimirTablero();
    }
    private static void imprimirTablero() {
        for (int i = 0; i < MAX_FILA_TABLERO; i++) { // LO RELLENAMOS CON BUCLES, EN ESTE CASO FORI
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                // señalamos el tablero q es la matriz, como si fueran las sillas, llenalo de L.
                System.out.print(tablero[i][j] + ""); // primero print y luego después del corchete le metes salto de línea.
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        }
    }


   
//PODEMOS RECOGER EL CÓDIGO PARA VER LAS PARTES, FUNCIONES, ETC...





