package com.crn.sell.repository;

import com.crn.sell.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author crn
 * @datetime 2018-09-26 10:54:06
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
}
