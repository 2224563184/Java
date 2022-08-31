
public class Demo {
    int val;

    public static void main(String[] args) {

    }

    public void addTwoNumbers( ListNode l1, ListNode l2) {

        Object[] objects = new Object[30];

        int i=0;
        int index=0;
        while (l1!=null||l2!=null){
//         1.按照最长的遍历
//         2.遇到null对象补0,求和
//         3.和10进1
//         4.倒序遍历
         int il1=l1==null?0:l1.val;
         int il2=l2==null?0:l2.val;
         int sum = il1 + il2+index;
        index=sum/10;
         objects[i]=sum%10;

         i++;
         if (l1!=null)
         l1=l1.next;
         if (l2!=null)
         l2=l2.next;
     }
          ListNode  first=null, last=null;
        for (int j = 0; j < objects.length; j++) {
            if (objects[j]!=null){
                ListNode node = new ListNode((int)objects[j]);
                if (first==null){
                    first=node;
                    last=node;
                }else {
                    last.next=node;
                    last=node;
                }
            }
        }
        }

class  ListNode {
    int val;

    ListNode next;


    ListNode() {
    }


    ListNode(int val) {
        this.val = val;
    }


    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
}