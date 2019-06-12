package com.project.product.server.entity;

import lombok.Data;

/**
 * 对应数据库类目表product_category实体类
 */
@Data
public class ProductCategory {
    // 主键id
    private String categoryId;

    // 类目名字
    private String categoryName;

    // 类目编号
    private String categoryType;

    // 创建时间
    private String createTime;

    // 更新时间
    private String updateTime;

    // 创建人
    private String createUser;

    // 更新人
    private String updateUser;
}
