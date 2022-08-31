package 练习;

import 特殊容器.分割容器.book;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import java.util.Vector;

public class Demno {
  JFrame jFrame =new JFrame("列表框测试");

  String [] s={"java","javaEE","Android"};              //字符串

  JPanel layout=new JPanel();                             //单选按钮容器

   ButtonGroup layoutGroup=new ButtonGroup();            //单选框组合

    JTextArea  favorite=new JTextArea(5,20); //文本域

    JList<String> booklist;                              //列表框

    JComboBox<String> bookSelct;                         //下拉选择框

   JPanel selecPanel=new JPanel();                       //单选按钮容器

    ButtonGroup selecGroup=new ButtonGroup();            //单选框组合


//封装方法 ,往layouPanel容器添加单选按钮
  private void addbnt2LayouPanel(String name,int layoutType){  //layoutType:布局
//    容器设置边框,蚀刻边框
      layout.setBorder(new TitledBorder(new EtchedBorder(),"确定选项布局"));
//    创建单选按钮
      JRadioButton button=new JRadioButton(name);
//      将单选按钮添加到容器中
      layout.add(button);
//     设置第一个单选按钮为 默认按钮
       if (layoutGroup.getButtonCount()==0){  //获取按钮的数量,如果是0代表没有按钮,如果是第一个则设置默认按钮
           button.setSelected(true);
       }
//     将按钮添加到按钮组合中
       layoutGroup.add(button);

//     按钮设置监听
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                booklist.setLayoutOrientation(layoutType);
            }
        });
  }
private  void addbntsel2Panel(String name,int selecModel){

//    容器设置边框,蚀刻边框
    selecPanel.setBorder(new TitledBorder(new EtchedBorder(),"确定选择模式"));
//    创建单选按钮
    JRadioButton button2=new JRadioButton(name);
//    将按钮添加到容器中
      selecPanel.add(button2);
//     设置按钮组合第一个按钮为默认
      if (selecGroup.getButtonCount()==0){
          button2.setSelected(true);
      }
//    将按钮添加到按钮组合中
      selecGroup.add(button2);

//监听按钮的选择
     button2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             booklist.setSelectionMode(selecModel);    //将选择框 的选项设置为无限制
         }
     });
}
   private void init(){
       addbnt2LayouPanel("纵向模式",JList.VERTICAL);
       addbnt2LayouPanel("纵向换行",JList.VERTICAL_WRAP);
       addbnt2LayouPanel("纵向模式",JList.HORIZONTAL_WRAP);

       addbntsel2Panel("无限模式",ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
       addbntsel2Panel("单选模式",ListSelectionModel.SINGLE_SELECTION);
       addbntsel2Panel("单范围模式",ListSelectionModel.SINGLE_INTERVAL_SELECTION);

       booklist =new JList<>(s);

       booklist.setVisibleRowCount(2);          //列表框可视数量
       booklist.setSelectionInterval(2,4);
//    将列表框的内容设置给文本域
//     监听列表框
       bookSelct=new JComboBox<>(s);
       booklist.addListSelectionListener(new ListSelectionListener() {
           @Override
           public void valueChanged(ListSelectionEvent e) {
//               获取列表框选定的值集合
               List<String> selectedValuesList = booklist.getSelectedValuesList();
//               清空文本域内容
               favorite.setText("");
//                遍历表框选定的值集合
               for (String str : selectedValuesList) {
//                   把遍历表框选定的值集合赋值给文本域
                   favorite.setText(str+"\n");
               }
           }
       });
//      将下拉选择框的条目赋值给文本域
//       监听下拉选择框
       bookSelct.addItemListener(new ItemListener() {
           @Override
           public void itemStateChanged(ItemEvent e) {
//               获取下拉选择框选中的条目
               Object selectedItem = bookSelct.getSelectedItem();
//               清空文本域
                 favorite.setText("");
//              将获取下拉选择框选中的条目赋值给文本域
                favorite.setText(selectedItem.toString());  //必须转换成字符串
           }
       });

//组装顶部
       Box vbox = Box.createVerticalBox();
       Component table;
       JScrollPane jScrollPane=new JScrollPane(booklist);
       vbox.add(jScrollPane);                       //列表框
       vbox.add(layout);                         //单选框
       vbox.add(selecPanel);                     //单选框

       bookSelct.setEditable(true);   //下拉选择框可编辑
       bookSelct.setMaximumRowCount(4);//可视下拉选择框

//     组装顶部左右
       Box hbox = Box.createHorizontalBox();
       hbox.add(vbox);
       JPanel jPanel=new JPanel();
       jPanel.add(bookSelct);
       hbox.add(jPanel);
//      组装底部

       JPanel jp=new JPanel();                  //内置容器
       jp.setLayout(new BorderLayout());        //修改布局
       jp.add(new JLabel("你喜欢的图书:"),BorderLayout.NORTH);
       jp.add(favorite);


//       组装合并
       Box to = Box.createVerticalBox();
       to.add(hbox);
       to.add(jp);


       jFrame.add(to);
       jFrame.setVisible(true);
       jFrame.pack();
       jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


   }

  public static void main(String[] args) {
    new Demno().init();
  }
}
