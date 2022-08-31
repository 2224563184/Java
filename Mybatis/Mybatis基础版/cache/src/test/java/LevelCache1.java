import Levelcache2.Blog;
import Levelcache2.demand;
import org.apache.ibatis.session.SqlSession;
import pojo.MybatisTools;

import java.util.List;

public class LevelCache1 {
    public static void main(String[] args) {
        SqlSession getconne = MybatisTools.getconne();
        demand mapper = getconne.getMapper(demand.class);
        List getlist = mapper.getlist();
        getconne.close();

//        关闭资源后, 会清除缓存
        SqlSession session = MybatisTools.getconne();
        demand demand = session.getMapper(demand.class);
        List<Blog> list = demand.getlist();
        System.out.println("关闭资源="+(getlist==list));

//        2个不同的函数使用一样SQL语句也会清楚缓存
        List<Blog> blogs = demand.getlist();
        List<Blog> blogs1 = demand.getlist2();
        System.out.println("不同函数="+(blogs==blogs1));


//

    }
}
