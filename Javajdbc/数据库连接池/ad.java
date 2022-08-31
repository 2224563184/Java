package 数据库连接池;

import java.util.ArrayList;
import java.util.Properties;

public class ad {
  public   int id;
    public    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ad ad = new ad();
        ad.id=50;
        ad.name="adc";
        ArrayList<ad> objects = new ArrayList<>();
        objects.add(ad);
        objects.add(ad);
        ad=null;
        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i).getName());
            System.out.println(objects.get(i).getId());
        }
    }
}
