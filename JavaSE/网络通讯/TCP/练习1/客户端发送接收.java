package 网络通讯.TCP.练习1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
      需求：
           客户端：发送数据，接收服务器反馈
           服务器：接收数据，给出反馈
 */
public class 客户端发送接收 {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.101.103",103);
//发送数据给服务器
        OutputStream os = s.getOutputStream();
        os.write("1".getBytes());
//接收服务器反馈
        InputStream is = s.getInputStream();
        byte [] bys=new byte[1024];
        int len=is.read(bys);
        System.out.println("客户端接收："+new String(bys,0,len));
        s.close();

    }
}
