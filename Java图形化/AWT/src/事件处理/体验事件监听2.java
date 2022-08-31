package 事件处理;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//需求:  点击对话框中的确定按钮,显示出文本域内容
public class 体验事件监听2 {
    Frame frame = new Frame();
    Button button = new Button("打开对话框");
    Dialog dialog = new Dialog(frame,"帮助文档");
    TextField textField = new TextField(20);
    Button ok = new Button("确定");

public  class  myActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("内容");
    }
}
    public void init(){
        myActionListener myActionListener = new myActionListener();
        ok.addActionListener(myActionListener);
        dialog.add(ok,BorderLayout.SOUTH);
        dialog.add(textField);
        dialog.setBounds(500,300,600,600);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
            }
        });
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
      new 体验事件监听2().init();
    }
}
