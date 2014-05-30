import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.Charset;


public class SocketTest {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("fgc.heapthings.com", 5566);

    BufferedReader inputPipe = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    
    PrintWriter outputPipe = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), Charset.forName("UTF-8")),
        true);

    outputPipe.println("{\"token\":\"kerkerkerker\",\"gameID\":\"fgcChess\"}");

    String result = inputPipe.readLine();

    System.out.println(result);
  }
}
