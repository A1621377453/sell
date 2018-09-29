package com.crn.sell.service;

import com.crn.sell.domain.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceTest {
    @Autowired
    private ProductCategoryService productCategoryService;

    @Test
    public void findOne() {
        ProductCategory category = productCategoryService.findOne(1);
        Assert.assertNotNull(category);
    }

    @Test
    public void findAll() {
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<ProductCategory> byCategoryTypeIn = productCategoryService.findByCategoryTypeIn(list);
        for (ProductCategory productCategory : byCategoryTypeIn) {
            System.out.println(productCategory);
        }
    }

    @Test
    public void save() {
    }

    @Test
    public void delete() {
    }
}