package com.wqm.myjz.service;

import com.wqm.myjz.bean.Category;
import com.wqm.myjz.bean.CategoryExample;

import java.util.List;

/**
 * @autor 王启蒙
 * @create 2021/6/7 17:11
 */
public interface CatrgoryService {

    List<Category> findAll();

    void saveOrUpdate(Category category);

    void deleteById(long id);

    List<CategoryExample> findAllWithChild();

    Category findById(long id);


}
