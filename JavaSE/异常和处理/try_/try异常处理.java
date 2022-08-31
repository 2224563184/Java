package 异常和处理.try_;

public class try异常处理 {
    public static void main(String[] args) {
        System.out.println("开始");
    j();
        System.out.println("结束");

    }
    public static void j(){
        try {
            int[] x = {4, 2, 8};
            System.out.println(x[5]);
        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(w.getMessage());
//            System.out.println(w.toString());
            e.printStackTrace();
    }finally {
            System.out.println("始终运行");
        }
}

}
