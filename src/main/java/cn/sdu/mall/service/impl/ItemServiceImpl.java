package cn.sdu.mall.service.impl;
import cn.sdu.mall.mapper.ItemMapper;
import cn.sdu.mall.pojo.Item;
import cn.sdu.mall.service.ItemService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//修改itemList.html
import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;
    @Override
    public List<Item> selectByCategoryId(Integer categoryId) {
// 创建查询条件
        QueryWrapper queryWrapper = new QueryWrapper();
// 设置查询条件 eq()表示等于 发送的SQL语句：select * from item where category_id = ?
        queryWrapper.eq("category_id",categoryId);
        List<Item> items = itemMapper.selectList(queryWrapper);
        return items;
    }

    @Override
    public void insert(Item item) {
       int result = itemMapper.insert(item);
       if (result < 1){
           //抛出异常
           throw new RuntimeException("添加商品失败");
       }

    }
    @Override
    public void update(Item item) {
        Item oldItem = itemMapper.selectById(item.getId());
        if (oldItem != null) {
// 判断是否上传了新的图片
            if (item.getImage() == null || item.getImage().equals("")) {
                item.setImage(oldItem.getImage());
            }
            int result = itemMapper.updateById(item);
            if (result < 1) {
// 抛出异常
                throw new RuntimeException("更新商品失败");
            }
        } else {
// 抛出异常
            throw new RuntimeException("更新商品失败");
        }
    }
    @Override
    public Item selectById(Integer id) {
        Item item = itemMapper.selectById(id);
        if (item != null) {
            return item;
        }
        throw new RuntimeException("查询商品失败");
    }

}
