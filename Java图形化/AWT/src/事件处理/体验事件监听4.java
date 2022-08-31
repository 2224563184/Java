package 事件处理;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
// 需求: 可以关闭窗口
public class 体验事件监听4 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
        frame.pack();

    }
}
