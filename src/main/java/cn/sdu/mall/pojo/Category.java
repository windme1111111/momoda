package cn.sdu.mall.pojo;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 商品分类实体类
 * 作用：封装商品分类信息 对应数据库表category
 * @author
 * @TableName("category") 表示该类对应数据库表category
 */
@TableName("category")
public class Category {
    /**
     * 对应数据库字段id
     */
    private Integer id;
    /**
     * 对应数据库字段name
     */
    private String name;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}