package ARMAS;

public class Hacha extends ArmaAtaque{


    //ATRIBUTOS

    final int VIDA_CONSUMIDA = 5;

    // CONSTRUCTOR
    public Hacha(String nombre) {
        super(nombre);
    }

    // MÉTODOS HEREDADOS DE LA CLASE


    // MÉTODOS PROPIOS -> toString, getVIDAConsumida


    public int getVIDA_CONSUMIDA() {
        return VIDA_CONSUMIDA;
    }

    @Override
    public String toString() {
        return "Hacha{" +
                "VIDA_CONSUMIDA=" + VIDA_CONSUMIDA +
                '}';
    }

}

