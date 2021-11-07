import java.awt.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
public static String s = "";
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub

        JFrameWindow jFrameWindow=new JFrameWindow();
        ServerSocket serverSocket = new ServerSocket(12000);
        System.out.printf("服务器已建立...");
        while (true) {

            Socket socket= serverSocket.accept();
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(s.getBytes("utf-8"));
            socket.close();
            outputStream.close();
        }

    }
}