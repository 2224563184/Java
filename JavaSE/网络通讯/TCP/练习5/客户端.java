package 网络通讯.TCP.练习5;
/*

 */
import java.io.*;
import java.net.Socket;

/*
    需求：
         客户端：数据来自文件，接收服务器的回馈
         服务器：接收到的数据写入文件，给出反馈
 */
public class 客户端 {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.101.103",100);
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\2\\Desktop\\垃圾筐\\客户端\\1.mp4"));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
/*   自定义标识：
             bw.write(886);
             bw.newLine();
             bw.flush();
 */
//推荐方法：
        s.shutdownOutput();
        BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String len = brr.readLine();
        System.out.println("客户端收到："+len);
        bw.close();
        s.close();

    }
}
