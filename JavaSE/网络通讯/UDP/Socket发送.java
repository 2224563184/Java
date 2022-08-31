package 网络通讯.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
       UDP发送数据过程：
         1.创建发送端的Socket对象(DatagramSocket )
         DatagramSocket

         2.创建数据，并把数据打包
         DatagramPacket(byte[] buf, int offset, int length, InetAddress address, int port)

         3.调用DatagramSocket对象的方法发送数据
         void send(DatagramPacket p)

         4.关闭发送端
         void.close()

 */
public class Socket发送 {
    public static void main(String[] args) throws IOException {
//1.创建发送端的
        DatagramSocket ds=new DatagramSocket();

//2.创建数据，并把数据打包
/*DatagramPacket(byte[] buf, int offset, int length, InetAddress address, int port)
   数据：    byte[] buf
   数据长度：int offset
   iP地址： InetAddress address
   端口：   int port
   */


/*
原版：
        byte[] bys="Hello".getBytes();
        int len=bys.length;
        InetAddress byName = InetAddress.getByName("192.168.1.17");
        int port=10086;
        DatagramPacket dp=new DatagramPacket(bys,len,byName,port);
 */
//优化版：
        byte[] bys="Hello".getBytes();
        DatagramPacket dp=new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.1.17"),10086);

//发送数据send(DatagramPacket p)从此套接字发送数据包
        ds.send(dp);
//关闭发送端
        ds.close();

    }
}
