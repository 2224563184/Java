package 特殊容器.标签分割容器;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class 标签容器 {
    JFrame jFrame=new JFrame();

    JTabbedPane tab=new JTabbedPane(SwingConstants.LEFT, JTabbedPane.SCROLL_TAB_LAYOUT);

    private void init(){
     tab.addTab("用户管理",new ImageIcon("C:\\Users\\2\\Desktop\\1.png"),new JList<String>(new String[]{"用户一","用户二","用户三"}));
    tab.addTab("商品管理",new ImageIcon("C:\\Users\\2\\Desktop\\1.png"),new JList<String>(new String[]{"商品一","商品二","商品三"}));
    tab.addTab("订单管理",new ImageIcon("C:\\Users\\2\\Desktop\\1.png"),new JList<String>(new String[]{"订单一","订单二","订单三"}));
//禁用标签
    tab.setEnabledAt(0,false);
//默认标签
    tab.setSelectedIndex(2);
////删除标签
//     tab.remove(1);

//监听标签
    tab.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
// 获取选中哪个标签的索引
            int selectedIndex = tab.getSelectedIndex();
             JOptionPane.showMessageDialog(jFrame,"选中"+(selectedIndex+1)+"个标签","提示窗口",JOptionPane.QUESTION_MESSAGE);
        }
//        此方法不支持删除标签的容器
    });
    jFrame.add(tab);
    jFrame.setVisible(true);
    jFrame.pack();
    }


    public static void main(String[] args) {
        new 标签容器().init();

    }
}
