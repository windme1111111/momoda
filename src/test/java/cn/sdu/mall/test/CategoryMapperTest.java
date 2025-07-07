package cn.sdu.mall.test;

import cn.sdu.mall.pojo.Category;
import cn.sdu.mall.mapper.CategoryMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryMapperTest {

    private CategoryMapper categoryMapper;
    @Mapper
    public void testSelectAll()
    {
        QueryWrapper<Category> queryWrapper=null;
        List<Category> List=categoryMapper.selectList(queryWrapper);
        System.out.println();
    }
}
