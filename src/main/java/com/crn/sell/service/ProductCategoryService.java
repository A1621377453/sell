package com.crn.sell.service;

import com.crn.sell.domain.ProductCategory;

import java.util.List;

/**
 * 商品类目业务接口
 *
 * @author crn
 * @datetime 2018-09-27 16:53:16
 */
public interface ProductCategoryService {

    ProductCategory findOne(int categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> list);

    ProductCategory save(ProductCategory productCategory);

    void delete(ProductCategory productCategory);
}
