package 反射.基础1;
/*
 获取Class类的对象：
           1.使用该类的Class属性来获取该类对应的Class对象                               类名.Class
             示范：Student.Class(文件)将会返回Student类对应的Class对象

           2.调用对象的getClass()方法，返回该类对象所属类对应的Class对象                  对象名.Class
             示范：该方法是Object类中的方法，所有java对象都可以调用该方法来返回类所对应的Class对象

           3.使用Class类中的静态方法forName(String className),该方法                   forName.(上面的结果)
           需要传入字符串参数，该字符串参数的值是 某个类的全路径，也就是完整包名的路径
 */
public class 获取对象 {
    public static void main(String[] args) throws ClassNotFoundException {
//一、
//    1.使用该类的Class属性来获取该类对应的Class对象
        Class<Student> c1 = Student.class;
        System.out.println(c1);
        Class<Student> c2 = Student.class;
        System.out.println(c1==c2);
//      在一个类中在内存中它只有一个 字节码文本(Class)对象,所以它的值是相等

//二、
//    1.调用对象的getClass()方法，返回该类对象所属类对应的Class对象
         Student s=new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c3==c1);

//三、
//    1.使用Class类中的静态方法forName(String className),该方法
        Class<?> c4 = Class.forName("反射.基础1.Student");
        System.out.println(c1==c4);

    }
}
