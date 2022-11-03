package PersistenciaXML;

import PersistenciaXML.model.Producto;
import PersistenciaXML.model.Tienda;
import PersistenciaXML.persistencia.Persistencia;

import javax.swing.*;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        //CARGAMOS LOS DATOS EN LA TIENDA DESDE NUESTRO ARCHIVO XML
        Tienda tienda = Persistencia.cargarRecursoTiendaXML();

        //EN ESTA PARTE EL PROGRAMA NOS PERMITIRA CREAR PRODUCTOS DE FORMA ILIMITADA
        //CON EL OBJETIVO DE VER COMO CADA VEZ QUE AGREGAMOS UNO NUEVO EL ARCHIVO CON EXTENSION: .XML
        //SE ACTUALIZARA.

        try {
            while (true){
                Producto producto = new Producto();
                producto.setName(JOptionPane.showInputDialog("ingrese el nombre del producto"));
                producto.setId(Integer.parseInt(JOptionPane.showInputDialog("ingrese el Id (Numero) del Producto")));
                producto.setStock(Integer.parseInt(JOptionPane.showInputDialog("ingrese La cantidad (Numero) del Producto")));
                producto.setPrice(Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio (Numero) del producto")));
                tienda.getProductos().add(producto);
                JOptionPane.showMessageDialog(null,"Producto agregado");
                Persistencia.guardarRecursoBancoXML(tienda);
                System.out.println("Nombres de Objetos agregados : ");
                for (Producto p:tienda.getProductos()){System.out.println(p.getName());}
            }
        }catch (NumberFormatException e){
            System.out.println("Ingresaste un valor no valido");
        }

    }
}
