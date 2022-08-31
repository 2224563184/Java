package 选择框.ListMode;

import javax.swing.*;
import java.awt.*;
import java.util.prefs.Preferences;

public class QQ好友列表副本 {
    JFrame jFrame=new JFrame();

     String[] s={"李清照","苏格拉底","李白","弄玉","虎头"};

    JList jList=new JList(s);

     private void init(){
//       给Jlist列表框添加渲染器

         jList.setCellRenderer(new MyRenderer());


         jFrame.add(new JScrollPane(jList));
         jFrame.setVisible(true);
         jFrame.setBounds(700,200,700,700);
         jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }



    private class MyRenderer extends JPanel  implements ListCellRenderer  {
        //          声明变量,接收数据;后续重置数据
       private  String name;  //每个名称
       private  Color  ba;   // 背景色
       private  Color fo;     //前景色
       private  ImageIcon  imageIcon;// 图标
        //         获取列表框数据
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        name= value.toString();
             ba=isSelected?list.getSelectionBackground():list.getBackground();
            fo=isSelected?list.getSelectionForeground():list.getForeground();
       this.imageIcon=new ImageIcon("C:\\Users\\2\\Desktop\\"+(name)+".jpg");
            return this;
        }
//设置每天条目的宽高
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(20,30);
        }
//绘图背景色
        @Override
        public void paint(Graphics g) {
         g.setColor(ba);                               //设置颜色
         g.fillRect(0,0,getWidth(),getHeight());//绘制矩形
//绘制图标
            g.drawImage(imageIcon.getImage(),this.getWidth()/2-imageIcon.getIconWidth()/2,10,null);
//字体
            g.setFont(new Font("StSong",Font.BOLD,18));
            g.drawString(name,getWidth()/2-name.length()*10,imageIcon.getIconHeight());
        }
    }

    public static void main(String[] args) {
        new QQ好友列表副本().init();
    }
}
