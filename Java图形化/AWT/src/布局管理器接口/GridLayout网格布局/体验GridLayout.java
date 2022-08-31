package 布局管理器接口.GridLayout网格布局;

import java.awt.*;

public class 体验GridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("java计算器"); //总容器
//1.设置一个内置文本容器,将它放置北侧
        Panel panel = new Panel();//            内置容器
        panel.add(new TextField());//           文本组件
//2.设置一个内置按钮容器,需要15个按钮.将它默认放置中间
        Panel panel1 = new Panel();   //       内置容器

        panel1.setLayout(new GridLayout(3,5,5,5));//流水布局修改为网格布局,设置三行五列
        for (int i = 0; i < 10; i++) {

            panel1.add(new Button(i+"")); //   i+"" == String.valueOf()
        }
        panel1.add(new Button("+"));
        panel1.add(new Button("-"));
        panel1.add(new Button("*"));
        panel1.add(new Button("%"));
        panel1.add(new Button("."));

        Panel panel2 = new Panel();
        panel2.setLayout(new GridLayout(2,5,5,5));
        panel.add(new Button("M+"));
        panel.add(new Button("M-"));
        panel.add(new Button("MR"));
        panel.add(new Button("MC"));
        panel.add(new Button("C"));
        panel.add(new Button("CE"));
        panel.add(new Button("x²"));

//        frame.add(panel,BorderLayout.NORTH);    //文本容器

        frame.add(panel,BorderLayout.NORTH);
        frame.add(panel1,BorderLayout.CENTER);                      //网格容器
        frame.add(panel2,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);


    }
}
