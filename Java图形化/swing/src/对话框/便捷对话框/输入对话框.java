package 对话框.便捷对话框;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class 输入对话框 {
    JFrame f=new JFrame();
    JTextArea tea=new JTextArea(5,40);
    JButton ok=new JButton(new AbstractAction("选择") {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = JOptionPane.showInputDialog(f, "银行账号", JOptionPane.ERROR_MESSAGE);
            tea.append(s);
        }
    }) ;

        private void init() {
            f.add(tea);
            f.add(ok, BorderLayout.SOUTH);
            f.setVisible(true);
            f.pack();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }

    public static void main(String[] args) {
        new 输入对话框().init();
    }
}
