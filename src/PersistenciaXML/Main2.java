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

        while (true){
            Producto producto = new Producto();
            producto.setName(JOptionPane.showInputDialog("ingrese el nombre del producto"));
            tienda.getProductos().add(producto);
            JOptionPane.showMessageDialog(null,"Producto agregado");
            Persistencia.guardarRecursoBancoXML(tienda);
        }



    }
}
