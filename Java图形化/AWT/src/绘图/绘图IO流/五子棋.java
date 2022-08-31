package 绘图.绘图IO流;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class 五子棋 {
    private JFrame frame = new JFrame();

    BufferedImage table;      //棋盘位图
    BufferedImage black;      //黑棋位图
    BufferedImage white;      //白棋位图
    BufferedImage setlected; //选择框位图

    private final int table_Wide = 550;    //棋盘宽
    private final int table_High = 550;    //棋盘宽

    final int BOARD_SIZE = 15;             //声明变量,横向总共可以下的棋子
    final int BOARD_SIZ = 15;              //声明变量,纵向总共可以下的棋子

    final int RATE = table_Wide / BOARD_SIZE;//棋子各占用棋盘的比率

    final int X_OFFSET = 5;                 //声明变量,记录棋子对X方向和Y方向的偏移量
    final int Y_OFFSET = 5;
//长度
    int[][] board = new int[BOARD_SIZE][BOARD_SIZE]; //声明变量,记录横向和纵向下了多少个棋子;[i][j]处-0没有棋子,1-白棋,2-黑棋

    int setlected_X = -1;                 //声明变量.记录红色选择框坐标,该坐标其实就是二维数组board的索引
    int setlected_Y = -1;

    int board_type = 2;                    //声明变量,记录当前下棋的提示颜色

/*

     BOARD_SIZE    纵横各共可以下棋的数量
     RATE          每个棋子平均棋盘的宽度
     X_OFFSET      记录棋子的X偏移量
     Y_OFFSET      记录棋子的Y偏移量
     board         记录了X和Y下了多少个棋子
     setlected_Y   记录红色选择框Y坐标
     selected_X    记录红色选择框X坐标
     Board_type    记录当前下棋的颜色
     table;        棋盘位图
     black;        黑棋位图
     white;        白棋位图
     chalendar     棋盘绘图
    table_Wide     棋盘宽
    table_High     棋盘宽
*/

    private class ChessBoard extends JPanel {

        @Override
        public void paint(Graphics g) {
            g.drawImage(table, 0, 0, null);   //绘制棋盘

/*
     BOARD_SIZE    纵横各共可以下棋的数量
     RATE          每个棋子平均棋盘的宽度
     X_OFFSET      记录棋子的X偏移量
     Y_OFFSET      记录棋子的Y偏移量
     board         记录了X和Y下了多少个棋子
     setlected_Y   记录红色选择框Y坐标 初始值-1
     selected_X    记录红色选择框X坐标 初始值-1
     Board_type    记录当前下棋的颜色
     table;        棋盘位图
    selected       选择框位图
     black;        黑棋位图
     white;        白棋位图
    chalendar      棋盘绘图
    table_Wide     棋盘宽
    table_High     棋盘宽
*/
            if (setlected_X>0 && setlected_Y>0){               //绘制选择框
                g.drawImage(setlected,setlected_X*RATE+X_OFFSET,setlected_Y*RATE+Y_OFFSET,null);
            }
 // 绘制棋子
            for (int i = 0; i < BOARD_SIZE; i++) {
                for (int j = 0; j < BOARD_SIZ; j++) {

                    if (board[i][j] == 2) {        //黑棋
                        g.drawImage(black, i *RATE + X_OFFSET, j * RATE + Y_OFFSET, null);
                    }
                    if (board[i][j] == 1) {           //白棋
                        g.drawImage(white, i * RATE + X_OFFSET, j * RATE + Y_OFFSET, null);
                    }
                }
            }
        }
    }

    ChessBoard chalendar = new ChessBoard();

    Panel p = new Panel();
    Button whiteBtn = new Button("黑棋");
    Button blackBtn = new Button("白棋");
    Button deleteBtn = new Button("删除");

    private void refreshBtnColor(Color whiteBtnColor, Color blackBtnColor, Color deleteBtnColor) {
        whiteBtn.setBackground(whiteBtnColor);
        blackBtn.setBackground(blackBtnColor);
        deleteBtn.setBackground(deleteBtnColor);
    }

    private void init() throws IOException {
        whiteBtn.addActionListener(e -> {
//   修改颜色标记
            board_type = 1;

//   修改按钮的颜色
            whiteBtn.setBackground(Color.GREEN);
            blackBtn.setBackground(Color.LIGHT_GRAY);
            deleteBtn.setBackground(Color.LIGHT_GRAY);
        });


        blackBtn.addActionListener(e -> {
//   修改颜色标记
            board_type = 2;

//   修改按钮的颜色
            whiteBtn.setBackground(Color.LIGHT_GRAY);
            blackBtn.setBackground(Color.GREEN);
            deleteBtn.setBackground(Color.LIGHT_GRAY);
        });


        deleteBtn.addActionListener(e -> {
//   修改颜色标记
            board_type = 0;

//   修改按钮的颜色
            whiteBtn.setBackground(Color.LIGHT_GRAY);
            blackBtn.setBackground(Color.LIGHT_GRAY);
            deleteBtn.setBackground(Color.GREEN);
        });
//   组装棋盘
//   处理鼠标移动
     chalendar.addMouseMotionListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent e) {               //当鼠标移动时会调用该方法
             setlected_X =(e.getX()-X_OFFSET)/RATE;           //获取移动鼠标的X坐标
             setlected_Y=(e.getY()-X_OFFSET)/RATE;            //获取鼠标移动的Y坐标
             chalendar.repaint();                                //鼠标移动时重绘选择框
         }
     });
//   处理鼠标点击
     chalendar.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {  //当鼠标点击后会调用该方法
             int xPos = (e.getX() - X_OFFSET) / RATE; // (鼠标移动坐标-鼠标偏移量)➗每个棋子平均宽度
             int yPos = (e.getY() - Y_OFFSET) / RATE; //源:  (每个棋子 x 棋子平均宽度) + 偏移量 == 最终坐标
                                                      //当前: (最终坐标 - 偏移量) ➗  棋子平均宽度 == 每个棋子
             board[xPos][yPos]=board_type;
             chalendar.repaint();                  //鼠标点击时重绘棋子
         }
     });
/*   BOARD_SIZE    纵横各共可以下棋的数量
     RATE          每个棋子平均棋盘的宽度
     X_OFFSET      记录棋子的X偏移量
     Y_OFFSET      记录棋子的Y偏移量
     board         记录了X和Y下了多少个棋子
     setlected_Y   记录红色选择框Y坐标
     selected_X    记录红色选择框X坐标
     Board_type    记录当前下棋的颜色
     table;        棋盘位图
    selected       选择框位图
     black;        黑棋位图
     white;        白棋位图

    chalendar      棋盘绘图
    table_Wide     棋盘宽
    table_High     棋盘宽

*/

        chalendar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                setlected_X=-1;
                setlected_Y=-1;
            }
        });
        black= ImageIO.read(new File("C:\\Users\\2\\Desktop\\aa.png"));
        white=ImageIO.read(new File("C:\\Users\\2\\Desktop\\bb.png"));
        table=ImageIO.read(new File("C:\\Users\\2\\Desktop\\3.jpg"));
        setlected=ImageIO.read(new File("C:\\Users\\2\\Desktop\\4.jpg"));

        chalendar.setPreferredSize(new Dimension(table_High, table_Wide));
        frame.add(chalendar);
        p.add(whiteBtn);
        p.add(blackBtn);
        p.add(deleteBtn);
        frame.add(p, BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.pack();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) throws IOException {
        new 五子棋().init();
    }
}



