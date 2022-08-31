package 网络通讯.TCP.练习6;

import java.io.*;
import java.net.Socket;

public class 多线程 implements Runnable {
    private Socket s;
    public 多线程(Socket s) {
        this.s=s;
    }

    @Override
    public void run() {
      try {
          BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
          int comt=0;
//判断重复名
          File srcFile=new File("C:\\Users\\2\\Desktop\\垃圾筐\\客户端\\33"+comt+".txt");
          while (srcFile.exists()) {
              comt++;
            srcFile=new File("C:\\Users\\2\\Desktop\\垃圾筐\\客户端\\33"+comt+".txt");
          }
          BufferedWriter bw=new BufferedWriter(new FileWriter(srcFile));
//——————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————


           String line;
           while ((line=br.readLine())!=null){
               bw.write(line);
               bw.newLine();
               bw.flush();
           }
           BufferedWriter bww=new BufferedWriter(new OutputStreamWriter(this.s.getOutputStream()));
           bww.write("服务器回馈");
           bww.newLine();
           bww.flush();
           bww.close();
             this.s.close();
             bw.close();
      }catch (IOException e){
          e.printStackTrace();
      }
    }
}
