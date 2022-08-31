package 控制结构;

public class while循环 {
    public static void main(String[] args) {
//死循环
        while (true){    // 条件为true,则死循环
            System.out.println("无限循环");
            break;       // break;
        }

        int i=10;
//判断循环
        while (i<20){    // 判断条件为boolean类型,当结果为 False则结束循环
              i++;
            System.out.println("无限循环");
        }

    }
}
