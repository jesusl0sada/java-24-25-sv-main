package pojo;

public class FabricaMagdalenas {
    int contador = 0;
    Magdalena[] estMagdalena = new Magdalena[4];


    private void addMagdalena(Magdalena miMagdalena){
    estMagdalena[contador] = miMagdalena;
    contador++;
    }

    void printMagdalena(){
        for (int i = 0; i < estMagdalena.length; i++) {
            System.out.println("Magdalena: [" + i + "]");
            System.out.println("Atributos: Sabor - " +  );
            System.out.println("Atributos: Color - " );
            System.out.println("");
        }
    }
        }


