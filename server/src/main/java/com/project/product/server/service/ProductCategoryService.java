package com.project.product.server.service;

import com.project.product.server.entity.ProductCategory;

public interface ProductCategoryService {
    /**
     * 查询单个目录详情
     *
     * @param categoryId
     * @return
     */
    public ProductCategory queryProductCategoryById(String categoryId);
}
