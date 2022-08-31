package OOP.多态.案例.子类继承子类;

public abstract class 动物类 {
//变量：
             public String name ;
             public String age;
//构造方法：
            public 动物类(){

            }

    public 动物类(String name, String age) {
        this.name = name;
        this.age = age;
    }
//成员放啊方法
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
    public abstract void eat();
}
