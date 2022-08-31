import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import resultMap.JDBC;
import resultMap.resultMapUser;

import java.util.List;
import java.util.Map;

public class MapTest {
    @Test
    public  void  getTest()throws Exception{
        String url="SqlMapper2.xml";
        SqlSession session = JDBC.getConntion(url);
        resultMapUser mapper = session.getMapper(resultMap.resultMapUser.class);
        List<Map<String, Object>> map = mapper.getMap();
        System.out.println(map);
    }
}
