package 布局管理器接口.LayoutManager默认布局;

import java.awt.*;

public class 体验 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setBounds(0,0,1920,1080);
             frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        for(int i=0;i<100;i++){
            frame.add(new Button("按钮"+i));
        }

        frame.pack();
        frame.setVisible(true);

    }
}
