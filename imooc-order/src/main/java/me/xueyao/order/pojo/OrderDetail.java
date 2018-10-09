package me.xueyao.order.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/9.
 */
@Data
@Entity
public class OrderDetail {
    @Id
    private String detailId;
    //订单id
    private String orderId;
    //商品id
    private String productId;
    //商品名称
    private String productName;
    //当前价格,单位分
    private BigDecimal productPrice;
    //数量
    private Integer productQuantity;
    //小图
    private String productIcon;
    private Date createTime;
    private Date updateTime;

}
