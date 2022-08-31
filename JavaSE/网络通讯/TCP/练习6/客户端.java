package 网络通讯.TCP.练习6;

import java.io.*;
import java.net.Socket;

public class 客户端 {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.1.103",10200);

        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\2\\Desktop\\垃圾筐\\客户端\\3.txt"));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String len;
        while ((len=br.readLine())!=null){
            bw.write(len);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();
        BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line = brr.readLine();
        System.out.println("客户端收到"+line);

        s.close();
        br.close();
    }
}
