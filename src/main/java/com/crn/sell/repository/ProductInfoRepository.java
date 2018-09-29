package com.crn.sell.repository;

import com.crn.sell.domain.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 商品dao层
 *
 * @author crn
 * @datetime 2018-09-28 10:14:17
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, Integer> {

    List<ProductInfo> findByProductStatus(int status);

    ProductInfo save(ProductInfo productInfo);

    @Query(nativeQuery = true, value = "SELECT c.category_name,i.* FROM product_info i LEFT JOIN product_category c ON i.category_type=c.category_type")
    List<ProductInfo> findProductList();
}
