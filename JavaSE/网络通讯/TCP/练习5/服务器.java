package 网络通讯.TCP.练习5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    需求：
         客户端：数据来自文件，接收服务器的回馈
         服务器：接收到的数据写入文件，给出反馈
 */
public class 服务器 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(100);
        Socket s = ss.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\2\\Desktop\\垃圾筐\\客户端\\2.mp4"));
        String line;
        while ((line=br.readLine())!=null){
/*自定义标识
            if("886".equals(line)){
                break;
            }*/



            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        System.out.println("服务器已收到,正在回馈");

        BufferedWriter bww=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bww.write("服务器回馈成功");
        bww.newLine();
        bww.flush();

        ss.close();
        bw.close();
    }
}
