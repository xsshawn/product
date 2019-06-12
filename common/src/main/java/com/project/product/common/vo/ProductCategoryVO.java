package com.project.product.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 返回给前台的目录实体类
 */
@Data
public class ProductCategoryVO {
    @JsonProperty("id")
    private String categoryId;

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private String categoryType;
}
