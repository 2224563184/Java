import LevelCache1.Blog;
import LevelCache1.MybatisUtility;
import LevelCache1.tesb;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class TestUser   {
    public String getUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    @Test
    public  void  getTestr()throws Exception{
        SqlSession factory = MybatisUtility.getFactory();
        tesb mapper = factory.getMapper(tesb.class);
        Blog blog = new Blog("nu", "锐雯", null, new Date(), 2);
//        List<Blog> host = mapper.getHost(blog);
//        System.out.println(host);
        List<Blog> gettimi = mapper.gettimi(blog);
        System.out.println(gettimi);
//        int i = mapper.addBlog(blog);
//        List<Blog> getlist = mapper.getlist("1");
//        System.out.println(getlist);
//        Blog blog = new Blog(null,"锐雯","喜欢",new Date(), 2);
//        List<Blog> swchit = mapper.getSwchit(blog);
//        System.out.println(swchit);
//        factory.close();
//        List<Blog> getuser = mapper.getuser();
//        System.out.println(getuser);
    }
}
