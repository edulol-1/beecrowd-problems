import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Esta clase implementa una solucion para el problema 1277 de Beecrowd.
 * @author Eduardo Montaño Gomez.
 * @since Beecrowd.
 * @version 1.0
 * */
public class Main {
 
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
	for (int i = 1; i < numLines;) {
	    int numNames = Integer.parseInt(lines[i]);
	    String[] names = lines[i+1].split(" ");
	    String[] attendances = lines[i+2].split(" ");
	    String discualifiedNames = createDiscualifiedNamesString(numNames, names, attendances);
	    System.out.println(discualifiedNames.trim());
	    i += 3;
	}	
    }

    private static String createDiscualifiedNamesString(int numNames, String[] names, 
	    String[] attendances) {
        String discualifiedNames = "";
	for (int j = 0; j < numNames; j++) {
	    if (shortAttendancePercentage(attendances[j]) < 75.0)
	        discualifiedNames += " " + names[j];
	    }
	return discualifiedNames;
    }

    private static float shortAttendancePercentage(String attendance) {
	int attendances = numberOfAttendances(attendance);
	int length = actualLength(attendance);
	float percentage = (attendances*100)/(length);
	return percentage;
    }

    private static int numberOfAttendances(String attendance) {
        int numberOfAttendances = numberOfOcurrences(attendance, 'P');
	return numberOfAttendances;
    }

    private static int actualLength(String attendance) {
	int length = attendance.length();
	return length - numberOfOcurrences(attendance, 'M');
    }

    private static int numberOfOcurrences(String attendance, char a) {
	int ocurrences = 0;
	for (char c: attendance.toCharArray())
	    if (c == a)
		ocurrences += 1;
	return ocurrences;
    }
}
