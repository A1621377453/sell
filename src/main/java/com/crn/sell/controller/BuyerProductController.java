package com.crn.sell.controller;

import com.crn.sell.Vo.ProductVO;
import com.crn.sell.Vo.ResultVO;
import com.crn.sell.service.ProductCategoryService;
import com.crn.sell.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 买家商品控制层
 *
 * @author crn
 * @datetime 2018-09-28 10:47:01
 */
@RestController
@RequestMapping(value = "/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductCategoryService categoryService;

    @Autowired
    private ProductInfoService productInfoService;

    @GetMapping(value = "/list")
    public ResultVO findProductList() {
        Pageable pageable = new PageRequest(0,2);
//        Page<ProductVO> productVOS = productInfoService.findProductList(pageable);
        return null;
    }
}
