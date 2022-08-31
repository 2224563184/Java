package 布局管理器接口.BorderLayout五格布局;

import java.awt.*;
//           需求:  将中间区域设置成组件
public class 练习 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(new BorderLayout(50,30));
        frame.add(new Button("北侧按钮"),BorderLayout.NORTH);
        frame.add(new Button("南侧按钮"),BorderLayout.SOUTH);
        frame.add(new Button("西侧按钮"),BorderLayout.WEST);
        frame.add(new Button("东侧按钮"),BorderLayout.EAST);
        frame.add(new Button("中间按钮"),BorderLayout.CENTER);

        Panel panel = new Panel(); //内置容器
        panel.add(new TextField("文本"));
        panel.add(new Button("Panel"));

        frame.add(panel);        //将Panel容器加入到Frame容器中,实现两个按钮
        frame.pack();
        frame.setVisible(true);//可见
//        在5个区域的其中一个添加多个组件时最后的组件覆盖该区域
//        如果添加的组件不指定区域时,组件默认添加在中间CENTER区域

    }
}
