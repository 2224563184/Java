package itheima.新的业务;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import itheima.Dao.BookDao;
import itheima.Dao.baseMapper;
import itheima.domain.Book;
import itheima.domain.Lambda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

@Component
public class LambdaTest {
    @Autowired
    baseMapper baseMapper;
    public  void  test(){
        Map<String, Object> map=new HashMap<>();
        map.put("name", "1");

        List<Lambda> books1 = baseMapper.selectByMap(map);
        List<Lambda> books2 = baseMapper.selectByMap(map);
        QueryWrapper<Lambda> quer=new QueryWrapper<>();
        quer.eq("name","333");
        baseMapper.update(new Lambda(null, "1", null),quer);
        baseMapper.update(new Lambda(null, "22222", null),quer);
        baseMapper.update(new Lambda(null, "00000", null),quer);
//        baseMapper.insert(new Lambda(null, "3", null));
//        baseMapper.insert(new Lambda(null, "3", null));

    }
}
