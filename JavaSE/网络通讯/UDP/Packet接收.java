package 网络通讯.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
    1.创建接收端的Socket对象(DatagramSocket)
      DatagramSocket(int port)

    2.创建数据包
      DatagramPacket(byte[] buf, int length)

    3.调用DatagramSocket对象的方法接收数据
      void receive(DatagramPacket p)

    4.解析数据包
      byte[] getData()
      int getLength()

    5.关闭接收端
      void close();
 */
public class Packet接收 {
    public static void main(String[] args) throws IOException {
//1.创建接收端的Socket对象(DatagramSocket)
// DatagramSocket(int port)构造数据套接字并将其绑定到本地主句上的指定端口
        DatagramSocket ds = new DatagramSocket(10086);

//2.创建数据包
//        DatagramPacket(byte[] buf, int length)
//        构造一个 DatagramPacket用于接收长度的数据包 length 。
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);

//3.调用DatagramSocket对象的方法接收数据
        ds.receive(dp);

//4.解析数据包，并把数据在控制台显示
// byte[] getData()：返回数据缓冲区
        byte[] data = dp.getData();
 /* 原版：
        int len=dp.getLength();  //  实际对应的数据长度，而不是上面的1024
        String dataString = new String(data,0,len);  0-len(对应长度)
        System.out.println("数据：" + dataString); */
// 优化版：
        System.out.println("数据："+new String(dp.getData(),0,dp.getLength()));

//5.关闭接收端
        ds.close();
    }
}
