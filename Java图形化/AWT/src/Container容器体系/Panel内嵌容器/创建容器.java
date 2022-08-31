package Container容器体系.Panel内嵌容器;

import java.awt.*;

public class 创建容器 {
    public static void main(String[] args) {
//        创建一个Windows对象
        Frame frame=new Frame("标题");//Windows
//        创建Panel对象
        Panel panel=new Panel();
//        创建文本组件
        panel.add(new TextField("文本"));
//        创建按钮组件
        panel.add(new Button("按钮"));
//        将容器添加到Windows中
        frame.add(panel);
//        将Windows窗口设置可见
        frame.setVisible(true);
//        设置Windows窗口位置、大小
        frame.setBounds(700,200,300,300);

    }
}
