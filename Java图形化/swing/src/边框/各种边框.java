package 边框;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

//需求:每一个容器在网格布局中设置不同的边框
//共性:容器   设置边框

public class 各种边框 {

    private void init(){
        //        创建顶级窗口
        JFrame f = new JFrame();
//        设置窗口为网格布局
        f.setLayout(new GridLayout(2,2));
//        创建各种边框
        Border bevelBorder = BorderFactory.createBevelBorder(10, Color.RED, Color.GRAY, Color.BLACK, Color.MAGENTA);
        Border lineBorder = BorderFactory.createLineBorder(Color.PINK, 10);
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 5, 20, 10);
        Border etchedBorder = BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.RED, Color.GRAY);
        TitledBorder titledBorder = new TitledBorder(new LineBorder(Color.cyan,10),"测试标题",TitledBorder.LEFT,TitledBorder.BOTTOM);
        MatteBorder matteBorder = new MatteBorder(10,5,20,10,Color.GREEN);
        CompoundBorder compoundBorder = new CompoundBorder(titledBorder, new LineBorder(Color.MAGENTA, 10));

//      窗口网格布局添加各种容器
        f.add(aVoid(bevelBorder,"bevelBorder"));
        f.add(aVoid(lineBorder,"lineBorder"));
        f.add(aVoid(emptyBorder,"emptyBorder"));
        f.add(aVoid(etchedBorder,"etchedBorder"));
        f.add(aVoid(titledBorder,"titledBorder"));
        f.add(aVoid(matteBorder,"matteBorder"));
        f.add(aVoid(compoundBorder,"compoundBorder"));
        f.setVisible(true);
        f.pack();
    }

    public static void main(String[] args) {

   new 各种边框().init();

    }
    private  JPanel aVoid(Border borde, String s){
//        创建容器
     JPanel jPanel=new JPanel();
//        容器展示字符串内容
     jPanel.add(new JLabel(s));
//         给容器设置边框
     jPanel.setBorder(borde);
     return jPanel;
    }

}
