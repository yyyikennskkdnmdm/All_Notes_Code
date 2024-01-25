package java_012_Network.network_002_TCP;

import java_012_Network.network_001_InetAddress.InetAddress_001;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Tcp_001 {


    @Test
    public void Tcp_001_test_001() throws IOException {

        InetAddress inet = InetAddress.getByName("192.168.1.9");
        Socket socket = new Socket(inet, 8899);
        OutputStream os = socket.getOutputStream();
        os.write("你好，我是客户端mm".getBytes());
        os.close();
        socket.close();
    }


    @Test
    public void Tcp_001_test_002() throws IOException {
        ServerSocket socket = new ServerSocket(8899);
        Socket accept = socket.accept();
        InputStream inputStream = accept.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();


        byte[] bytes = new byte[1024];
        int len;
        while((len = inputStream.read(bytes)) != -1){
            byteArrayOutputStream.write(bytes, 0, len);
        }
        System.out.println(byteArrayOutputStream.toString());
        System.out.println("收到了来自于：" + accept.getInetAddress().getHostAddress() + "的数据");


        byteArrayOutputStream.close();
        inputStream.close();
        accept.close();
        socket.close();
    }
}
