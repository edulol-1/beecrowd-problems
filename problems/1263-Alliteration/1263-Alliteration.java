import java.io.IOException;
import java.io.InputStreamReader; 
import java.io.BufferedReader;

/**
 * Clase que dada una cadena imprime el numero de aliteraciones por cada
 * linea de texto.
 * @author Eduardo Montaño Gomez.
 * @version 1.0
 * */

public class Main {
 
    public static void main(String[] args) throws IOException {
	leeEntrada();
    }

    /*
     * Lee la entrada que se le pasa por System.in e imprime las aliteraciones.
     * @throw IOException.
     * */
    private static void leeEntrada() throws IOException {	
	// Leemos la entrada y la recorremos.
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String lineaCamelCase = null;
	while ((lineaCamelCase = in.readLine()) != null) {
	    // Procesamos la linea y obtenemos el numero de aliteraciones.
	    String linea = procesaLinea(lineaCamelCase);	    
	    int numAlit = numeroAliteraciones(linea);
	    System.out.println(numAlit);
	}
    }

    /*
     * Recorre las palabras de una linea de texto.
     * @return el numero de aliteraciones que hay en la linea.
     * @param linea la linea a recorrer.
     */
    private static int numeroAliteraciones(String linea) {
	// Inicializamos las variables.
	char actualC = Character.MIN_VALUE;
	int numRep = 0;	
	int numAl = 0;
	String[] palabras = linea.split("\\s+");
	// Recorremos cada palabra de la linea y sumamos las aliteraciones.
	for (String palabra: palabras) {
	    char caracter = palabra.charAt(0);
	    if (caracter == actualC) 
		numRep++;
	    else {
		if (numRep >= 1)
		    numAl++;
		numRep = 0;
		actualC = caracter;
	    }	
	}
	return numAl;
    }
    
    /*
     * Procesa una linea de texto y regresa el string adecuado.
     * @param linea la linea a procesar.
     * @return la linea procesada.
     * */
    private static String procesaLinea(String lineaRaw) {
	String lineaLower = lineaRaw.toLowerCase();
	String linea = lineaLower + " " + Character.MIN_VALUE;
	return linea;
    }
}
