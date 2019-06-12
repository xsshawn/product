package com.project.product.server.controller;

import com.project.product.common.vo.ProductCategoryVO;
import com.project.core.utils.ResultVOUtil;
import com.project.core.vo.ResultVO;
import com.project.product.server.service.ProductCategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @RequestMapping(value = "/{categoryId}", method = {RequestMethod.GET})
    public ResultVO<ProductCategoryVO> queryProductCategoryById(@PathVariable("categoryId") String categoryId) {
        ProductCategoryVO productCategoryVO = new ProductCategoryVO();
        BeanUtils.copyProperties(productCategoryService.queryProductCategoryById(categoryId), productCategoryVO);
        return ResultVOUtil.success(productCategoryVO);
    }
}
