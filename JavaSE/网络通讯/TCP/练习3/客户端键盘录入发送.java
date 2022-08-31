package 网络通讯.TCP.练习3;

import java.io.*;
import java.net.Socket;

/*
   需求：
       客户端：数据来自键盘录入，一直到输入的数据是886发送结束
       服务器：接收到的数据写入文本文件
 */
public class 客户端键盘录入发送 {
    public static void main(String[] args) throws IOException {
        Socket sk=new Socket("192.168.101.103",100);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
        String line;

        while ((line=br.readLine())!=null) {
            if ("886".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        sk.close();
    }
}
