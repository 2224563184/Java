package 对话框.便捷对话框;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class 自定义对话框 {
    JFrame f=new JFrame();
    JTextArea tea=new JTextArea(5,40);
    JButton ok=new JButton(new AbstractAction("选择") {
        @Override
        public void actionPerformed(ActionEvent e) {
            int Num = JOptionPane.showOptionDialog(f, "请选择码数", "对话框", JOptionPane.
                            YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"大", "中", "小"}, JOptionPane.ICON_PROPERTY);
            if (Num==0){
                tea.append("大\n");
            }
            if (Num==1){
                tea.append("中\n");
            }
             if (Num==2){
                 tea.append("小\n");
             }
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
        new 自定义对话框().init();
    }
}
