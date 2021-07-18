package com.wqm.myjz.bean.extend;

import com.wqm.myjz.bean.Category;
import com.wqm.myjz.bean.Product;

public class ProductExtend extends Product {

    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
