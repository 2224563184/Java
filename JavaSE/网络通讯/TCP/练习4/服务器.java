package 网络通讯.TCP.练习4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
   需求：
      客户端：数据来自文本文件
      服务器：接收到的数据写入文本文件
 */
public class 服务器 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(1000);
        Socket s = ss.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\2\\Desktop\\垃圾筐\\客户端\\2.java"));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        ss.close();
        bw.close();
    }
}
