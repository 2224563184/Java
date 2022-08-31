package 绘图.Canvas;

import java.awt.*;
import java.awt.event.*;
import javax.swing .Timer;

public class 弹球小游戏 {
    Frame frame  = new Frame("弹球小游戏");

//桌面的宽度和高度
    private final  int TABLE_WIDTH=300;   //桌面宽度
    private final  int TABLE_HEIGHT=400;  //桌面高度

//球拍的宽度和高度
    private final  int  RACKET_WINDTH=60;  //球拍宽度
    private final  int  RACKET_HEIGHT=20;  //球拍高度


    private final  int  BALL_SIZE=30;//小球的大小


    private int  balx=120; //小球宽度坐标
    private int  baly=20;  //小球高度坐标

//定义变量,记录小球在X和Y方向上移动速度; X和Y同时进行移动,那么会形成一个斜线
    private int  speedX=15;  //小球宽度速度
    private int  speedY=5;  //小球高度速度

//定义变量,记录球拍的坐标
    private int        rackX=120;  //球拍宽度坐标
    private final int  rackY=340;  //球拍高度坐标

//定义变量,记录游戏是否结束
    private boolean  isOver=false;  //默认结束

//声明一个定时器
  private Timer timer;

    private class  Mycanvas extends Canvas{
        @Override
        public void paint(Graphics g) {
//在这里绘制内容
// 游戏结束
        if (isOver) {
        g.setColor(Color.BLUE);
    g.setFont(new Font("Times", Font.BOLD, 30)); //设置字体
        g.drawString("游戏结束!", 50, 200);

// 游戏中
        }  else{
//绘制小球
       g.setColor(Color.RED);
       g.fillOval(balx,baly,BALL_SIZE,BALL_SIZE);
//绘制球拍
       g.setColor(Color.PINK);
       g.fillRect(rackX,rackY,RACKET_WINDTH,RACKET_HEIGHT);
           }
        }
    }
//创建会话区域
    Mycanvas drawArea=new Mycanvas();

//组装视图,游戏逻辑控制
    private void init() {

//球拍坐标的变化         重点!!!
        KeyListener listener = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                int keyCode = e.getKeyCode();//   获取键盘的整数

               if (keyCode==37) {            //   ←键 ASCll码: VK_LEFT (37)

                   if (rackX > 0) {           //    在桌面宽度的范围内,按←键有效
                       rackX -= 10;
                   }
               }

                   if (keyCode==39){
                   if (rackX<(TABLE_WIDTH-    //球拍的坐标按照最左计算的,
                         RACKET_WINDTH)){    // 所以需要桌面宽度-球拍宽度
                           rackX+=10;
                       }
                   }
               }
        };
              frame.addKeyListener(listener);    //注册监听器
              drawArea.addKeyListener(listener); //注册监听器

// 小球坐标控制       重点!重点!重点!
//            电脑控制小球,需要用到定时刷新
              ActionListener task=new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {

//                  根据边距范围,修正方向


//                  判断小球的宽度坐标,是否超出桌面的宽度?
//                   左边正常判断,右边 桌面宽度-小球的大小
                    if (balx<=0||balx>=(TABLE_WIDTH-BALL_SIZE)){
                           speedX=-speedX;//超出则往反方向移动
                    }
//
//               小球高度坐标>0 或者小球高度坐标>球拍高度坐标-小球的大小并且小球宽度坐标>球拍宽度坐标并且小球宽度<球拍宽度坐标+球拍宽度
//
                    if (baly<=0||(baly>rackY-BALL_SIZE&&balx>rackX-BALL_SIZE&&balx<rackX+RACKET_WINDTH)){
                        speedY=-speedY;
                    }
                    /*
               TABLE_WIDTH=300;  //桌面宽度边距
               TABLE_HEIGHT=400; //桌面高度边距
               RACKET_WINDTH=50; //球拍宽度
               RACKET_HEIGHT=15; //球拍高度
               BALL_SIZE=20;     //小球的大小
              balX=100;         //小球宽度坐标
              balY=30;          //小球高度坐标
              rackX=120;        //球拍宽度坐标
              rackY=340;         //球拍高度坐标


            speedX=5;     //小球移动宽度
           speedY=10;     //小球移动高度
               */


//                   小球超出球拍的范围,游戏结束
                    if (baly>rackY+BALL_SIZE&&(balx<rackX||balx>rackX+RACKET_WINDTH)){
                        //
//                   停止定时器
                     timer.stop();
//                    修改游戏是否结束的标记
                     isOver=true;
//                    重绘界面
                     drawArea.repaint();
                    }
//                   更新小球的坐标,重绘界面
                     balx+=speedX;
                     baly+=speedY;
//                   重绘界面
                     drawArea.repaint();
                  }
              };

              timer=new Timer(100,task);
              timer.start();
              /*
          TABLE_WIDTH=300;   //桌面宽度边距
          TABLE_HEIGHT=400;  //桌面高度边距
         RACKET_WINDTH=50;  //球拍宽度
         RACKET_HEIGHT=15;  //球拍高度
          BALL_SIZE=20;    //小球的大小
              balX=100;    //小球宽坐标
              balY=30;     //小球高坐标
            speedX=5;     //小球移动宽度
           speedY=10;    // 小球移动高度
               */
            drawArea.setPreferredSize(new Dimension(TABLE_WIDTH,TABLE_HEIGHT));
            frame.add(drawArea);
            frame.setVisible(true);
            frame.setBounds(700,200,300,400);
    }

    public static void main(String[] args) {
        new 弹球小游戏().init();
    }

}