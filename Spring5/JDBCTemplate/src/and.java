import java.util.ArrayList;
import java.util.HashMap;

public class and {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>(10);
        for (int i = 0; i < 5; i++) {
            objects.add(i);
        }
        for (int i = 0; i < objects.size(); i++) {
            if (objects.get(i)!=null){
                System.out.println(objects.get(i));
            }
        }


    }
}
