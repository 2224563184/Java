package 布局管理器接口.BoxLayou盒子布局;

import javax.swing.*;
import java.awt.*;

public class 体验盒子布局2 {
    public static void main(String[] args) {
        Frame frame=new Frame();
        BoxLayout boxLayout3 = new BoxLayout(frame,BoxLayout.Y_AXIS);
        frame.setLayout(boxLayout3);

        Panel panel = new Panel();
        BoxLayout boxLayout = new BoxLayout(panel,BoxLayout.X_AXIS);
        panel.setLayout(boxLayout);
        panel.add(new Button("A"));
        panel.add(new Button("B"));

        Panel panel2=new Panel();
        BoxLayout boxLayout2 = new BoxLayout(panel2,BoxLayout.Y_AXIS);
        panel2.setLayout(boxLayout2);
        panel2.add(new Button("A"));
        panel2.add(new Button("B"));

        frame.add(panel,boxLayout3);
        frame.add(panel2);
        frame.pack();
        frame.setVisible(true);

    }
}
