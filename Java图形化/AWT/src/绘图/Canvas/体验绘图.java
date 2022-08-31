package 绘图.Canvas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//    需求： 点击按钮后绘制一个图形；重点在于设置标记和重新绘制
public class 体验绘图 {
    private final String REC = "0";  //设置标记
    private final String OVA = "1"; //设置标记
    private String R = "";         //定义一个变量，接收标记    R = REC
    Button btnTeact = new Button("绘制矩形");
    Button btnOval = new Button("绘制椭圆");

    //  自定义类，继承Canvas类，重写ppaint(Graphics g)方法完成画图：
    private class MyCanvas extends Canvas {
        @Override
        public void paint(Graphics g) {
            if (R.equals(REC)) {
                g.setColor(Color.BLACK);
                g.drawRect(200, 100, 50, 50);  //绘制矩形
            } else if (OVA.equals(R)) {
                g.setColor(Color.YELLOW);
                g.drawOval(200, 100, 50, 50);//绘制椭圆
            }
        }
    }
        private void init() {
            MyCanvas myCanvas = new MyCanvas();
            btnOval.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    R = OVA;                //修改标记
                    myCanvas.repaint();   //重新绘制
                }
            });
            btnTeact.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    R = REC;               //修改标记
                    myCanvas.repaint();  //重新绘制
                }
            });
            Frame frame = new Frame();

            Box vbox = Box.createHorizontalBox();
            vbox.add(btnTeact);
            vbox.add(btnOval);

            frame.add(myCanvas);
            frame.add(vbox, BorderLayout.SOUTH);
            frame.setVisible(true);
            frame.setBounds(700,200,500,500);
        }

    public static void main(String[] args) {
           new 体验绘图().init();
    }
}





