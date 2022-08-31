package 下拉选择框.ListMode不强制存储;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class 下拉选择框的Mode extends 列表框的Mode implements ComboBoxModel<BigDecimal>{
    public 下拉选择框的Mode() {
    }
//引用列表框的变量；懒得写
    public 下拉选择框的Mode(BigDecimal start, BigDecimal end, BigDecimal step) {
        super(start, end, step);
    }
//记录变量,记录当前选中条目的索引
    private int Ble;

    @Override
    public void setSelectedItem(Object anItem) {

              if ( anItem instanceof BigDecimal){ //判断选中的值数据类型是否相同
               BigDecimal ico   =(BigDecimal)anItem;// 选中的值数据类型强转BigDecimal; 再次保证数据类型相同
                  Ble  = ico.subtract(super.start).divide(super.step,2, RoundingMode.DOWN).intValue();
//           选择值 - 选择开头值 ➗ 布长 =结果 保留两位数四舍五入 最后转化为整数,因为索引是整数所以必须转换
              }
    }

    @Override
    public Object getSelectedItem() {
//和上面的数学运算相反就能得到内容了,之前判断过滤了,不需要再次过滤;运算结果是int类型,但是最终结果用String类型显示
//         类型转换
        BigDecimal ee= new BigDecimal(Ble).multiply(super.step).add(super.start).setScale(1,RoundingMode.DOWN);

        return ee;
    }
}
