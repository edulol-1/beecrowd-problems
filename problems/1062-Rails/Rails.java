import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Esta clase implementa una solucion en java para el problema 1062 de Beecrowd.
 * @author Eduardo Montaño Gomez.
 * @since Beecrowd.
 * @version 1.0
 * */
public class Rails {
    public static void main(String[] args) throws IOException {
        inputToString();
    }

    private static void inputToString() throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        String line = null;
        String string = "";
        int length = -1;
        while ((line = in.readLine()) != null) {
            if (line.length() == 1) {
                int tempLength = Integer.parseInt(line);
                if (tempLength == 0) {
                    if (length == 0)
                        return;
                    System.out.println();
                }
                length = tempLength;              
                continue;
            }
            if (length != 0) {
                rails(line.split(" "), length);
            }
        }
    }

   //  public static void rails(String[] railB, int n) {
   //      var railA = new Stack<Integer>();
   //      for (int i = 0; i < n; i++) {
   //          railA.push(n-i);
   //      }
        
   //      var station = new Stack<Integer>();
   //      var i = 0;
   //      while (!railA.empty()) {
   //          if (station.empty())
   //              station.push(railA.pop());
            
   //          if (Integer.parseInt(railB[i]) == station.peek()) {
   //              i++;
   //              station.pop();
   //          } else {
   //              station.push(railA.pop());
   //          }
   //      }

   //      while (i < n) {
   //          if (Integer.parseInt(railB[i]) == station.peek()) {
   //              i++;
   //              station.pop();
   //          } else {
   //              System.out.println("No");
   //              return;
   //          }           
   //      }        
   //      System.out.println("Yes");
   // }

    public static void rails(String[] railB, int n) {
        var station = new Stack<Integer>();
        var j = 0;
        for (int i = 1; i <= n; i++) {
            station.push(i);
            
            while (!station.empty() && Integer.parseInt(railB[j]) == station.peek()) {
                j++;
                station.pop();
            }
        }
        
        var answer = (station.empty())?"Yes":"No";
        System.out.println(answer);
   }    
}
