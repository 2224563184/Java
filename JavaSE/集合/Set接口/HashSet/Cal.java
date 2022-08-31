package 集合.Set接口.HashSet;

import java.util.Objects;

public class Cal {
    private  String name;
    private  int     age;
    private  String  addres;

    @Override
    public int hashCode() {
//         计算相同属性的哈希值;
        return Objects.hash(name,addres);
    }

    @Override
    public boolean equals(Object obj) {
        Cal cal=(Cal)obj;

        if (this.getClass()==cal.getClass()){
            if(this.name==cal.getName()&&addres==cal.getAddres())
                return true;
            return false;
        }

       return false;
    }

    public Cal(String name, int age, String addres) {
        this.name = name;
        this.age = age;
        this.addres = addres;
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

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", addres='" + addres + '\'' +
                '}';
    }
}
