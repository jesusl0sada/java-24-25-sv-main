package ARMA;

public class Lanza extends Arma{



    //ATRIBUTOS




    //CONSTRUCTOR

    public Lanza(String nombreArma, int potencia) {
        super(nombreArma, potencia);
    }




    //MÉTODOS


    @Override
    public String toString() {
        return "Lanza{" +
                "nombreArma='" + nombreArma + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
