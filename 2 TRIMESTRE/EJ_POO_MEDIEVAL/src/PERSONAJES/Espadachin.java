package PERSONAJES;

public class Espadachin extends Guerrero{


    //ATRIBUTOS



    //CONSTRUCTOR

    public Espadachin(String nombre) {
        super(nombre);
    }


    //MÉTODOS PROPIOS


    public void ataqueEspecial(Guerrero objetivo) {
        int dmg = 40;
        System.out.println("Se va a ejecutar el ataque especial" + getClass().getSimpleName());
        System.out.println("---POLLAZO SUPERSÓNICO---");
        objetivo.restarSalud(dmg);
        System.out.println(objetivo + "ha recibido" + dmg);
    }

}
