package me.xueyao.order.form;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/9.
 */
@Data
public class OrderForm {
    //买家姓名
    @NotEmpty(message = "姓名必填")
    @Max(20)
    private String name;
    //买家手机号
    @NotEmpty(message = "手机号必填")
    @Pattern(regexp = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$", message = "手机号格式不正确")
    private String phone;
    //买家地址
    @NotEmpty(message = "地址必填")
    private String address;
    //买家微信openid
    @NotEmpty(message = "openid必填")
    private String openid;
    //购物车
    @NotEmpty(message = "购物车不能为空")
    private String items;


}
