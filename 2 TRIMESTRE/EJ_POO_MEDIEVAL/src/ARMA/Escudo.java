package ARMA;

public class Escudo {

    //ATRIBUTOS

    String nombre;
    int resistencia;


    //CONSTRUCTOR

    public Escudo(String nombre, int resistencia) {
        this.nombre = nombre;
        this.resistencia = resistencia;
    }


    //MÉTODOS


    public String getNombre() {
        return nombre;
    }

    public int getResistencia() {
        return resistencia;
    }
}
