package ARMA;

public class Arco extends Arma{


    //ATRIBUTOS




    //CONSTRUCTOR

    public Arco(String nombreArma, int potencia) {
        super(nombreArma, potencia);
    }



    //MÉTODOS


    @Override
    public String toString() {
        return "Arco{" +
                "nombreArma='" + nombreArma + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
