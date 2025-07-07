package cn.sdu.mall.service.impl;
import cn.sdu.mall.mapper.CategoryMapper;
import cn.sdu.mall.pojo.Category;
import cn.sdu.mall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
* 商品分类业务层实现类
* @author
* @Service 声明为业务层组件
*/
@Service
public class CategoryServiceImpl implements CategoryService {
@Autowired // 注入持久层CategoryMapper的对象
private CategoryMapper categoryMapper;
@Override
public List<Category> selectAll() {
List<Category> list = categoryMapper.selectList(null);
return list;
}

    @Override
    public List<Category> SelectAll() {
        return null;
    }
}
