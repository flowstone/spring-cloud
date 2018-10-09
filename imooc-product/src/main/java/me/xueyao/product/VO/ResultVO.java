package me.xueyao.product.VO;

import lombok.Data;

/**
 * Description: http请求返回的对象
 * User: Simon.Xue
 * Date: 2018/10/9.
 */
@Data
public class ResultVO<T> {
    //错误码
    private Integer code;
    //提示信息
    private String msg;
    //具体内容
    private T data;
}
