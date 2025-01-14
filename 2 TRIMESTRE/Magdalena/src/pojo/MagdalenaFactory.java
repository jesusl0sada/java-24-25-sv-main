package pojo;

public class MagdalenaFactory {
    private Magdalena[] listaMagdalenas = new Magdalena[4]; // Array

// LO COMENTADO ES LO DE ALBERTO

    // funcion añadir magdalenas , magdalena y posicion magdalena
   public void addMagdalena(Magdalena magdalena, int posicion) {
    //private void addMagdalena(Magdalena magdalena, int posicion) {
        listaMagdalenas[posicion] = magdalena;
        //posicion++;
    }

    //funcion para imprimir el array de las magdalenas
     public void printMagdalena() {
       //private void printMagdalena(){
        for (int i = 0; i < this.listaMagdalenas.length; i++) {
            //Magdalena magdalena =listaMagdalenas[i];
            if (this.listaMagdalenas[i] != null) { // si contiene algo en la lista
                // muestre datos de la magdalena
                System.out.println("Magdalena " + (i + 1) + ": " + this.listaMagdalenas[i].mostrarMagdalena());
                //System.out.print("Magdalena: [ " + i + "]");
                //System.out.print("Atributos: Sabor - " + magdalena.getSabor());
                //System.out.print("Atributos: Color - " + magdalena.getColor());

            }
        }
    }

}


