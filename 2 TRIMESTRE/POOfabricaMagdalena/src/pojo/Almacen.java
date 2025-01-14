package pojo;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Almacen {

    // ATRIBUTOS

    private int contador = 0; // Nos servirá para recorrer todos los productos que tenemos en el almacén
    private int numeroProductosAlmacen; // Servirá para saber la cantidad de productos que tenemos en el almacén es un entero.
    private Producto[] listaProductosAlmacen = new Producto[10]; // TENDREMOS QUE CREAR UN ARRAY PARA QUE ALMACENE LOS PRODUCTOS DEL ALMACÉN, IMPORTANTE


    /* CONSTRUCTOR



     VAMOS A DEJARLO VACÍO, pues no hay ningún tipo de modelo a seguir.

     */

    // MÉTODOS


    // agregarProductoalInventario
    public void meterproductoInventario(Producto miProducto){
        if (contador >= 0){ // CON EL CONTADOR IREMOS CONTANDO LOS PRODUCTOS QUE VAMOS AÑADIENDO AL ALMACÉN.
            this.listaProductosAlmacen[contador]=miProducto;
            contador++;
        }else{
            System.out.println("No puedes agregar más productos al almacén, límite excedido");
            System.out.println("Reiniciando...");
            contador=0; // LO REINICIAMOS
        }
    }

    // mostrarInventario
    public void mostrarProductosInventario(){
        System.out.println("Productos del almacen:");
        for (int i = 0; i < listaProductosAlmacen.length; i++) {
            Producto miProducto = listaProductosAlmacen[i];
            if (miProducto != null){
                System.out.println(listaProductosAlmacen[i].toString());
            }else{
                System.out.println("Has llegado al final de la lista de productos del almacen, se acabó.");
                break;
            }
        }
    }

    // BuscarProductoPorNombre
    public void buscarproductoInventario(String nombre){

        System.out.println("BUSCANDO PRODUCTOS DEL ALMACÉN:");
        for (int i = 0; i < listaProductosAlmacen.length; i++) {
            if (listaProductosAlmacen[i] != null && listaProductosAlmacen[i].getNombre().equals(nombre)){
                System.out.println("Has encontrado el producto, he aquí sus características: " + listaProductosAlmacen[i]);
            }
        }
    }

    // GETTER AND SETTER

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getNumeroProductosAlmacen() {
        return numeroProductosAlmacen;
    }

    public void setNumeroProductosAlmacen(int numeroProductosAlmacen) {
        this.numeroProductosAlmacen = numeroProductosAlmacen;
    }

    public Producto[] getListaProductosAlmacen() {
        return listaProductosAlmacen;
    }

    public void setListaProductosAlmacen(Producto[] listaProductosAlmacen) {
        this.listaProductosAlmacen = listaProductosAlmacen;
    }


    // ToString


    @Override
    public String toString() {
        return "Almacen{" +
                "contador=" + contador +
                ", numeroProductosAlmacen=" + numeroProductosAlmacen +
                ", listaProductosAlmacen=" + Arrays.toString(listaProductosAlmacen) +
                '}';
    }
}
