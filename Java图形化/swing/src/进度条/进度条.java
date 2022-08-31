package 进度条;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 进度条 {
    JFrame jFrame=new JFrame();
//  复选框
    JCheckBox ckBox=new JCheckBox("不确定进程");
    JCheckBox ckBox2=new JCheckBox("不绘制边框");
//   进度条
    JProgressBar jProgressBar=new JProgressBar(JProgressBar.HORIZONTAL,0,100);
      private void init(){
//       监听复选框
         ckBox.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
//           获取是否勾选 复选框
                 boolean selected = ckBox.isSelected();
//           设置进度条
                 jProgressBar.setIndeterminate(selected);
//           设置百分比;设置了进度条默认 关闭百分百
                 jProgressBar.setStringPainted(!selected);
             }
         });
           ckBox2.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   boolean selected = ckBox2.isSelected();
                   jProgressBar.setBorderPainted(!selected);
               }
           });
//        设置进度条默认属性
           jProgressBar.setBorderPainted(true);//默认百分比
           jProgressBar.setStringPainted(true);//默认边框
//        组装
          Box vbox = Box.createVerticalBox();
          vbox.add(ckBox);
          vbox.add(ckBox2);
          jFrame.setLayout(new FlowLayout());
          jFrame.add(vbox);
          jFrame.add(jProgressBar);
          jFrame.setVisible(true);
          jFrame.pack();
          jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }

    public static void main(String[] args) {
        new 进度条().init();
    }
}
