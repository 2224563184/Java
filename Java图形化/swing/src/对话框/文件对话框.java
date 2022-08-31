package 对话框;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class 文件对话框 {
    JFrame jf=new JFrame();

    private int x=-1;
    private int y=-1;
// 创建按钮
    JMenuBar jmb=new JMenuBar();
    JMenu    jMenu   =new JMenu("文件");
    JMenuItem open=new JMenuItem(new AbstractAction("打开") {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser jFileChooser=new JFileChooser(".");
            jFileChooser.showOpenDialog(jf);
            File selectedFile = jFileChooser.getSelectedFile();
            try {
                image=ImageIO.read(selectedFile);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    });
    JMenuItem Guardar=new JMenuItem(new AbstractAction("另存为") {
        @Override
        public void actionPerformed(ActionEvent e) {
//          选择路径
            JFileChooser jFileChooser=new JFileChooser(".");
//           保存文件
            jFileChooser.showSaveDialog(jf);
//            获取选择保存的文件
            File selectedFile = jFileChooser.getSelectedFile();
            try {
                ImageIO.write(image,"png",selectedFile);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    });
//   位图
    BufferedImage image;
//   绘图
    private class Mycanvas extends Canvas {
    @Override
    public void paint(Graphics g) {
            g.drawImage(image, 0,0, null);
        }
    }

//   创建绘图对象
    Mycanvas mycanvas=new Mycanvas();
   private void init(){
       mycanvas.setPreferredSize(new Dimension(700,500));
       jMenu.add(open);
       jMenu.add(Guardar);
       jmb.add(jMenu);

       jf.setJMenuBar(jmb);
       jf.setVisible(true);
       jf.add(mycanvas);
       jf.pack();
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //处理关闭按钮
   }
    public static void main(String[] args) {
        new 文件对话框().init();
    }
}
