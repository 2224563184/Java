package 绘图.绘图IO流;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class 体验IO流 {
    private Frame frame =new Frame("图片查看器");

    private final int The_width=400;
    private final int The_highly=400;

    //菜单栏
    MenuBar menuBar=new MenuBar();
//菜单组件
    Menu menu =new Menu("文件");               //菜单条
//  菜单项
    MenuItem open = new MenuItem("打开");  //菜单项
    MenuItem save=new MenuItem("另存为");  //菜单项

    BufferedImage image;                      //创建该对象不进行初始化,当选择打开文件的时候再进行初始化

private class Mycanvas extends Canvas{
    @Override
    public void paint(Graphics g) {
    g.drawImage(image,0,0,null); //不需要观察者 null


    }
}
    Mycanvas drawArea = new Mycanvas();

private void init()throws Exception{
    /*
    String actionCommand = e.getActionCommand();
            switch (actionCommand){
                case "打开":
                    FileDialog fileload=new FileDialog(frame, "选择文件", FileDialog.LOAD);
                     fileload.setVisible(true);
                    String dir = fileload.getDirectory();
                    String file = fileload.getFile();
                    try {
                        image=ImageIO.read(new File(dir,file));
                        drawArea.repaint();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    break;
                case "另存为":
                    FileDialog filesave=new FileDialog(frame, "保存文件", FileDialog.SAVE);
                    filesave.setVisible(true);
                    String dird = filesave.getDirectory();
                    String fileName = filesave.getFile();
                    try {
                        ImageIO.write(image,"JPEG",new File(dird,fileName));
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    break;
     */
    open.addActionListener(e -> {                                                     //使用Lame表达式 注册监听菜单项
        FileDialog fileDialog=new FileDialog(frame,"打开文件",FileDialog.LOAD);  //对话框加载
        fileDialog.setVisible(true);
        String dir = fileDialog.getDirectory();                                      // 获取文件目录
        String filename = fileDialog.getFile();                                      //获取文件名称
        try {
            image=ImageIO.read(new File(dir,filename) );                            // ImageIO文件流入,并初始化位图
            drawArea.repaint();                                                     // 重绘画图
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    });

     save.addActionListener(e -> {                                                   //使用Lame表达式 注册监听菜单项
         FileDialog fileDia=new FileDialog(frame,"保存文件",FileDialog.SAVE);    //对话框保存
         fileDia.setVisible(true);
         String dr = fileDia.getDirectory();                                         //获取文件目录
         String fi = fileDia.getFile();                                              //获取文件名称
         try {
             ImageIO.write(image,"JPEG",new File(dr,fi));                  //ImageIO文件流出
         } catch (IOException ioException) {
             ioException.printStackTrace();
         }
     });
      menu.add(open);
      menu.add(save);
      menuBar.add(menu);

     drawArea.addMouseMotionListener(new MouseAdapter() {
         @Override
         public void mouseMoved(MouseEvent e) {

         }
     });
     frame.setMenuBar(menuBar);
    frame.add(drawArea);
    frame.setBounds(200,200,740,508);
    frame.setVisible(true);
    frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
}

    public static void main(String[] args) throws Exception {
     new 体验IO流().init();
    }

}
