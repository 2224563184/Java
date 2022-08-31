package LevelCache1;

import java.util.List;
import java.util.Map;
@SuppressWarnings("all")
public interface tesb {
  int addBlog(Blog blog);
  List<Blog> queryBlog(Map map);
  List<Blog> getlist(String id);
//  title
  List<Blog> getSwchit(Blog blog);
  List<Blog> getHost(Blog blog);
  List<Blog> getuser();
  List<Blog>  gettimi(Blog blog);
  List<Blog>  getWhere();
  List<Blog>  getForen(List dis);
}
