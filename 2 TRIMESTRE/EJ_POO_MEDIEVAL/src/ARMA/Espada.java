package ARMA;

public class Espada extends Arma{


    //ATRIBUTOS



    //CONSTRUCTOR
    public Espada(String nombreArma, int potencia) {
        super(nombreArma, potencia);
    }


    //MÉTODOS


    //TO STRING


    @Override
    public String toString() {
        return "Espada{" +
                "nombreArma='" + nombreArma + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
