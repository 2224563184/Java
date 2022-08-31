package Component基类;

import javax.swing.*;
import java.awt.*;

public class BasicComponentDemo {
    Frame frame=new Frame();

    TextArea ta = new TextArea(5,20); //多行文本

    Choice choice = new Choice();                        //下拉选择框

    CheckboxGroup cbg=new CheckboxGroup();                              //组合选择框
    Checkbox checkbox = new Checkbox("男",cbg,true);        //单选框
    Checkbox eckbox = new Checkbox("女",cbg,false);          //单选框

    Checkbox kbox = new Checkbox("是否已婚");       //复选框

    TextField textField = new TextField(20);     //单行文本
    Button button = new Button("确认");            //按钮

    List list=new List(6);                         //列表选择框
    public void init(){
//组件界面
        Box TB = Box.createHorizontalBox();            //单行文本和按钮
        TB.add(textField);
        TB.add(button);
        frame.add(TB,BorderLayout.SOUTH);

        Box vbox = Box.createHorizontalBox();           //多行文本,下来选择框,组合框,复选框
          vbox.add(ta);
          choice.add("红色");
          choice.add("蓝色");
          choice.add("绿色");
          vbox.add(choice);         //下拉选择框
          vbox.add(checkbox);       //组合框
          vbox.add(eckbox);
          vbox.add(kbox);          //复选框
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(ta);
        verticalBox.add(vbox);
        frame.add(verticalBox,BorderLayout.WEST);

        list.add("红色");
        list.add("蓝色");
        list.add("绿色");
        Box horizontalBox = Box.createHorizontalBox();
           horizontalBox.add(list);
           frame.add(horizontalBox);
           frame.pack();
           frame.setVisible(true);

    }

    public static void main(String[] args){
        new BasicComponentDemo().init();


    }
}
