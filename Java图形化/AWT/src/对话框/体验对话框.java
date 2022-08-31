package 对话框;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//  点击按钮弹出模式对话框、非模式对话框
public class 体验对话框 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Dialog dialog = new Dialog(frame,"焦点模式对话框",true);
        dialog.setBounds(750,500,800,800);
        Dialog dialog1 = new Dialog(frame,"非模式对话框");//默认float,非焦点模式对话框
        dialog1.setBounds(750,500,800,800);
        Button button = new Button("打开焦点模式对话框");
        Button button1 = new Button("打开非模式对话框");
        button.addActionListener(new ActionListener() {  //ActionListener 单击监听
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog1.setVisible(true);
            }
        });
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(button);
        verticalBox.add(button1);
        frame.add(verticalBox);
        frame.pack();
        frame.setVisible(true);
    }
}
