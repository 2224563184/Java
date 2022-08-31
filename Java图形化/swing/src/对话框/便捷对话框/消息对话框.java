package 对话框.便捷对话框;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class 消息对话框 {
    JFrame jf = new JFrame();
    JTextArea jta = new JTextArea(5, 40);


    JButton ok = new JButton(new AbstractAction("查看") {
        @Override
        public void actionPerformed(ActionEvent e) {
//        (Component parentComponent, Object message, String title, int messageType)
//                           父级窗口,  显示的内容, 标题, 消息类型
            JOptionPane.showMessageDialog(jf, jta.getText(), "标题", JOptionPane.ERROR_MESSAGE);
        }
    });


    private void init() {


        jf.add(jta);
        jf.add(ok, BorderLayout.SOUTH);
        jf.setVisible(true);
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new 消息对话框().init();
    }
    }
