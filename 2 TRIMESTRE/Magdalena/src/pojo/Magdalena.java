package pojo;

public class Magdalena{

int id;
private String sabor;
private String color;
private String masa;
private String ingredientesMasa;

public void setId(int id){
    if (id<0){
        System.out.println("Error");
    }else{
        this.id=id;
    }
}

//Constructor
//public Magdalena(){} //Contraseña Vacia
public Magdalena(String color, String sabor, String masa, String ingredientesMasa){
    System.out.println("Color: " + color);
    System.out.println("Sabor: " + sabor);
    this.sabor = sabor;
    this.color = color;
    System.out.println("Masa: " + masa);
    System.out.println("Ingredientes de la mezcla: " + ingredientesMasa);
    this.masa = masa;
    this.ingredientesMasa = ingredientesMasa;
    System.out.println("-------------------------");
}

//Metodo
public void hornear(){
    System.out.println("Estoy horneando la magdalena");
    System.out.println(" de " + this.sabor);
}
public void amasar(){
    System.out.println("Estoy amasando la magdalena");
    System.out.println(" de " + this.masa);
}
public void mezclar(){
    System.out.println("Estoy mezclando la magdalena");
    System.out.println(" de " + this.ingredientesMasa);


}
//metodo que pone los datos de cada apartado de la magdalena
    public String mostrarMagdalena() {
        return "Magdalena { " + "id = " + this.id + ", color= " + this.color + ' ' + ", sabor = " + this.sabor + ' ' + ", masa = " + this.masa + ' ' + ", ingredientesMasa = " + this.ingredientesMasa + ' ' + '}';
    }


}

