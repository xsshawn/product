package com.project.product.server.service;

import com.project.product.server.entity.ProductInfo;

import java.util.List;
import java.util.Map;

public interface ProductInfoService {
    /**
     * 查询单个商品详情
     *
     * @param productId
     * @return
     */
    ProductInfo queryProductInfoById(String productId);

    /**
     * 查询商品详情列表
     *
     * @param params
     * @return
     */
    List<ProductInfo> queryProductInfoList(Map<String, Object> params);
}
