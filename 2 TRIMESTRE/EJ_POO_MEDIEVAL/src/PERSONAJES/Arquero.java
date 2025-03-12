package PERSONAJES;

public class Arquero extends Guerrero{



    //ATRIBUTOS



    //CONSTRUCTOR

    public Arquero(String nombre) {
        super(nombre);
    }



    //MÉTODOS PROPIOS


    public void ataqueEspecial(Guerrero objetivo) {
        int dmg = 20;
        System.out.println("Se va a ejecutar el ataque especial" + getClass().getSimpleName());
        System.out.println("---POLLAZO CÓSMICO---");
        objetivo.restarSalud(dmg);
        System.out.println(objetivo + "ha recibido" + dmg);
    }
}
