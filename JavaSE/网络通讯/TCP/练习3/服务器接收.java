package 网络通讯.TCP.练习3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
   需求：
       客户端：数据来自键盘录入，一直到输入的数据是886发送结束
       服务器：接收到的数据写入文本文件
 */
public class 服务器接收 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(100);
        Socket s = ss.accept();
/*原版封装
        InputStream is = s.getInputStream();
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);            */
//优化封装：
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String len;
        while ((len=br.readLine())!=null){
            System.out.println("服务器收到："+len);
        }
        ss.close();
        s.close();
    }

}
