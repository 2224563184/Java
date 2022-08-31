package LevelCache1;

import lombok.Data;

import java.util.Date;

@Data
public class Blog {

    public Blog(String id, String title, String author, Date createTime, int views) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.createTime = createTime;
        this.views = views;
    }

    private   String          id;
 private    String      title;
 private    String       author;
 private     Date       createTime;
 private     int          views;

}
