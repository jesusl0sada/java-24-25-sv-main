package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

public abstract class PielVerde extends WarhammerPersonaje {  // ME PIDEN NOMBRE Y PUEBLO DE NACIMIENTO

    // NOMBRE YA LE VIENE HEREDADO ASI QUE LE METEMOS PUEBLO

    //ATRIBUTOS
    protected String puebloNacimiento;
    protected static int contPielesVerdes;
    protected int nivel;

    // CONSTRUCTOR -> con el pueblo de nacimiento y el nivel

    public PielVerde(String nombre, String puebloNacimiento) {
        super(nombre);
        this.puebloNacimiento = puebloNacimiento;
    }

    //MÉTODOS HEREDADOS

    @Override
    public void SumarEnergia() {
        super.SumarEnergia();
    }



    //MÉTODOS PROPIOS -> EXTIENDE

    // GETTER , SETTER
    // NOS PIDEN SOLO EL GET CONTADOR PIELES VERDER

    public static int getContPielesVerdes() {
        return contPielesVerdes;
    }

    // MÉTODO AÑADIR ARMA ATAQUE

    public void addArmaAtaque(ArmaAtaque arma){ // LE TENDRÁS QUE METER PARÁMETRO DE ENTRADA PASARLE UN ARMA DE ATAQUE, ESTA CLASE LA PREPARAREMOS LUEGO.

    }


    // MÉTODO AÑADIR ARMA DEFENSA

    public void addArmaDefensa(ArmaDefensa arma){ // LE TENDRÁS QUE METER PARÁMETRO DE ENTRADA PASARLE UN ARMA DE DEFENSA, ESTA CLASE LA PREPARAREMOS LUEGO.

    }

    @Override
    public String imprimirArmas(){
        // ESTAS ARMAS LAS TIENES QUE RECORRER DEL HASHMAP DE ARMAS E IMPRIMIRLAS
        // RECORRER HAS MAP, Y PREPARAR CADENA
        return "";
    }

    // MÉTODOS DE LA INTERFAZ QUE TIENE EL PADRE


    @Override
    public void atacar(WarhammerPersonaje victima, boolean esAtaqueEmperador) {
        super.atacar(victima, esAtaqueEmperador);
    }

    @Override
    public void defender(ArmaAtaque arma) {
        super.defender(arma);
    }


    // TO STRING


    @Override
    public String toString() {
        return "PielVerde{" +
                "puebloNacimiento='" + puebloNacimiento + '\'' +
                ", nivel=" + nivel +
                '}';
    }

}
