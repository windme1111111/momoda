package cn.sdu.mall.service;

import cn.sdu.mall.pojo.Category;

import java.util.List;
/**
 * 商品分类业务层接口
 * @author
 */
public interface CategoryService {
    /**
     * 查询所有商品分类
     * @return 商品分类列表
     */
    List<Category> selectAll();

    List<Category> SelectAll();
}
