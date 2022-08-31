package 下拉选择框.ListMode不强制存储;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.BigDecimal;
import java.util.List;


//  使用JListMode, 在 new构造之后会自动返回getSize方法、getElementAt方法的结果  切忌!切忌!切忌!



public class JList与JComboBox {
//    创建窗口
    JFrame jFrame=new JFrame("窗口");
//    创建选择框                         添加Mode类,形参 BigDecimal类型的开始值;BigDecimal类型的结束值;BigDecimal类型的布长值
   JList<BigDecimal> jList=new JList(new 列表框的Mode(new BigDecimal(1),new BigDecimal(21),new BigDecimal(2)));

//   创建下拉选择框
    JComboBox<BigDecimal> jComboBox=new JComboBox(new 下拉选择框的Mode(new BigDecimal(1),new BigDecimal(21),new BigDecimal(2)));

    JLabel jLabel=new JLabel("你的选择:");

    TextField textField=new TextField(20);

    private void init(){
//        组装视图
        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
//                清空文本域内容
                textField.setText("");
//        获取选择框  选中的值集合
                List<BigDecimal> selectedValuesList = jList.getSelectedValuesList();
                for (int i = 0; i < selectedValuesList.size(); i++) {
                    BigDecimal bigDecimal = selectedValuesList.get(i);
                    textField.setText(bigDecimal.toString());   //将值 转换为String并赋值给文本域
                }
            }
        });
        jComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
//                格式化文本域
                textField.setText("");
//                获取下拉选择框 选中的值
                Object selectedItem = jComboBox.getSelectedItem();
                  textField.setText(selectedItem.toString());//.将值 转换为String并赋值给文本域
            }
        });
         JPanel jpae=new JPanel();
         jpae.setLayout(new BorderLayout());
        JPanel jp=new JPanel();
        jp.add(jComboBox);

        jpae.add(new JScrollPane(jList));
        jpae.add(jp,BorderLayout.EAST);



        JPanel jPanel=new JPanel();
        jPanel.add(jLabel);
        jPanel.add(textField);

        Box vbox = Box.createVerticalBox();
        vbox.add(jpae);
        vbox.add(jPanel);

        jFrame.add(vbox);
        jFrame.setVisible(true);
        jFrame.pack();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JList与JComboBox().init();
    }
}

