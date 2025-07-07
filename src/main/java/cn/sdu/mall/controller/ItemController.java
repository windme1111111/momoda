package cn.sdu.mall.controller;
import cn.sdu.mall.pojo.Item;
import cn.sdu.mall.service.ItemService;
import cn.sdu.mall.util.ServerResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;
    /**
     * @param categoryId 接收页面传来的参数
     * @return
     */
    @RequestMapping("/item/selectByCategoryId")
    public ServerResult<Void> selectByCategoryId(Integer categoryId) {
        List<Item> items = itemService.selectByCategoryId(categoryId);
        return ServerResult.ok();
    }
    //@RequestMapping("/item/insert")默认get请求
    //@RequestMapping(value = "/item/insert",method = RequestMethod.POST)
    @PostMapping(value = "/item/insert",consumes = "multipart/form-data")//post请求
    public ServerResult<Void> insert(Item item, MultipartFile file) {
        File f = new File("D:/upload",file.getOriginalFilename());
        try {
            file.transferTo(f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        item.setImage(f.getName());

        try {
            itemService.insert(item);
        } catch (Exception e) {
        return ServerResult.error(500,e.getMessage());
        }
        return ServerResult.ok();
    }
    @PostMapping(value = "/item/update", consumes = "multipart/form-data")
    public ServerResult<Void> update(Item item, MultipartFile file) {
        if (file != null) {
// 创建文件
            File f = new File("D:/upload", file.getOriginalFilename());
            try {
                file.transferTo(f); // 保存图片
                item.setImage(f.getName());
            } catch (Exception e) {
            }
        }
        try {
            itemService.update(item);
        } catch (RuntimeException e) {
            return ServerResult.error(500, e.getMessage());
        }
        return ServerResult.ok();
    }
    @GetMapping("/item/selectById")
    public ServerResult<Item> selectById(Integer id) {
        Item item = itemService.selectById(id);
        return ServerResult.ok(item);
    }



}
