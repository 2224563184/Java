package 选择框.ListMode;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;

public class ListMode {
    JFrame jFrame=new JFrame();

    JList jList=new JList(new Mode(1,20,1));

//    JList jList=new JList(new Mode副本(new BigDecimal(1),new BigDecimal(20),new BigDecimal(1)));
    private void init(){
//        jList.setVisibleRowCount(5);
        jFrame.add(jList);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(700,200,500,500);

    }

    public static void main(String[] args) {
        new ListMode().init();
    }
}
