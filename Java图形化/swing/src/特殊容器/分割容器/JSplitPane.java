package 特殊容器.分割容器;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JSplitPane {
// 对象数组
    book[] books={new book("java",new ImageIcon("C:\\Users\\2\\Desktop\\1.png"),"java语言编程书"),
                  new book("c++",new ImageIcon("C:\\Users\\2\\Desktop\\1.png"),"c++语言编程书"),
                  new book("Go",new ImageIcon("C:\\Users\\2\\Desktop\\1.png"),"Go语言编程书")};
//    private String name;
//    private Icon   icon;
//    private String desc;

     JFrame f=new JFrame();

//    jtabbedPane
    JList<book> booklist=new JList<>(books); //使用对象中的toString返回值在条目中:name  列表框

    JLabel bookCover =new JLabel();          //展示内容

    JTextArea bookDesc=new JTextArea();      //文本域

    private void init(){
        booklist.setPreferredSize(new Dimension(150,400));
        bookCover.setPreferredSize(new Dimension(220,130));
        bookDesc.setPreferredSize(new Dimension(220,270));

//     为JList booklist监听选择框条目
       booklist.addListSelectionListener(new ListSelectionListener() {
           @Override
           public void valueChanged(ListSelectionEvent e) {
//        获取选择了哪个条目
               book book = booklist.getSelectedValue();   //booklist:列表框
//         bookCover展示 图标      book对象的Icon
               bookCover.setIcon(book.getIcon());
//         bookDesc展示 文本     book对象的Desc
               bookDesc.setText(book.getDesc());
           }
       });
//设置滚动条
        JScrollPane Desc =new JScrollPane(bookDesc);

       javax.swing.JSplitPane js=new javax.swing.JSplitPane(javax.swing.JSplitPane.VERTICAL_SPLIT);
                  js.add(bookCover);
                  js.add(Desc);
//设置连续布局
                  js.setContinuousLayout(true);
      javax.swing.JSplitPane jSplitPane=new javax.swing.JSplitPane(javax.swing.JSplitPane.HORIZONTAL_SPLIT);
                  jSplitPane.setContinuousLayout(true);
                 jSplitPane.add(js);
                 jSplitPane.add(booklist);
                 f.add(jSplitPane);
                 f.setVisible(true);
                 f.pack();
                 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JSplitPane().init();
    }
}
