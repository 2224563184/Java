package 网络通讯.TCP.练习1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class 服务器接收发送 {
    public static void main(String[] args) throws IOException {
//接收客户端数据
        ServerSocket s=new ServerSocket(103);

        Socket ss = s.accept();

        InputStream is = ss.getInputStream();
        byte[]bys=new byte[1024];
        int len=is.read(bys);
        System.out.println("服务器接收："+new String(bys,0,len));
//反馈客户端
        OutputStream os = ss.getOutputStream();
          os.write("2".getBytes());
          s.close();
          ss.close();

    }


    }

