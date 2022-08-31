package 布局管理器接口.BoxLayou盒子布局;

import javax.swing.*;
import java.awt.*;

public class 体验盒子布局 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        BoxLayout boxLayout = new BoxLayout(frame,BoxLayout.X_AXIS);
        frame.setLayout(boxLayout);
        frame.add(new Button("A"));
        frame.add(new Button("B"));
        frame.pack();
        frame.setVisible(true);

    }
}
