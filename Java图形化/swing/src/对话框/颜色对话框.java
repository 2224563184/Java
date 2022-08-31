package 对话框;

import javax.swing.*;
import java.awt.*;

public class 颜色对话框 {
   JFrame jf=new JFrame();

   JTextArea tea=new JTextArea("我爱中华");

   JButton ok=new JButton("改变文本框的文本颜色");

    private void init(){
        ok.addActionListener(e -> {
            Color shou = JColorChooser.showDialog(jf, "选择颜色", Color.BLACK);
              tea.setBackground(shou);
        });

        jf.add(ok,BorderLayout.SOUTH);
        jf.add(tea);
        jf.setVisible(true);
        jf.pack();
    }

    public static void main(String[] args) {
        new 颜色对话框().init();

    }
}
