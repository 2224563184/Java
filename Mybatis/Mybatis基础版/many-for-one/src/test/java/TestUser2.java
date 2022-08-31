import Levelcache1.popj.MybatisUtility;
import kuang2.tets;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestUser2 {
    @Test
    public  void test(){
        SqlSession factory = MybatisUtility.getFactory();
        tets mapper = factory.getMapper(tets.class);
        mapper.getList();
    }
}
