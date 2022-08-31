package 布局管理器接口.BoxLayou盒子布局;

import javax.swing.*;
import java.awt.*;

public class 体验盒子布局3 {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Box hbox = Box.createHorizontalBox();
        hbox.add(new Button("A"));
        hbox.add(new Button("B"));
        Box vBox = Box.createVerticalBox();
           vBox.add(new Button("A"));
           vBox.add(new Button("B"));
        BoxLayout boxLayout = new BoxLayout(frame,BoxLayout.X_AXIS);
        frame.add(hbox);
        frame.add(vBox);
        frame.setLayout(boxLayout);
        frame.setVisible(true);
        frame.pack();
    }
}
