package 绘图.绘图;


import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Demo {
       private Frame frame = new Frame("绘图小程序");
//       定义画图区的宽高
        private  final  int AREA_WINDTH=300; //宽
        private  final  int AREA_HEIGHT=400;//高
        private  int  preX=-1;  //坐标标记
        private  int  preY=-1;  //坐标标记

 private
//右键菜单
    PopupMenu popupMenu = new PopupMenu();       //   菜单组件
    MenuItem  red = new MenuItem("红色");   //  菜单项
    MenuItem  blue = new MenuItem("蓝色"); //   菜单项
    MenuItem  green = new MenuItem("绿色");

//定义一个变量,记录当前画笔的颜色;
       private  Color forceColor=Color.BLACK;   //   标记一个接收颜色的记录
//    创建一个BufferedImage位图对象
        BufferedImage image=new BufferedImage(AREA_WINDTH,AREA_HEIGHT ,BufferedImage.TYPE_INT_RGB );
//通过位图,获取关联的Graphics对象
        Graphics g = image.getGraphics();    //为此组件创建上下文

//自定义类,继承Canvas
        private class Mycanvas extends Canvas{
            @Override
     public void paint(Graphics g) {
        g.drawImage(image,0,0,null);

            }
        }
    Mycanvas drawArea =new Mycanvas();
//获取点击的字符串,得到对应的颜色
private void init(){
        ActionListener listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                switch (actionCommand){
                    case "红色":
                        forceColor=Color.RED;   //修改画笔颜色记录
                        break;
                    case "蓝色":
                        forceColor=Color.BLUE;
                        break;
                    case "绿色":
                        forceColor=Color.GREEN;
                        break;
                }
            }
        };
//监听菜单项的点击行为
        red.addActionListener(listener);
        blue.addActionListener(listener);
        green.addActionListener(listener);
//将菜单项添加到右键条目中
        popupMenu.add(red);
        popupMenu.add(blue);
        popupMenu.add(green);

        drawArea.add(popupMenu);  //画图区域 添加菜单条目

        drawArea.addMouseListener(new MouseAdapter() {    //当鼠标键抬起时被调用
            @Override
            public void mouseReleased(MouseEvent e) {

                boolean popupTrigger = e.isPopupTrigger();//是否抬起鼠标右键
//           条目显示方法,显示在哪个区域,X轴,Y轴
                if (popupTrigger) {
                    popupMenu.show(drawArea, e.getX(), e.getY()); //第一次画图
//              e.getX(), e.getY()属于最终点坐标,所以需要去自定义坐标

//                    多次绘图就重置坐标
                    preX=-1;
                    preY=-1;
                }
            }
      });
//设置位图的背景为白色并填充
         g.setColor(Color.white);
         g.fillRect(0,0,AREA_WINDTH,AREA_HEIGHT);

//给绘图区域设置鼠标移动监听,通过鼠标移动来完成线条绘制
        drawArea.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (preX>-1&&preY>-1){        //   判断第一次画图使用标记坐标
                    g.setColor(forceColor);
                    g.drawLine(preX,preY,e.getX(),e.getY()); //绘画起点
                }
//                                                             绘画重点
                  preX=e.getX();
                  preY=e.getY();


//               换区域绘图就重置标记坐标
//                  重绘画图
                  drawArea.repaint();
            }
        });
        frame.add(drawArea);
        frame.setSize(new Dimension(AREA_WINDTH,AREA_HEIGHT));
        frame.setVisible(true);

}

    public static void main(String[] args) {
         new Demo().init();
    }
}

