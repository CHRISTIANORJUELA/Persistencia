package PersistenciaXML.persistencia;

import PersistenciaXML.persistencia.ArchivoUtil;
import PersistenciaXML.model.Tienda;

import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Persistencia {

    //------------------------------------SERIALIZACION  y XML

    public static final String RUTA_ARCHIVO_TIENDA = "src/PersistenciaXML/resources/tienda.xml";

    public static Tienda cargarRecursoTiendaXML() {
        Tienda tienda = null;
        try {
            tienda = (Tienda) ArchivoUtil.cargarRecursoSerializadoXML(RUTA_ARCHIVO_TIENDA);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return tienda;
    }



    public static void guardarRecursoBancoXML(Tienda tienda) {

        try {
            ArchivoUtil.salvarRecursoSerializadoXML(RUTA_ARCHIVO_TIENDA, tienda);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }










}