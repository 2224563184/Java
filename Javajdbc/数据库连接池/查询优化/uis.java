package 数据库连接池.查询优化;

public class uis {
    private int id;
    private String goods_name;
    private double price;

    public uis() {
    }

    public uis(int id, String goods_name, double price) {
        this.id = id;
        this.goods_name = goods_name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

