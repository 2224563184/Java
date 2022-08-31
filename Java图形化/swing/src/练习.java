import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 练习 {
    JFrame jFrame=new JFrame();
//菜单栏
    JMenuBar jMenuBar=new JMenuBar();
//菜单组件
    JMenu    jMenu   =new JMenu("编辑");
    JMenu    filejmenu=new JMenu("文件");
//菜单项
    JMenuItem auto=new JMenuItem("自动换行");
    JMenuItem copy=new JMenuItem("复制");
    JMenuItem paste=new JMenuItem("粘贴");
//菜单组件
    JMenu    format=new JMenu("格式");
//菜单项
    JMenuItem notes=new JMenuItem("注释");
    JMenuItem noteoff=new JMenuItem("取消注释");
//多行文本域
    JTextArea jTextArea=new JTextArea(10,40);
//选择框
    String[] s={"红色","蓝色","绿色"};
    JList<String>jList=new JList<String>(s);
//下拉选择框
    JComboBox<String>jComboBox=new JComboBox<>();
//单选框组合
     ButtonGroup buttonGroup=new ButtonGroup();
     JRadioButton jRadioButton=new JRadioButton("男");
     JRadioButton jRadioButton2=new JRadioButton("女",true);
//复选框
      JCheckBox  jCheckBox =new JCheckBox("是否已婚",true);
//单行文本域
     JTextField textField=new JTextField(60);
//确定按钮
     JButton    ok =new JButton("确定");
//右键菜单
    JPopupMenu jPopup=new JPopupMenu();
    ButtonGroup ggro    =new ButtonGroup();
//菜单项
JRadioButtonMenuItem  metalItem =new JRadioButtonMenuItem("metalItem风格");
JRadioButtonMenuItem  nimbus    =new JRadioButtonMenuItem("nimbus风格");
JRadioButtonMenuItem windows =new JRadioButtonMenuItem("windows风格");
JRadioButtonMenuItem WindowsClassicist =new JRadioButtonMenuItem("windows经典风格",true); //默认使用
JRadioButtonMenuItem  motif    =new JRadioButtonMenuItem("motif风格");

    private void init(){
//南部容器
        JPanel jPanel = new JPanel();
        jPanel.add(textField);
        jPanel.add(ok);
        jFrame.add(jPanel, BorderLayout.SOUTH);
//中间容器
        JPanel p = new JPanel();
//下拉选择框
        jComboBox.addItem("绿色");
        jComboBox.addItem("红色");
        jComboBox.addItem("蓝色");
        p.add(jComboBox);
        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton2);
        p.add(jRadioButton);
        p.add(jRadioButton2);
        p.add(jCheckBox);
        Box vbox = Box.createVerticalBox();
        vbox.add(jTextArea);
        vbox.add(p);
        Box hbox = Box.createHorizontalBox();
        hbox.add(vbox);
        hbox.add(jList);

        ActionListener actionListener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                it(actionCommand);
            }
        };
//右键菜单项行为
        metalItem.addActionListener(actionListener);
        nimbus.addActionListener(actionListener);
        windows.addActionListener(actionListener);
        WindowsClassicist.addActionListener(actionListener);
        motif.addActionListener(actionListener);
//多行文本域可见右键菜单
         jTextArea.setComponentPopupMenu(jPopup);
//菜单栏部分
                            //jMenuBar    菜单栏
                             //filejmenu  文件菜单
        jMenu.add(auto);    //jMenu      编辑菜单
                            //format     格式菜单

        jMenu.addSeparator(); //分割线
        jMenu.add(copy);
        jMenu.add(paste);
        jMenu.addSeparator(); //分割线

        format.add(notes);
        format.add(noteoff);
        jMenu.add(format);   //编辑菜单,格式菜单
        jMenuBar.add(filejmenu);//菜单栏,文件
        jMenuBar.add(jMenu);    //菜单栏,编辑
        jFrame.setJMenuBar(jMenuBar);
        jFrame.add(hbox);
        jFrame.setVisible(true);
        jFrame.pack();
//把菜单项组成一组菜单
        ggro.add(metalItem);
        ggro.add(nimbus);
        ggro.add(windows);
        ggro.add(WindowsClassicist);
        ggro.add(motif);
//菜单组件添加菜单项
        jPopup.add(metalItem);
        jPopup.add(nimbus);
        jPopup.add(windows);
        jPopup.add(WindowsClassicist);
        jPopup.add(motif);

    }
    private void it(String Command){
       switch (Command){
           case "metalItem风格":
               try {
                   UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
               } catch (ClassNotFoundException e) {
                   e.printStackTrace();
               } catch (InstantiationException e) {
                   e.printStackTrace();
               } catch (IllegalAccessException e) {
                   e.printStackTrace();
               } catch (UnsupportedLookAndFeelException e) {
                   e.printStackTrace();
               }
               break;
           case "nimbus风格":
               try {
                   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
               } catch (ClassNotFoundException e) {
                   e.printStackTrace();
               } catch (InstantiationException e) {
                   e.printStackTrace();
               } catch (IllegalAccessException e) {
                   e.printStackTrace();
               } catch (UnsupportedLookAndFeelException e) {
                   e.printStackTrace();
               }
               break;
           case "windows风格":
               try {
                   UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
               } catch (ClassNotFoundException e) {
                   e.printStackTrace();
               } catch (InstantiationException e) {
                   e.printStackTrace();
               } catch (IllegalAccessException e) {
                   e.printStackTrace();
               } catch (UnsupportedLookAndFeelException e) {
                   e.printStackTrace();
               }

               break;
           case "windows经典风格":
               try {
                   UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
               } catch (ClassNotFoundException e) {
                   e.printStackTrace();
               } catch (InstantiationException e) {
                   e.printStackTrace();
               } catch (IllegalAccessException e) {
                   e.printStackTrace();
               } catch (UnsupportedLookAndFeelException e) {
                   e.printStackTrace();
               }

               break;
           case "motif风格":
               try {
                   UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
               } catch (ClassNotFoundException e) {
                   e.printStackTrace();
               } catch (InstantiationException e) {
                   e.printStackTrace();
               } catch (IllegalAccessException e) {
                   e.printStackTrace();
               } catch (UnsupportedLookAndFeelException e) {
                   e.printStackTrace();
               }

               break;
       }
        SwingUtilities.updateComponentTreeUI(jFrame.getContentPane());
       SwingUtilities.updateComponentTreeUI(jMenu);
       SwingUtilities.updateComponentTreeUI(jPopup);

    }
    public static void main(String[] args) {
        new 练习().init();
    }

}
