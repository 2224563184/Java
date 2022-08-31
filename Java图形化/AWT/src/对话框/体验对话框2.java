package 对话框;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//需求:  点击按钮弹出一个文本对话框
public class 体验对话框2 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Dialog dialog1 = new Dialog(frame,"帮助");    //对话框
        dialog1.setBounds(750,500,800,800);
        Button button1 = new Button("查看");
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(new TextArea(30,20));
        verticalBox.add(new Button("确定"));
        dialog1.add(verticalBox);
        button1.addActionListener(new ActionListener() {//ActionListener 单击监听
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog1.setVisible(true);
            }
        });

        frame.add(button1);
        frame.pack();
        frame.setVisible(true);
    }
}
