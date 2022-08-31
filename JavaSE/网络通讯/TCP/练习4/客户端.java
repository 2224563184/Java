package 网络通讯.TCP.练习4;

import java.io.*;
import java.net.Socket;

/*
   需求：
      客户端：数据来自文本文件
      服务器：接收到的数据写入文本文件
 */
public class 客户端 {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.101.103",1000);
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\2\\Desktop\\垃圾筐\\客户端\\1.java"));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        s.close();

    }
}
