import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Esta clase implementa una solucion para el problema 1088 de Beecrowd.
 * @author Eduardo Montaño Gomez.
 * @since Beecrowd.
 * @version 1.0
 * */
public class BubblesAndBuckets {
 
    public static void main(String[] args) throws IOException{
	reciveInput();
    }

    private static void reciveInput() throws IOException {
	String input = inputToString();
	processInput(input);
    }

    private static String inputToString() throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
	String line = null;
	String string = "";
	while ((line = in.readLine()) != null)
	    string += line + "\n";
	return string;
    }
    
    private static void processInput(String input) {	
	String[] lines = input.split("\n");
	int numLines = lines.length;
	for (int i = 0; i < numLines; i++) {
   }

}
