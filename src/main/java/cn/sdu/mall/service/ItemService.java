package cn.sdu.mall.service;
import cn.sdu.mall.pojo.Item;
import java.util.List;
/**
 * 商品业务层接口
 */
public interface ItemService {
    /**
     * 根据商品分类id查询商品
     * @param categoryId 商品分类id
     * @return 商品列表
     */
    List<Item> selectByCategoryId(Integer categoryId);
    /**
     * @param item 商品信息
     * @return 影响行数
     */
   void insert(Item item);
    /**
     * 更新商品信息
     * @param item 商品信息
     */
    void update(Item item);
    /**
     * 根据id查询商品
     * @param id 商品id
     * @return 商品信息
     */
    Item selectById(Integer id);

}
