package PersistenciaTXT.Persistencia;

import java.io.*;
import java.util.ArrayList;

public class ArchivoUtil {

	//ESTE METODO GUARDA EN UNA VARIABLE EL CONTENIDO ORDENADO DE EL ARCHIVO .TXT
	//TENIENDO ESTA INFORMACION EN UNA CADENA DE STRINGS SERA MAS FACIL REESTRUCTURAR LA INFORMACION
	public static ArrayList<String> leerArchivo(String ruta) throws IOException {
		
		ArrayList<String> contenido = new ArrayList<String>();
		FileReader fr = new FileReader(ruta);
		BufferedReader bfr = new BufferedReader(fr);
		String linea = "";
		while((linea = bfr.readLine())!= null) {
			contenido.add(linea);
		}
		bfr.close();
		fr.close();
		return contenido;
	}

	//EDITA Y GUARDA NUESTRO CONTENIDO
	public static void guardarArchivo(String ruta, String contenido, boolean b) throws IOException {
		
		FileWriter fw = new FileWriter(ruta, b);
		BufferedWriter bfw = new BufferedWriter(fw);
		bfw.write(contenido);
		bfw.close();
		fw.close();
		
	}
}
