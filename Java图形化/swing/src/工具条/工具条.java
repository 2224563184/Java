package 工具条;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class 工具条 {
   JFrame f= new JFrame();
//   创建多行文本域
    JTextArea jta=new JTextArea(6,40);
//   创建工具条
   JToolBar jToolBar=new JToolBar("工具条",JToolBar.HORIZONTAL);
//   添加点击监听、添加图标
      Action pre=new AbstractAction("上一曲",new ImageIcon("C:\\Users\\2\\Desktop\\上一曲.png")) {
          @Override
          public void actionPerformed(ActionEvent e) {
              jta.append("上一曲\r\n");
          }
      };
    Action pause=new AbstractAction("暂停",new ImageIcon("C:\\Users\\2\\Desktop\\暂停.png")) {
        @Override
        public void actionPerformed(ActionEvent e) {
            jta.append("暂停\r\n");
        }
    };
    Action next =new AbstractAction("下一曲",new ImageIcon("C:\\Users\\2\\Desktop\\下一曲.png")) {
        @Override
        public void actionPerformed(ActionEvent e) {
            jta.append("下一曲\r\n");
        }
    };
private  void init(){
//   Action按钮放入工具条
//     jToolBar.add(pre);
//     jToolBar.addSeparator();
//     jToolBar.add(pause);
//     jToolBar.addSeparator();
//     jToolBar.add(next);

//   把Action的名称、监听器、图标注册JButton到按钮中 ;继承Action按钮
     JButton Anter=new JButton(pre);
     JButton Pau=new JButton(pause);
     JButton Siguien=new JButton(next);
//把JButton按钮放入工具条
    jToolBar.add(Anter);
    jToolBar.addSeparator();
    jToolBar.add(Pau);
    jToolBar.addSeparator();
    jToolBar.add(Siguien);
    jToolBar.setFloatable(true);

     f.add(jToolBar,BorderLayout.NORTH);
     f.add(jta);
     f.setVisible(true);
     f.pack();
}

    public static void main(String[] args) {
        new 工具条().init();
    }
}
