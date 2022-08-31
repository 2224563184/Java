package 网络通讯.TCP.练习6;

import java.io.IOException;
import java.net.Socket;

public class 服务器 {
    public static void main(String[] args) throws IOException {
        java.net.ServerSocket ss=new java.net.ServerSocket(10200);
        while (true) {
            Socket s = ss.accept();
            new Thread(new 多线程(s)).start(); //传递accept监听器到多线程内
        }

    }
}
