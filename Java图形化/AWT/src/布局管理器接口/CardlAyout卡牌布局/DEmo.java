package 布局管理器接口.CardlAyout卡牌布局;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DEmo {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Panel p1 = new Panel();
        CardLayout cardLayout=new CardLayout();
        p1.setLayout(cardLayout);
        String[]s={"第一张","第二张","第三张","第四张","第五张",};
        for (int i = 0; i < s.length; i++) {
            p1.add(s[i],new Button(s[i]) );
        }
//按钮
        Button b1=new Button("第一张");
        Button b2=new Button("最后一张");
        Button b3=new Button("下一张");
        Button b4=new Button("上一张");
        Button b5=new Button("第三张");
//行为
        ActionListener listener=new ActionListener() {  //监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();//监听按钮的字符串
                switch (actionCommand){                     //监听字符串得到对应的操作
                    case "第一张":
                           cardLayout.first(p1);
                        break;
                    case "最后一张":
                        cardLayout.last(p1);
                        break;
                    case "上一张":
                        cardLayout.previous(p1);
                        break;
                    case "下一张":
                        cardLayout.next(p1);
                        break;
                    case "第三张":
                        cardLayout.show(p1,"第三张");
                        break;
                }
            }
        };
//按键和行为绑定
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);
        Panel p2 = new Panel();
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        frame.add(p1, BorderLayout.NORTH);
        frame.add(p2);
        frame.pack();
        frame.setVisible(true);

    }
}
