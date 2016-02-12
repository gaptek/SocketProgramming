
import java.io.IOException;


public class DriverServer 
{
    public static void main(String[] args) throws IOException
    {
        MyServer mysserver = new MyServer();
        mysserver.ciptakanServerSocket();
        mysserver.tungguClient();
    }
}
