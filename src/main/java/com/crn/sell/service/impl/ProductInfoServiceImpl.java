package com.crn.sell.service.impl;

import com.crn.sell.Vo.ProductVO;
import com.crn.sell.domain.ProductInfo;
import com.crn.sell.repository.ProductInfoRepository;
import com.crn.sell.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author crn
 * @datetime 2018-09-28 10:19:33
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRepository productInfoRepository;


    @Override
    public ProductInfo findOne(String productId) {
        return null;
    }

    @Override
    public List<ProductInfo> findByProductStatus(int status) {
        return productInfoRepository.findByProductStatus(status);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return productInfoRepository.save(productInfo);
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return productInfoRepository.findAll(pageable);
    }

    /**
     * 分页展示买家商品列表（根据商品类目展示）
     *
     * @return
     */
    @Override
    public List<ProductInfo> findProductList() {
        return productInfoRepository.findProductList();
    }
}
