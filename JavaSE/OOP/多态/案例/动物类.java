package OOP.多态.案例;

public class 动物类 {
    public String name;
    public String age;

public  动物类(){

}

    public 动物类(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public void  use(){
    System.out.println("吃饭");

    }
}