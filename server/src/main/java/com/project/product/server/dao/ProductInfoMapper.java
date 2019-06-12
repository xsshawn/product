package com.project.product.server.dao;

import com.project.product.server.entity.ProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component(value = "productInfoMapper")
public interface ProductInfoMapper {

    ProductInfo queryProductInfoById(@Param(value = "productId") String productId);

    List<ProductInfo> queryProductInfoList(Map<String, Object> params);
}
