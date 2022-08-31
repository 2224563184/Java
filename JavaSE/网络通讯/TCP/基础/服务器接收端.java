package 网络通讯.TCP.基础;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class 服务器接收端 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);

        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[]bys=new byte[1024];
        int  len =is.read(bys);
            System.out.println("收到数据："+new String(bys,0,len));
            s.close();
            ss.close();
        }
    }

