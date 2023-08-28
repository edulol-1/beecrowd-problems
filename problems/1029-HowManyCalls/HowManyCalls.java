import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Esta clase implementa una solucion en java para el problema 1029 de Beecrowd.
 * @author Eduardo Montaño Gomez.
 * @since Beecrowd.
 * @version 1.0
 * */
public class HowManyCalls {

    private static int calls;

    public static void main(String[] args) throws IOException {
        inputToString();
    }

    private static void inputToString() throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int cicles = Integer.parseInt(in.readLine());
        for (int i = 0; i < cicles; i++) {
            int n = Integer.parseInt(in.readLine());
            var res = fibC(n);
            System.out.println("fib(" + n + ") = " + (--calls) + " calls = " + res);
            calls = 0;
        } 
   }   

   private static int fibC(int n) {
       calls++;
       return (n == 0 || n == 1)? n: fibC(n-1) + fibC(n-2);
  }

}
