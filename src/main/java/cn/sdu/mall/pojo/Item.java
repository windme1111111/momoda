package cn.sdu.mall.pojo;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@Data
@TableName("item")
public class Item {
    private Integer id;
    @TableField("category_id") // 映射数据库字段名
    private Integer categoryId;
    private String name;
    private Integer price;
    private String image;
    @TableField("item_desc") // 指定数据库字段名
    private String description;
}
