package OOP.多态.多态的优势和劣势;

public class AnimalDemo {
    public static void main(String[] args) {
//        创建义子类的对象，调用方法

//动物操作类：
           AnimalOperator ao=new AnimalOperator();  //相当于 子类 =new 子类
//猫类：
           Cat c=new Cat();//  引用子类

           ao.useAnimal(c);//动物操作类.猫类
//狗类：
           Dog d=new Dog();


           ao.useAnimal(d);//动物操作类.狗类



    }
}
