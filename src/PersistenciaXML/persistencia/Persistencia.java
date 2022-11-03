package PersistenciaXML.persistencia;

import PersistenciaXML.model.Tienda;


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