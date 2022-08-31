package 网络通讯.TCP.练习2;

import java.io.*;
import java.net.Socket;

/*
    需求：
        客户端：数据来自键盘录入，直到输入的数据是886发送结束
        服务器：接收到的数据在控制台输出
 */
public class 客户端 {
    public static void main(String[] args) throws IOException {
        Socket sk=new Socket("192.168.101.103",88);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
        String linne;
        while ((linne=br.readLine())!=null){
            if ("886".equals(linne)){
                break;
            }
            bw.write(linne);
            bw.newLine();
            bw.flush();
            System.out.println("客户端发送："+linne);
        }
        sk.close();
    }
}
