package cn.sdu.mall.controller;
import cn.sdu.mall.pojo.Category;
import cn.sdu.mall.service.CategoryService;
import cn.sdu.mall.util.ServerResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 * 商品分类控制类
 * @author Administrator
 * @RestController 声明这是一个控制器类 同时该控制器所有的方法全部以JSON格式返回数据
 */
@RestController
@Tag(name = "商品分类接口") // 声明这是一个API接口（一级菜单）
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    /**
     * 查询所有商品分类
     * @return
     * @RequestMapping("/category/selectAll") 声明访问路径
     */
    @RequestMapping("/category/selectAll")
    @Operation(summary = "查询所有商品分类") // 声明接口功能（二级菜单）
    public ServerResult<List<Category>> selectAll() {
        List<Category> list = categoryService.selectAll();
        return ServerResult.ok(list);
    }

}

