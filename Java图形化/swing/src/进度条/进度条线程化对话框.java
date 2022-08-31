package 进度条;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 进度条线程化对话框 {
private void  init() {

    ProgressMonitor pm=new ProgressMonitor(null, "等待任务完成","以完成:" , 0,100 );

    SimulaeterAc simulaeterAc = new SimulaeterAc(100);
    new Thread(simulaeterAc).start();

   Timer timer=new Timer(100, new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           int current = simulaeterAc.getCurrent();
           pm.setProgress(current);  // 显示正在监控的操作进度条并赋值;不在监控操作的进度条则不显示
       }
   });
            if (pm.getMaximum()==simulaeterAc.getAmount()){
                timer.stop();
            }
            if (pm.isCanceled()){  //判断点击了取消或者关闭
                timer.stop();    //关闭定时器
                pm.close();
                System.exit(0);
            }
     timer.start();


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
        new 进度条线程化对话框().init();
    }
}
