package com.crn.sell.domain;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 商品类目实体类
 *
 * @author crn
 * @datetime 2018-09-26 10:47:52
 */
@Table(name = "product_category")
@Entity
@DynamicUpdate//修改数据时间更新
@Data//lombok的使用，添加字段的set/get方法
public class ProductCategory {
    /** 类目id. */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

}
