package 对话框.便捷对话框;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class 确定对话框 {
    JFrame f=new JFrame();
    JTextArea tea=new JTextArea(5,40);
    JButton ok=new JButton(new AbstractAction("选择") {
        @Override
        public void actionPerformed(ActionEvent e) {
int dialog = JOptionPane.showConfirmDialog(f, "是否确定", "选择对话框", JOptionPane.YES_NO_CANCEL_OPTION);

             if (dialog==JOptionPane.YES_OPTION){
                 tea.append("是\n");

             if (dialog==JOptionPane.NO_OPTION){
                     tea.append("否\n");
                 }
             }
//             if (dialog==JOptionPane.OK_OPTION){
//                 tea.append("确定\n");
//             }   //  确定和是 都是相同的值

             if (dialog==JOptionPane.CANCEL_OPTION){
                 tea.append("取消\n");
             }
        }
    });
    void init(){
        f.add(tea);
        f.add(ok, BorderLayout.SOUTH);
        f.setVisible(true);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
     new 确定对话框().init();
    }
}
