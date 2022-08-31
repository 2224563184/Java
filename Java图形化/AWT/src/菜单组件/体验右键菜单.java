package 菜单组件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class 体验右键菜单 {
    Frame frame=new Frame();

//创建文本域
   TextArea ta=new TextArea("我爱中华",10,20  );

//创建容器
    Panel  p=new Panel();

//创建PopupMenu

    PopupMenu popupMenu=new PopupMenu();

//创建菜单项
    MenuItem comment =new MenuItem("注释");
    MenuItem cancelComment =new MenuItem("取消注释");
    MenuItem copy =new MenuItem("复制");
    MenuItem save =new MenuItem("保存");

private void init(){

// 一、菜单栏

//监听点击菜单
//点击菜单项后得到效果
    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String actionCommand = e.getActionCommand();
            ta.append("点击了"+actionCommand+"\n\r");
        }
    };
//事件源监听,点击了哪个菜单项
    comment.addActionListener(listener);
    cancelComment.addActionListener(listener);
    copy.addActionListener(listener);
    save.addActionListener(listener);

// PopupMenu组装
    popupMenu.add(comment);
    popupMenu.add(cancelComment);
    popupMenu.add(copy);
    popupMenu.add(save);

//popupMenu放入容器
    p.add(popupMenu);

//设置容器大小
    p.setPreferredSize(new Dimension(800,50));

//二、右键弹出菜单


//监听容器鼠标事件,监听用户释放鼠标动作,唤醒PopupMenu菜单

    p.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseReleased(MouseEvent e) {
            boolean flag = e.isPopupTrigger();//判断鼠标右键
            if (flag){
              popupMenu.show(p,e.getX(),e.getY());               //是,显示菜单效果
//           p:PopupMenu的源对象     e.get获取事件监听器的结果
            }
        }
    });
    frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
    frame.add(p,BorderLayout.SOUTH);
    frame.add(ta);
    frame.setVisible(true);
    frame.pack();
}

    public static void main(String[] args) {
        new 体验右键菜单().init();
    }
}
