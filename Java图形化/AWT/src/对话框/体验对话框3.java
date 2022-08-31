package 对话框;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 体验对话框3 {
    public static void main(String[] args) {
//需求：点击按钮弹出文件对话框
        Frame frame = new Frame();
        FileDialog f1 = new FileDialog(frame,"选择文件",FileDialog.LOAD); //选择文件对话框
        FileDialog f2 = new FileDialog(frame,"保存文件",FileDialog.SAVE); //保存文件对话框
        Button b1 = new Button("打开文件");  //选择文件按钮
        b1.addActionListener(new ActionListener() {//ActionListener 单击监听
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(true);
                System.out.println("选择文件:"+f1.getDirectory()+f1.getFile());
            }
        });
        Button b2 = new Button("保存文件");  //保存文件按钮
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.setVisible(true);
                System.out.println("保存文件:"+f2.getDirectory()+f2.getFile());
            }
        });
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(b1);
        verticalBox.add(b2);
        frame.add(verticalBox);
        frame.pack();
        frame.setVisible(true);
    }
}
