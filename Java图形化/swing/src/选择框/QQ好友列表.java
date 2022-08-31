package 选择框;

import javax.swing.*;
import java.awt.*;

public class QQ好友列表 {
   private JFrame mainWin=new JFrame("QQ好友列表");
    private String[] friedns={"李清照","苏格拉底","李白","弄玉","虎头"};


    JList<String> friendsLisat=new JList<>(friedns);
    private void init(){
        friendsLisat.setCellRenderer(new MyListCellRenderer());

        mainWin.add(new JScrollPane(friendsLisat));
        mainWin.setVisible(true);
        mainWin.setBounds(700,200,500,500);
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
//   绘制列表内容
//ListCellRenderer实现接口:
private class  MyListCellRenderer extends JPanel implements ListCellRenderer{
//声明变量区:
private  String name;       //名字
private  ImageIcon icon;         //图标
private  Color bakGround;   //记录背景色
private  Color forGround;   //记录前景色,文字的颜色


//获取列表框的数据并返回一个组件
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        //         返回值:   Component 组件
//         返回参数: JList列表框,object 名字 ,int 索引 ,boolean焦点
//                 boolean isSelected是否被选中,
//         总结:    返回参数有指定列表框,指定列表框索引了,所有最终的返回值的组件应该是容器
// return this:    返回本类 Component(组件)
//修改成员变量的值:
                this.name=value.toString();              //修改名字
               icon=new ImageIcon("C:\\Users\\2\\Desktop\\"+(name)+".jpg");//修改图标
                this.bakGround= isSelected?list.getSelectionBackground():list.getBackground();
                                                         //修改背景色
//是否被选中?是:获取当前列表框选中的默认背景色;否:获取当前列表框普通背景色
                this.forGround=isSelected?list.getSelectionForeground():list.getForeground();
//                                                       //修改前景色
//                                 是否被选中?是:获取当前列表框选中的默认前景色;否:获取当前列表框普通前景色
                return this;
    }

//修改每个条目的宽高
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(60,80);
    }

//修改绘制的图标和绘制的字体
    @Override
    public void paint(Graphics g) {
//        获取组件的宽度: this.getWidth   60      X轴
//        获取组件的高度: this.getheight  80      Y轴
//        获取图标的宽度: Icon.getWidth           X轴
//        获取图标的高度: Icon.getheight          Y轴
//        计算公式: (组件宽度➗2)-(图标宽度➗2)=位图x轴位置; 位图Y轴:任意偏移

//绘制背景色
         g.setColor(bakGround);
         g.fillRect(0,0,this.getWidth(),this.getHeight());//填充矩形背景

//绘制头像:
        g.drawImage(icon.getImage(),this.getWidth()/2-icon.getIconWidth()/2,10,null);
//绘制名字:
         g.setFont(new Font("StSong",Font.BOLD,18));
         g.drawString(name,this.getWidth()/2-this.name.length()*10,this.icon.getIconHeight());
    }
}
    public static void main(String[] args) {
        new QQ好友列表().init();
    }

}
