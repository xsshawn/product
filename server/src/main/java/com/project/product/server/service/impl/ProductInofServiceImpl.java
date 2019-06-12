package com.project.product.server.service.impl;

import com.project.product.server.service.ProductInfoService;
import com.project.product.server.dao.ProductInfoMapper;
import com.project.product.server.entity.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductInofServiceImpl implements ProductInfoService {
    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public ProductInfo queryProductInfoById(String productId) {
        return productInfoMapper.queryProductInfoById(productId);
    }

    @Override
    public List<ProductInfo> queryProductInfoList(Map<String, Object> params) {
        return productInfoMapper.queryProductInfoList(params);
    }
}
