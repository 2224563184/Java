import LevelCache1.Blog;
import LevelCache1.MybatisUtility;
import LevelCache1.tesb;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Froen {
    @Test
    public  void  tes(){
        SqlSession factory = MybatisUtility.getFactory();
        tesb mapper = factory.getMapper(tesb.class);

       List<String> dis = new ArrayList<>();
         dis.add("锐雯");
         dis.add("剑姬");
         dis.add("猫咪");
        List<Blog> foren = mapper.getForen(dis);
        System.out.println(foren);

    }
}
