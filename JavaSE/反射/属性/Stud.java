package 反射.属性;

public class Stud {
     public String name;       //私有
             int    age;        //默认
     public  String address;    //公共

    public Stud() {
    }

    private Stud(String name){  //私有构造方法
        this.name=name;
    }       //  一个私有构造、一个非公有构造、一个公有构造

     Stud(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Stud(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
                                                      //一个私有无参方法、三个公有无参方法
    private  void function(){
         System.out.println("function");
     }
    public  void  method1(){
        System.out.println("function");
    }
   public  void   method2(String s){
       System.out.println(s);
   }
   public String method3(String s,int i){
    return s+","+i;
   }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

