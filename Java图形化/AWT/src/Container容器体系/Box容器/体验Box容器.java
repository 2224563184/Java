package Container容器体系.Box容器;

import javax.swing.*;
import java.awt.*;

public class 体验Box容器 {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Box hbox = Box.createHorizontalBox();
         hbox.add(new Button("按键1"));
         hbox.add(Box.createHorizontalGlue());
         hbox.add(new Button("按键2"));
         hbox.add(Box.createHorizontalStrut(10));
         hbox.add(new Button("按钮3"));

         Box vBox = Box.createVerticalBox();
         vBox.add(new Button("按钮1"));
        vBox.add(Box.createVerticalStrut(10));
        vBox.add(new Button("按钮2"));
        vBox.add(Box.createVerticalGlue());
        vBox.add(new Button("按钮3"));

        frame.add(hbox,BorderLayout.NORTH);
        frame.add(vBox);
        frame.pack();
        frame.setVisible(true);
    }
}
