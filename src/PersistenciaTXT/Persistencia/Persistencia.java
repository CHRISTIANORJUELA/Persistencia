package PersistenciaTXT.Persistencia;

import PersistenciaTXT.model.Cliente;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Persistencia {

	//RUTA DONDE QUEREMOS GUARDAR LA INFORMACION DE NUESTROS CLIENTES
	public static final String RUTA_ARCHIVO_CLIENTES = "src/PersistenciaTXT/resources/clientes.txt";

	//METODO PARA GUARDAR LA LISTA DE CLIENTES EN EL ARCHIVO .TXT
    public static void guardarClientes(ArrayList<Cliente> listaClientes) throws IOException {
		
		String contenido = "";
		
		for(Cliente cliente: listaClientes) {
			
			contenido+= cliente.getCodigo()+"@"+cliente.getCedula()+"@"+cliente.getTipoIdentificacion()+
					"@"+cliente.getNombre()+"@"+cliente.getApellido()+"@"+cliente.getTelefono()+"\n";
		}
		ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_CLIENTES, contenido, false);
	}

	//METODO PARA CARGAR LOS CLIENTES A PARTIR DEL ARCHIVO
    public static ArrayList<Cliente> cargarClientes() throws FileNotFoundException, IOException {

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		ArrayList<String> contenido = ArchivoUtil.leerArchivo(RUTA_ARCHIVO_CLIENTES);
		String linea = "";

		for (int i = 0;i<contenido.size(); i++) {
			Cliente miCliente = new Cliente();
			linea = contenido.get(i);
			miCliente.setCodigo((linea.split("@")[0]));
			miCliente.setCedula(linea.split("@")[0]);
			miCliente.setTipoIdentificacion(linea.split("@")[0]);
			miCliente.setNombre(linea.split("@")[0]);
			miCliente.setApellido(linea.split("@")[0]);
			miCliente.setTelefono(linea.split("@")[0]);
			clientes.add(miCliente);
		}

		return clientes;
    }
}
