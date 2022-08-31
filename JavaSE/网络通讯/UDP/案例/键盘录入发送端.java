package 网络通讯.UDP.案例;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
   需求：实现键盘录入数据，直到输入886则结束发发送数据
 */
public class 键盘录入发送端 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line=(br.readLine()))!=null){
            if ("886".equals(line)){
                    break;
            }
            byte[] bys = line.getBytes();
            DatagramPacket dp=new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.1.17"),10086);
            ds.send(dp);
        }
        ds.close();

    }
}
