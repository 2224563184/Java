package 绘图.绘图IO流;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class 测试 {
//    窗口
    JFrame frame = new JFrame("中国围棋");

//    棋盘
    private final int check_x=550;
    private final int check_y=550;

//    棋子的X、Y总数
    private final int x_piece=15;
    private final int y_piece=15;

//    记录当前棋子的X、Y下棋数量
    int [][] Number=new int[x_piece][y_piece];

    //    棋子的X、Y平均距离
    private final int RAG_x=check_x/x_piece;
    private final int RAG_y=check_y/y_piece;

//    棋子的 X、Y偏移量
    private  int  deviation_x =5;
    private  int  deviation_y =5;

//    记录当前下棋的颜色方
    private  int  colour =1;  //默认1白棋;2黑棋

//    选择框的 X、Y偏移量;选择框是跟随移动的,不需要数量和平均距离
    private  int Selection_x=-1;
    private  int Selection_y=-1;

//    位图IO流
     BufferedImage check;       //棋盘
     BufferedImage White;       //白棋
     BufferedImage black;       //黑棋
     BufferedImage Selection;   //选择框

//    按键
     Button Whitekey = new Button("白棋");
     Button blackkey = new Button("黑棋");
     Button deletekey = new Button("悔棋");

//    绘制位图
    private class Mycanvas extends JPanel{
    @Override
    public void paint(Graphics g) {
//        棋盘
        g.drawImage(check,0,0,null);

        for (int i = 0; i < x_piece; i++) {
            for (int j = 0; j < y_piece; j++) {
//        选择框
                if (Selection_x>0&&Selection_y>0){
                    g.drawImage(Selection,Selection_x*RAG_x+deviation_x-12,Selection_y*RAG_y+deviation_y-12,null);
                }
//        黑白棋
                if (Number[i][j]==1){   //白棋
                    g.drawImage(White,i*RAG_x+deviation_x,j*RAG_y+deviation_y,null);
                }
               if (Number[i][j]==2){    //黑棋
                   g.drawImage(black,i*RAG_x+deviation_x,j*RAG_y+deviation_y,null);
               }
            }

        }

    }
}

   Mycanvas mycanvas=new Mycanvas();

   private void init() throws IOException {
//       白棋

        Whitekey.addActionListener(e -> {
//         修改颜色
           Whitekey.setBackground(Color.GREEN);
           blackkey.setBackground(Color.LIGHT_GRAY);
           deletekey.setBackground(Color.LIGHT_GRAY);
//         修改当前状态
            colour=1;
        });

//黑棋
       blackkey.addActionListener(e -> {
//         修改颜色
           Whitekey.setBackground(Color.LIGHT_GRAY );
           blackkey.setBackground(Color.GREEN);
           deletekey.setBackground(Color.LIGHT_GRAY);
//         修改当前状态
           colour=2;
       });

//悔棋
       deletekey.addActionListener(e -> {
//         修改颜色
           Whitekey.setBackground(Color.LIGHT_GRAY);
           blackkey.setBackground(Color.LIGHT_GRAY);
           deletekey.setBackground(Color.GREEN );
//         修改当前状态
           colour=3;
       });

//     鼠标点击时
       mycanvas.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               int xPos = (e.getX() - deviation_x) / RAG_x;
               int yPos = (e.getY() - deviation_y) / RAG_y;
               Number[xPos][yPos] = colour;
               mycanvas.repaint();          //重绘棋子
           }

       });

       mycanvas.addMouseMotionListener(new MouseAdapter() {
           @Override
           public void mouseMoved(MouseEvent e) {
               Selection_x=(e.getX()-deviation_x)/RAG_x;
               Selection_y=(e.getY()-deviation_x)/RAG_y;
               mycanvas.repaint();
           }

           @Override
           public void mouseEntered(MouseEvent e) {
               Selection_x=-1;
               Selection_y=-1;
           }
       });





/*
 public void mouseMoved(MouseEvent e) {
          Selection_x=(e.getX()-deviation_x)/RAG_x;
               Selection_y=(e.getY()-deviation_x)/RAG_y;
               mycanvas.repaint();

 */
//       BufferedImage check;       //棋盘
//       BufferedImage White;       //白棋
//       BufferedImage black;       //黑棋
//       BufferedImage Selection;   //选择框
       White=ImageIO.read(new File("C:\\Users\\2\\Desktop\\bb.png"));
       black=ImageIO.read(new File("C:\\Users\\2\\Desktop\\aa.png"));
       check=ImageIO.read(new File("C:\\Users\\2\\Desktop\\3.jpg"));
       Selection=ImageIO.read(new File("C:\\Users\\2\\Desktop\\4.png"));

       Panel p=new Panel();
       p.add(Whitekey);
       p.add(blackkey);
       p.add(deletekey);
       mycanvas.setPreferredSize(new Dimension(check_x,check_y));
       frame.add(mycanvas);
       frame.add(p,BorderLayout.SOUTH);
       frame.setVisible(true);
      frame.setBounds(700,200,check_x,check_y);

   }

    public static void main(String[] args) throws IOException {
        new 测试().init();
    }
}
