package 布局管理器接口.CardlAyout卡牌布局;//package 布局管理器接口.CardlAyout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 体验CardLayout {


    public static void main(String[] args) {
        Frame frame = new Frame("java");
//一、
//1.创建一个 Panel容器对象，用来存储卡牌
        Panel panel1 = new Panel();
//2.创建一个CardLayout对象并且把该对象设置给之前的对象
        CardLayout cardLayout = new CardLayout();
        panel1.setLayout(cardLayout);
//3.给时间布局容器存储多个组件
        String [] name={"第一张","第二张","第三张","第四张","第五张"};
        for (int i = 0; i < name.length; i++) {
            panel1.add(name[i],new Button(name[i]) );
        }
       frame.add(panel1);
//二、
//1.创建五个按钮组件
        Button b1=new Button("第一张");
        Button b2=new Button("最后一张");
        Button b3=new Button("上一张");
        Button b4=new Button("下一张");
        Button b5=new Button("第三张");
//2.创建事件监听器,监听按钮的点击动作
        ActionListener  listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();//监听字符串,这个字符串是按钮上的文字
                switch (actionCommand){                     //每个字符串得到对应的操作
                    case "上一张":
                       cardLayout.previous(panel1);
                        break;
                    case "下一张":
                        cardLayout.next(panel1);
                    case "第一张":
                        cardLayout.first(panel1);
                        break;
                    case "最后一张":
                        cardLayout.last(panel1);
                        break;
                    case "第三张":
                        cardLayout.show(panel1,"第三张");
                        break;
                }
            }
        };
//3.按钮和按钮对应行为绑定在一起
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);
//把绑定的按钮放入容器中
        Panel panel2 = new Panel();
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        panel2.add(b5);
//4.把按钮容器放入窗口容器中
       frame.add(panel2,BorderLayout.SOUTH);
       frame.pack();
       frame.setVisible(true);
    }
}
