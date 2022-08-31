package 菜单组件;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class 体验菜单 {
  private   Frame frame =new Frame();
//创建菜单条
    MenuBar menuBaru=new MenuBar();

//创建菜单组件
     Menu  fileMenu    = new Menu("文件");
    Menu  ediMenu    = new Menu("编辑");
    Menu  formatMenu    = new Menu("格式");

//创建菜单项
    MenuItem auto    =new MenuItem("自动换行");
    MenuItem copy    =new MenuItem("复制");
    MenuItem paste    =new MenuItem("粘贴");

    MenuItem comment    =new MenuItem("注释",new MenuShortcut(KeyEvent.VK_Y,true));
    MenuItem past    =new MenuItem("取消注释");
private void init(){
//组转界面
    formatMenu.add(comment);
    formatMenu.add(past);

    ediMenu.add(copy);
    ediMenu.add(paste);
    ediMenu.add(auto);
    ediMenu.add(formatMenu);

    menuBaru.add(fileMenu);
    menuBaru.add(ediMenu);


    frame.setMenuBar(menuBaru);
    frame.setVisible(true);
    frame.setBounds(700,200,700,700);
    frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });

}
    public static void main(String[] args) {
      new 体验菜单().init();
    }
}
