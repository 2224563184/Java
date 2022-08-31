package 进度条;

import jdk.nashorn.api.tree.ThrowTree;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class 进度条线程化 {
    JFrame jFrame=new JFrame();
//  复选框
    JCheckBox ckBox=new JCheckBox("不确定进程");
    JCheckBox ckBox2=new JCheckBox("不绘制边框");
//   进度条
    JProgressBar jProgressBar=new JProgressBar(JProgressBar.HORIZONTAL,0,100);
      private void init(){
//       监听复选框
         ckBox.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
//           获取是否勾选 复选框
                 boolean selected = ckBox.isSelected();
//           设置进度条
                 jProgressBar.setIndeterminate(selected);
//           设置百分比;设置了进度条默认 关闭百分百
                 jProgressBar.setStringPainted(!selected);
             }
         });
           ckBox2.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   boolean selected = ckBox2.isSelected();
                   jProgressBar.setBorderPainted(!selected);
               }
           });
//        设置进度条默认属性
           jProgressBar.setBorderPainted(true);//默认百分比
           jProgressBar.setStringPainted(true);//默认边框
//        组装
          Box vbox = Box.createVerticalBox();
          vbox.add(ckBox);
          vbox.add(ckBox2);
          jFrame.setLayout(new FlowLayout());
          jFrame.add(vbox);
          jFrame.add(jProgressBar);
          jFrame.setVisible(true);
          jFrame.pack();
          jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      开启子线程,模拟耗时操作
          SimulaeterAc simulaeterAc=new SimulaeterAc(100);
           new Thread(simulaeterAc).start();
//     设置定时刷新任务,刷新线程当前任务量赋值给进度条
         Timer timer=new Timer(200, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
//                 获取线程的当前任务量,然后设置给进度条
                 int current = simulaeterAc.getCurrent();
                 jProgressBar.setValue(current);
             }
         });
//开启定时刷新线程任务
          timer.start();

//结束定时刷新任务
//          监听进度条
           jProgressBar.addChangeListener(new ChangeListener() {
               @Override
               public void stateChanged(ChangeEvent e) {
//                   获取进度条当前任务量
                   int value = jProgressBar.getValue();
//                   进度当前任务量==任务总量,结束定时刷新任务
                   if (value==simulaeterAc.getAmount()){
                       timer.stop();
                   }
               }
           });
      }

      private class SimulaeterAc implements Runnable{
          private int amount;    //记录任务总量
          private volatile int current;   //当前任务完成量

          public SimulaeterAc(int amount ) {
              this.amount = amount;
          }

          public int getAmount() {
              return amount;
          }

          public void setAmount(int amount) {
              this.amount = amount;
          }

          public int getCurrent() {
              return current;
          }

          public void setCurrent(int current) {
              this.current = current;
          }

          @Override
          public void run() {
              while (amount>=current) {
                  try {      //currentThread:当前执行的线程   sleep:暂停
                      Thread.currentThread().sleep(50);

                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  current++;
              }
          }
      }

    public static void main(String[] args) {
        new 进度条线程化().init();
    }
}
