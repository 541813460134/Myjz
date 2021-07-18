package com.wqm.myjz.service.impl;



import com.wqm.myjz.bean.Product;
import com.wqm.myjz.bean.ProductExample;
import com.wqm.myjz.bean.extend.ProductExtend;
import com.wqm.myjz.dao.ProductMapper;
import com.wqm.myjz.dao.extend.ProductExtendMapper;
import com.wqm.myjz.service.ProductService;
import com.wqm.myjz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {


    @Resource
    private ProductMapper productMapper;

    @Resource
    private ProductExtendMapper productExtend;






    @Override
    public List<Product> findAll() {

        ProductExample productExample = new ProductExample();
        return productMapper.selectByExample(productExample);
    }



    @Override
    public void deleteById(Long id) {

        Product product = productMapper.selectByPrimaryKey(id);

        if(product==null)
        {
            throw  new CustomerException("删除失败,要数据不存在");
        }else {
            productMapper.deleteByPrimaryKey(id);
        }

    }

    @Override
    public void saveOrUpdate(Product product) {
        if(product.getId()!=null){
            productMapper.updateByPrimaryKey(product);
        }else {
            productMapper.insert(product);
        }

    }

    @Override
    public List<ProductExtend> findAllWithCategort() {
        return productExtend.selectAllWithCateGory();
    }

    @Override
    public Product findById(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }
}
