package PersistenciaXML.model;

import java.util.ArrayList;

public class Tienda {

    private String name;

    private ArrayList<Producto> productos;

    public Tienda() {
    }

    public Tienda(String name, ArrayList<Producto> productos) {
        this.name = name;
        this.productos = productos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "name='" + name + '\'' +
                ", productos=" + productos +
                '}';
    }
}
