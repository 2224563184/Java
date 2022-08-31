package 下拉选择框.ListMode不强制存储;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

//使用BigDecimal:小数更精确
public class 列表框的Mode extends AbstractListModel<BigDecimal> {
//使用此类可以减少重复的工作


BigDecimal start;   //开始
BigDecimal end;     //结束
BigDecimal step;    //布长

public 列表框的Mode() {
}

public 列表框的Mode(BigDecimal start, BigDecimal end, BigDecimal step) {
this.start = start;
this.end = end;
this.step = step;
}

                                           @Override
public int getSize() {
int floor=(int) Math.floor(end.subtract(start).divide(step,2, RoundingMode.HALF_DOWN).doubleValue());
// (结束-开始)➗布长=结果,结果保留两位小数四舍五入并保留精准度,对浮点数向下取整    x.x


//Math.floor:             对浮点数向下取整。对小数点后面的数字不为零
//subtract:               相减
//divide:                 除以
//scale:                 保留小数
//RoundingMode.HALF_DOWN:四舍五入
//doubleValue:           保留精准度
return floor+1;     //获取所有列表框条目个数; +1补上初始值
   }

@Override
public BigDecimal getElementAt(int index) {

BigDecimal ele = new BigDecimal(index).multiply(step).add(start).setScale(2, RoundingMode.HALF_DOWN);
//              将选中的值String数据类型转换为BigDecimal数据类型 乘以 step 相加 start 保留 四舍五入

//multiply:              乘以
//add:                   相加
//setScale:              保留
//RoundingMode.HALF_DOWN:四舍五入
//总结: 数学算法,跟之前的运算方式完全相反


       return ele;  //获取指定列表框选项
   }
}
//此类重写内容过多,应该使用该类的子类
/*public class 基础1 implements ListModel<BigDecimal>{

   @Override
   public int getSize() {
       return 0;
   }

   @Override
   public BigDecimal getElementAt(int index) {
       return null;
   }

   @Override
   public void addListDataListener(ListDataListener l) {

   }

   @Override
   public void removeListDataListener(ListDataListener l) {

   }*/

