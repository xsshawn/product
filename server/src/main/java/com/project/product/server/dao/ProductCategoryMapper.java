package com.project.product.server.dao;

import com.project.product.server.entity.ProductCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "productCategoryMapper")
public interface ProductCategoryMapper {
    ProductCategory queryProductCategoryById(@Param(value = "categoryId") String categoryId);
}
