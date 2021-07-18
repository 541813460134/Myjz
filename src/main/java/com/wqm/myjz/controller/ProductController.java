package com.wqm.myjz.controller;

import com.wqm.myjz.bean.Product;
import com.wqm.myjz.bean.extend.ProductExtend;
import com.wqm.myjz.service.ProductService;
import com.wqm.myjz.utils.Message;
import com.wqm.myjz.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @autor 王启蒙
 * @create 2021/6/8 17:25
 */

@RestController
@RequestMapping("/product")
@Api(description = "产品管理接口")
public class ProductController {


    @Autowired
    private ProductService productService;


    @ApiOperation("查找所有及属性")
    @GetMapping("/findAllWithCategory")
    public Message findAllWithCategory()
    {
        List<ProductExtend> list = productService.findAllWithCategort();

        return MessageUtil.success(list);
    }




    @ApiOperation("查找所有商品")
    @GetMapping("/findAll")
    public Message findAll()
    {
        List<Product> list = productService.findAll();
        return MessageUtil.success(list);

    }


    @ApiOperation("按商品ID删除商品")
    @GetMapping("/deteleById")
    public Message deleteById(long id)
    {
        productService.deleteById(id);
        return MessageUtil.success("删除成功");

    }

    @ApiOperation("保存或增加商品")
    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(Product product)
    {
        productService.saveOrUpdate(product);
        return MessageUtil.success("保存成功");

    }

    @ApiOperation("根据商品ID查找商品")
    @GetMapping("/findById")
    public Message findById(Long id)
    {
        Product product = productService.findById(id);
        return MessageUtil.success("success",product);
    }








}
