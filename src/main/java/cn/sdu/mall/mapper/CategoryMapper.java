package cn.sdu.mall.mapper;
import cn.sdu.mall.pojo.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
/**
 * 商品分类的持久层接口
 * @author Administrator
 * @Mapper 声明这是一个持久层
 * BaseMapper<Category> -- MyBatis plus提供的一个接口，负责操作数据库
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}