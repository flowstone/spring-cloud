package me.xueyao.order.enums;

import lombok.Getter;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/9.
 */
@Getter
public enum  PayStatusEnum {
    NEW(0, "等待支付"),
    SUCCESS(1, "支付成功");

    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
