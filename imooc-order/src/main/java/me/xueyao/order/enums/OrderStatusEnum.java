package me.xueyao.order.enums;

import lombok.Getter;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/9.
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "取消");

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
