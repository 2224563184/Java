package 反射.基础1;

public class Student {
     private String name;       //私有
             int    age;        //默认
     public  String address;    //公共

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

     Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
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

