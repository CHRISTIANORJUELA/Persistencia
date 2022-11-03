package PersistenciaTXT;

import PersistenciaTXT.Persistencia.Persistencia;
import PersistenciaTXT.model.Cliente;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class Main1 {
	
	static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

	public static void main(String[] args) throws IOException {

		try {
			//USAMOS EL METODO CARGAR CLIENTES PARA TOMAR LOS DATO DE EL ARCHVIO TXT Y ARMAR
			//DE NUEVO NUESTRO ARRAY LIST
			listaClientes = Persistencia.cargarClientes();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//EN ESTA PARTE EL PROGRAMA NOS PERMITIRA CREAR CLIENTES DE FORMA ILIMITADA
		//CON EL OBJETIVO DE VER COMO CADA VEZ QUE AGREGAMOS UNO NUEVO EL ARCHIVO CON EXTENSION: .TXT
		//SE ACTUALIZARA.

		while (true) {
			String codigo = JOptionPane.showInputDialog("Ingrese el codigo de el cliente");
			String cedula = JOptionPane.showInputDialog("Ingrese la cedula de el cliente");
			String tipoIdentificacion = JOptionPane.showInputDialog("Ingrese el tipo de identificacion de el cliente");
			String nombre = JOptionPane.showInputDialog("Ingrese el nombre de el cliente");
			String apellido = JOptionPane.showInputDialog("Ingrese el apellido de el cliente");
			String telefono = JOptionPane.showInputDialog("Ingrese el telefono de el cliente");
			Cliente cliente = new Cliente(codigo, cedula, tipoIdentificacion, nombre, apellido, telefono);
			listaClientes.add(cliente);
			Persistencia.guardarClientes(listaClientes);
		}
	}


	//METODO DE PRUEBA --- IGNORAR --- IGNORAR ---
	private static void imprimirClientes (ArrayList < Cliente > listaClientes) {
		for (Cliente c : listaClientes) {
			System.out.println(c.toString());
		}
	}
}
