
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class MyServer 
{
    ServerSocket myServerSocket;
    
    void ciptakanServerSocket() throws IOException
    {
        myServerSocket = new ServerSocket(3000);
    }
    void tungguClient() throws IOException
    {
        System.out.println("Server akana menunguu....");
       Socket socketClien =  myServerSocket.accept();
        System.out.println("Server dihubungi klien");
        terimaData(socketClien);
    }
    void terimaData(Socket mySocket) throws IOException
    {
        System.out.println("Server menunggu Pesan.......");
        DataInputStream dis = new DataInputStream(mySocket.getInputStream());
        String dataDiKirim = dis.readUTF();
        System.out.println("Data dikirim klien :"+dataDiKirim);
    }
}
