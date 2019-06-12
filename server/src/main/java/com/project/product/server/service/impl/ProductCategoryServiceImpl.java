package com.project.product.server.service.impl;

import com.project.product.server.dao.ProductCategoryMapper;
import com.project.product.server.entity.ProductCategory;
import com.project.product.server.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    public ProductCategory queryProductCategoryById(String categoryId) {
        return productCategoryMapper.queryProductCategoryById(categoryId);
    }
}
