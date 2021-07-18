package com.wqm.myjz.dao.extend;

import com.wqm.myjz.bean.extend.ProductExtend;

import java.util.List;

/**
 * @autor 王启蒙
 * @create 2021/6/7 17:22
 */
public interface ProductExtendMapper {
    List<ProductExtend> selectAllWithCateGory();


}
