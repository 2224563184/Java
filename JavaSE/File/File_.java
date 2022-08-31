package File;

import java.io.File;

public class File_ {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\ja-netfilter-all");
            String[] list = file.list();
            for (int i = 0; i <list.length; i++) {
                System.out.println(list[i]);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
