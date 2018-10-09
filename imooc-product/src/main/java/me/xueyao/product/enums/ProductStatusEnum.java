package me.xueyao.product.enums;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Description: 商品上下架状态
 * User: Simon.Xue
 * Date: 2018/10/9.
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
