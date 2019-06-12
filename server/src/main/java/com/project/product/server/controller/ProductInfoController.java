package com.project.product.server.controller;

import com.project.product.common.vo.ProductInfoVO;
import com.project.core.utils.ResultVOUtil;
import com.project.core.vo.ResultVO;
import com.project.product.server.service.ProductInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductInfoController {
    @Autowired
    private ProductInfoService productInfoService;

    @GetMapping(value = "/{productId}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResultVO queryProductInfoById(@PathVariable("productId") String productId) {
        ProductInfoVO productInfoVO = new ProductInfoVO();
        BeanUtils.copyProperties(productInfoService.queryProductInfoById(productId), productInfoVO);
        return ResultVOUtil.success(productInfoVO);
    }
}
