package 事件处理;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class 体验事件监听3 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Choice choice = new Choice();
        choice.add("柳岩");
        choice.add("智代");
        choice.add("西野");
//需求:监听文本域的变化
        TextField textField = new TextField(20);
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(choice);
        horizontalBox.add(textField);

        textField.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                System.out.println("当前文本:"+textField.getText());
            }
        });
//需求:监听选择框的变化
        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("当前选择:"+e.getItem());
            }
        });
//监听容器添加组件
        frame.addContainerListener(new ContainerListener() {
            @Override
            public void componentAdded(ContainerEvent e) {
                System.out.println("容器添加:"+e.getChild());

            }

            @Override
            public void componentRemoved(ContainerEvent e) {
            }
        });
        frame.add(horizontalBox);
        frame.pack();
        frame.setVisible(true);

    }
}
