package ARMA;

public abstract class Arma {

    //ATRIBUTOS

    protected String nombreArma;
    protected int potencia;


    //CONSTRUCTOR

    public Arma(String nombreArma, int potencia) {
        this.nombreArma = nombreArma;
        this.potencia = potencia;
    }


    //MÉTODOS QUE HEREDARÁN


    public String getNombreArma() {
        return nombreArma;
    }

    public int getPotencia() {
        return potencia;
    }

    // TO STRING


    @Override
    public String toString() {
        return "Arma{" +
                "nombreArma='" + nombreArma + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
