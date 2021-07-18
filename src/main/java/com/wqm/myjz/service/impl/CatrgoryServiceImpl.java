package com.wqm.myjz.service.impl;

import com.wqm.myjz.bean.Category;
import com.wqm.myjz.bean.CategoryExample;
import com.wqm.myjz.service.CatrgoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @autor 王启蒙
 * @create 2021/6/7 17:18
 */
@Service
public class CatrgoryServiceImpl implements CatrgoryService {
    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public void saveOrUpdate(Category category) {

    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public List<CategoryExample> findAllWithChild() {
        return null;
    }

    @Override
    public Category findById(long id) {
        return null;
    }
}
