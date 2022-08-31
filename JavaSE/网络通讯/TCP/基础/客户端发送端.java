package 网络通讯.TCP.基础;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class 客户端发送端 {
    public static void main(String[] args) throws IOException {
// 1.创建Socket对象
/*
  Socket(InetAddress address, int port) 创建流套接字并将其连接到指定IP地址的指定端口号。
  Socket s =new Socket(InetAddress.getByName("192.168.1.17"),10086);

   Socket(Sting host, int port)         创建流套接字并将其链接到指定主机上的指定端口号。
 */
        Socket s =new Socket("192.168.101.103",10000);
// 2.获取输出流
        OutputStream os = s.getOutputStream();
        os.write("Hello".getBytes());
//3.释放资源
        s.close();
    }
}
