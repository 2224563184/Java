package 网络通讯.TCP.练习2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    需求：
        客户端：数据来自键盘录入，直到输入的数据是886发送结束
        服务器：接收到的数据在控制台输出
 */
public class 服务器 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(88);
        Socket s = ss.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\2\\Desktop\\垃圾筐\\服务器\\1.txt"));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
            System.out.println("服务器收到："+line);
        }
        bw.close();
        ss.close();
    }
}
