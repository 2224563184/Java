package 数据结构和算法.数据结构.线性结构.链表.单链表.练习;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        WaterMargin margin = new WaterMargin();
        margin.add("李逵",10);
        margin.add("松江",10);
        margin.add("种",10);
        margin.add("读",10);
        margin.add("读",10);

//        倒数第一
        op(margin,1);

//        有效节点,记录遍历次数
        int uzi = uzi(margin);
//        System.out.println("有效节点"+"="+uzi);

//        链表反转

        People people = yy(margin);
        People and=people;
        while (and!=null){
//            System.out.println(and);
            and=and.next;
        }

//     合并链表
        System.out.println("合并列表");
        People test = user(margin, people);
        People ui=test;
        while (ui!=null){
            System.out.println(ui);
            ui=ui.next;
        }

    }
    public  static People user(WaterMargin waterMargin, People people){
        People fon = waterMargin.get();
        People l=fon;
        while (l!=null){
            People o=l;
            l=l.next;
            if (l==null){
              o.next=people;
              return fon;
            }
        }
        return null;
    }

    public static People yy(WaterMargin waterMargin){
        People l=waterMargin.get();
        ArrayList<People> list = new ArrayList<>();
        while (l!=null){
         list.add(l);
            l=l.next;
        }
           People forst=null;
        People    last=null;
        for (int i = list.size()-1; i >-1; i--) {
            if (list.get(i)!=null){

                People la=last;
                People newpeop = new People(list.get(i).name, list.get(i).age);
                last=newpeop;
                if (forst==null){
                    forst=newpeop;
                }else {
                    la.next=last;
                }

            }
        }
      return forst;
    }

//     求倒数第一
//    思路:   总数量-遍历次数==1
    public  static  void op(WaterMargin margin,int x){
        People forst = margin.get();
        People l=forst;
        int size=0;
        while (l!=null){
            if (margin.getNum()-size==x){
                System.out.println("倒数第"+x);
                System.out.println(l);
                break;
            }
            size++;
            l=l.next;
        }
    }
    public static int uzi(WaterMargin waterMargin){
//         返回链表头
        People first = waterMargin.get();
//        新引用,遍历的时候不破坏链表
        int i=0;
        People list=first;
        while (list!=null){
            i++;
            list=list.next;
        }
        return i;
    }
}
