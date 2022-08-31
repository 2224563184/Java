package 布局管理器接口.BorderLayout五格布局;

import java.awt.*;

public class 体验BorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(new BorderLayout(50,30)); //  将默认流水布局修改五个布局
        frame.add(new Button("北侧按钮"),BorderLayout.NORTH);
        frame.add(new Button("南侧按钮"),BorderLayout.SOUTH);
        frame.add(new Button("西侧按钮"),BorderLayout.WEST);
        frame.add(new Button("东侧按钮"),BorderLayout.EAST);
        frame.add(new Button("中间按钮"),BorderLayout.CENTER);
        frame.setBounds(500,300,1920,1080);
        frame.pack();   //最佳大小
        frame.setVisible(true);


    }
}
