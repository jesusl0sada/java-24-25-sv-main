import pojo.*;


import pojo.Magdalena;
import pojo.MagdalenaFactory;

public class Main {
    public static void main(String[] args) {

        //EJERCICIO A TRAVES DE UN MAIN: 14-1-25
        Producto magdalena=new Producto("Magdalena de chocolate",1.50,10);
        Producto croissant=new Producto("croissant de chocolate",1.30,20);
        Producto galleta=new Producto("galleta de chocolate blanco",1.70,15);
        System.out.println(magdalena.getNombre());
        magdalena.setStock(25);

        System.out.println(magdalena.toString()); //toString devuelve cadena
        System.out.println(croissant.toString());
        System.out.println(galleta.toString());

        //crear un pedido con capacidad para 5 productos
        Pedido pedido=new Pedido(5);

        pedido.agregarProducto(magdalena,3);
        pedido.agregarProducto(croissant,5);
        pedido.agregarProducto(galleta,6);
        pedido.agregarProducto(magdalena,12);
        pedido.agregarProducto(croissant,5);
        pedido.imprimirTicket();




        
        //codigo java 9-1-25
        // Crear las magdalenas
        System.out.println("-------------------------");
        Magdalena magdalena1 = new Magdalena("Marrón", "Chocolate", "1", "Harina");
        magdalena1.setId(1);

        Magdalena magdalena2 = new Magdalena("Marrón", "Vainilla", "2", "Harina Integral");
        magdalena2.setId(2);

        Magdalena magdalena3 = new Magdalena("Rosa", "Fresa", "3", "Harina de Almendra");
        magdalena3.setId(3);

        Magdalena magdalena4 = new Magdalena("Blanco", "Limón", "4", "Harina Sin Gluten");
        magdalena4.setId(4);

        // Crear un array para almacenar las magdalenas (no se usa en la fábrica, solo como ejemplo)
        Magdalena[] listaMagdanelas = new Magdalena[10];
        listaMagdanelas[0] = magdalena1;
        listaMagdanelas[1] = magdalena2;
        listaMagdanelas[2] = magdalena3;
        listaMagdanelas[3] = magdalena4;


        // Realizar algunas operaciones en las magdalenas
        /*
        magdalena.hornear();
        magdalena.mezclar();
        magdalena.amasar();

         */

        // Añadir las magdalenas a la fábrica
        MagdalenaFactory magdalenaFactory = new MagdalenaFactory();

        magdalenaFactory.addMagdalena(magdalena1, 0);
        magdalenaFactory.addMagdalena(magdalena2, 1);
        magdalenaFactory.addMagdalena(magdalena3, 2);
        magdalenaFactory.addMagdalena(magdalena4, 3);

        // Imprimir todas las magdalenas almacenadas en la fábrica
        System.out.println("Magdalenas en la fábrica:");
        magdalenaFactory.printMagdalena();
    }
}
