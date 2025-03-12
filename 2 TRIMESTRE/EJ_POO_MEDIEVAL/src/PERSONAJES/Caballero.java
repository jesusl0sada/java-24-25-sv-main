package PERSONAJES;

public class Caballero extends Guerrero{



    //ATRIBUTOS



    //CONSTRUCTOR

    public Caballero(String nombre) {
        super(nombre);
    }


    //MÉTODOS PROPIOS


    public void ataqueEspecial(Guerrero objetivo) {
        int dmg = 30;
        System.out.println("Se va a ejecutar el ataque especial" + getClass().getSimpleName());
        System.out.println("---POLLAZO GALÁCTICO---");
        objetivo.restarSalud(dmg);
        System.out.println(objetivo + "ha recibido" + dmg);
    }

}
