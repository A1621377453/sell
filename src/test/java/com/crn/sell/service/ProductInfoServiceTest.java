package com.crn.sell.service;

import com.crn.sell.Vo.ProductVO;
import com.crn.sell.domain.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceTest {

    @Autowired
    private ProductInfoService productInfoService;

    @Test
    public void findByProductStatus() {
        List<ProductInfo> productStatus = productInfoService.findByProductStatus(ProductInfo.ProductStatusEnum.UP.getCode());
        for (ProductInfo status : productStatus) {
            System.out.println(status);
        }
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("677890");
        productInfo.setProductName("南瓜粥");
        productInfo.setProductPrice(new BigDecimal(3.0));
        productInfo.setProductStock(999);
        productInfo.setProductDescription("超级大南瓜");
        productInfo.setProductIcon("http://xxxx.jpg");
        productInfo.setProductStatus(ProductInfo.ProductStatusEnum.UP.getCode());
        productInfo.setCategoryType(1);

        ProductInfo save = productInfoService.save(productInfo);
        Assert.assertNotNull(save);
    }

    @Test
    public void findAllTest() {
//        Pageable pageable = new PageRequest(1,1);
        Page<ProductInfo> all = productInfoService.findAll(null);
        for (ProductInfo productInfo : all) {
            System.out.println(productInfo);
        }
    }

    @Test
    public void findProductListTest() {
//        Pageable pageable = new PageRequest(1, 2);
        List<ProductInfo> all = productInfoService.findProductList();
        for (ProductInfo productVO : all) {
            System.out.println(productVO);
        }
    }
}