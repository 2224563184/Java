package Container容器体系.ScroPanel滚动条容器;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        Frame frame=new Frame("窗口标题");
        frame.setBounds(700,200,300,300);
        frame.setVisible(true);
//添加滚动条
        ScrollPane sp=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);  //滚条组件
        sp.add(new TextField("文本"));
        sp.add(new Button("按钮"));
        frame.add(sp);
        
    }
}
