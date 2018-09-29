package com.crn.sell.service;

import com.crn.sell.Vo.ProductVO;
import com.crn.sell.domain.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品业务层接口
 *
 * @author crn
 * @datetime 2018-09-28 10:18:38
 */
public interface ProductInfoService {

    ProductInfo findOne(String productId);

    /**
     * 查询上下架商品
     *
     * @param status
     * @return
     */
    List<ProductInfo> findByProductStatus(int status);

    /**
     * 保存更新商品
     *
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 分页展示买家商品列表（根据商品类目展示）
     * @return
     */
    List<ProductInfo> findProductList();

    //加库存

    //减库存
}
