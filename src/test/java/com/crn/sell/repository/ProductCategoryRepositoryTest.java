package com.crn.sell.repository;

import com.crn.sell.domain.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    @Transactional
    public void test1() {
        ProductCategory category = productCategoryRepository.findOne(1);
        category.setCategoryType(1);
        ProductCategory save = productCategoryRepository.save(category);
        System.out.println(save);
    }
}