package 练习;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Demo {
//    窗口
    JFrame jFrame=new JFrame("测试");

//   文本域
   JTextField jTextField=new JTextField(20);



//   两个按钮
    JButton add=new JButton("添加指定图书");
    JButton exit=new JButton("删除指定图书");

    //    实化deMode 选择框、下拉选择框专用
    DefaultListModel deMode=new DefaultListModel();

    //  列表框
    JList jList =new JList<>(deMode);

//    滑动条
     JScrollPane jScrollPane=new JScrollPane(jList);
     private void init(){

         jList.setVisibleRowCount(5);                                 //可视选项
         Box hbox = Box.createHorizontalBox();
         hbox.add(new JScrollPane(jList));
         jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //设置单选
        ActionListener ActionEvent=new ActionListener() {              //设置监听
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String actionCommand = e.getActionCommand();
                switch (actionCommand){
                    case "添加指定图书":
                        String name = jTextField.getText();   //获取文本域的字符串

                        if (!name.trim().equals("")){         // ！字符串前面和后面都是 ” “空格，则添加到列表框中; name.trim().equals("")是一个整体
                            if (!deMode.contains(name))
                            deMode.addElement(name);

                        }
                        break;
                    case "删除指定图书":
                        jList.addListSelectionListener(new ListSelectionListener() {
                            @Override
                            public void valueChanged(ListSelectionEvent e) {
                                Object selectedValue = jList.getSelectedValue();
                                       deMode.removeElement(selectedValue);


                            }
                        });
                        break;
                }
            }
            };
           add.addActionListener(ActionEvent);
           exit.addActionListener(ActionEvent);


//           组装视图

//            组装南部
          JPanel jPanel=new JPanel();
         jPanel.add(jTextField);
         jPanel.add(add);
         jPanel.add(exit);
//         组装北部
         Box vbox = Box.createVerticalBox();
         vbox.add(hbox);
         vbox.add(jPanel);

         jFrame.add(vbox);
         jFrame.setVisible(true);
         jFrame.pack();
         jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     }

    public static void main(String[] args) {
         new Demo().init();
    }


     }

