package com.wqm.myjz.service;


import com.wqm.myjz.bean.Product;
import com.wqm.myjz.bean.extend.ProductExtend;
import com.wqm.myjz.dao.ProductMapper;

import java.util.List;


public interface ProductService {


     List<Product> findAll();




     void deleteById(Long id);

     void saveOrUpdate(Product product);


     List<ProductExtend> findAllWithCategort();


     Product findById(Long id);







}
