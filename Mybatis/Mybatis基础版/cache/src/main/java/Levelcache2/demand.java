package Levelcache2;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface demand {
    @Select("select  *  from test")
    List<Blog> getlist();
    @Select("select  *  from test")
    List<Blog> getlist2();
}
