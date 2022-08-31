package 数据库连接池.Dao.Dao;

import org.junit.Test;
import 数据库连接池.查询优化.uis;


import java.util.ArrayList;
import java.util.List;

public class ActorDao extends BasicDao<uis>{
//    @Test
    public void ad() {
        String sql = "create TABLE goods(ID INT(?) NOT NULL,goods_NAME varchar(?) not null,price double not null )";
        try {
            updata(sql, 11, 10);
        } catch (Exception e) {

        }
    }
//    @Test
    public void add(){
        String sql2="INSERT INTO goods(ID,goods_name,price) values(?,?,?)";
      try {
          updata(sql2, 40, "vovo手机",0);
          updata(sql2, 50, "三星手机", 2300);
          updata(sql2, 60, "海尔手机", 1800);
          updata(sql2, 70, "IBM手机", 5000);
          updata(sql2, 80, "格林手机",0);
          updata(sql2, 80, "格林手机",0);

      }catch (Exception e){

      }
    }
//    改
//    @Test
    public void  update() {
        String sql = "update  goods set goods_name=? where ID>?";

        try {
            updata(sql, "腾讯手机", 0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }
//    查
//    @Test
public void  SELE() {
    String sql = "select  *  from goods where goods_NAME = ?;";
        try {
            List<uis> tem = getBeanlist(sql,uis.class,"腾讯手机");
        }catch (Exception e){
            e.printStackTrace();
    }
}
//@Test
    public  void dodate(){
        String sql="delete from goods where goods_name=?";
        updata(sql,"腾讯手机");
}

}
