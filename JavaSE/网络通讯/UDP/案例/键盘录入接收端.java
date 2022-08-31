package 网络通讯.UDP.案例;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class 键盘录入接收端 {
    public static void main(String[] args) throws IOException {
//1.
        DatagramSocket ds=new DatagramSocket(10086);
//2.

        while (true) {
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
//3.
            ds.receive(dp);
//4.
            byte[] data = dp.getData();
            int length = dp.getLength();
            String s = new String(data, 0, length);
            System.out.println("接收数据："+s);
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
