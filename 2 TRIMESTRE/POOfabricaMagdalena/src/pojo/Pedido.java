package pojo;

import java.util.Arrays;

public class Pedido {

    // ATRIBUTOS

    private int contador = 0;
    private int numProductos;
    private Producto[] listaProductos; // Listas estáticas

    // CONSTRUCTOR

    public Pedido(int numProductos){
        this.numProductos=numProductos;
        listaProductos = new Producto[numProductos];
                                        // = new Producto[5]
    }

    // MÉTODOS

    // método agregar, recibe el parámetro del producto y la cantidad a agregar.
    public void agregarProducto(Producto miProducto, int cantidad){
        if(contador<5){
            this.listaProductos[contador] = miProducto;
            contador++;
        }else{
            contador=0; // lo reiniciamos.
        }
    }

    public void imprimirTicket(){
        System.out.println("Su ticket digital!!");
        System.out.println("Fecha ->" + "14/01/2025");
        System.out.println("Hora ->" + "12:10");
        for (int i = 0; i < listaProductos.length; i++) {
            Producto miProducto = listaProductos[i];
            if (miProducto!= null){
                System.out.println(listaProductos[i].toString());
            }else{
                System.out.println("Has llegado al final de la lista");
                break;
            }
        }
    }

    // TO STRING


    @Override
    public String toString() {
        return "Pedido{" +
                "contador=" + contador +
                ", numProductos=" + numProductos +
                ", listaProductos=" + Arrays.toString(listaProductos) +
                '}';
    }

    // GETTER AND SETTER
    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }
}
