package 事件处理;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// 需求: 点击确定按钮后显示出内容
public class 体验事件监听 {
    Frame frame=new Frame();
    TextField te=new TextField(30);
    Button button=new Button("确定");

    public void init(){
//组装界面
        myte myte = new myte();
        button.addActionListener(myte);
        frame.add(te);
        frame.add(button,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);

    }
    private class myte implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            te.setText("Hello Worldd");
        }
    }

    public static void main(String[] args) {
        new 体验事件监听().init();
    }
}
