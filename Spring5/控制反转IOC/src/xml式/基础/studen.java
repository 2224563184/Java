package xml式.基础;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;
@SuppressWarnings("all")

public class studen {
    private String name;
    private int    age;
   private  int[]arr;
   private user user;
   private ArrayList arrayList;
   private HashMap hashMap;
   private Properties properties;
   private Set set;

    public studen() {
    }

    public studen(String name, int age, int[] arr, ArrayList arrayList, HashMap hashMap, Properties properties, Set set) {
        this.name = name;
        this.age = age;
        this.arr = arr;

        this.arrayList = arrayList;
        this.hashMap = hashMap;
        this.properties = properties;
        this.set = set;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }


    public ArrayList getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public HashMap getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap hashMap) {
        this.hashMap = hashMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public xml式.基础.user getUser() {
        return user;
    }

    public void setUser(xml式.基础.user user) {
        this.user = user;
    }
}
