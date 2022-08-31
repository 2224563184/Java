import Levelcache1.demo;
import Levelcache2.Blog;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.MybatisTools2;

import java.util.List;

public class LevelCache2 {
    @Test
    public  void  test(){
        SqlSession getconne = MybatisTools2.getconne();
        demo mapper = getconne.getMapper(Levelcache1.demo.class);
        List<Blog> list = mapper.getList();
        getconne.close();
        SqlSession conne = MybatisTools2.getconne();
        demo demo = conne.getMapper(demo.class);
        List<Blog> getlist = demo.getList();
        System.out.println(list==getlist);
    }
}
