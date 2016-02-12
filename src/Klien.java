
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class Klien 
{
    Socket mySocket;
    
    void sambungkanKeServer() throws IOException
    {
        System.out.println("Mencoba menghubungi server");
        mySocket = new Socket("localhost", 3000);
        System.out.println("Berhasilll menghubungi server");
        kirimkanPesan(mySocket);
    }
    void kirimkanPesan(Socket mySocket) throws IOException
    {
        System.out.println("Coba mengirimkan hallo");
        DataOutputStream dos = new DataOutputStream(mySocket.getOutputStream());
        dos.writeUTF("Halllo Server");
    }
}
