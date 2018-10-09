package me.xueyao.product.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/9.
 */
@Data
@Entity
public class ProductInfo {
    @Id
    private String productId;
    //商品名称
    private String productName;
    //商品单价
    private Double productPrice;
    //商品库存
    private Integer productStock;
    //商品描述
    private String productDescription;
    //商品小图
    private String productIcon;
    //商品状态 0正常1下架
    private Integer productStatus;
    //类目编号
    private Integer categoryType;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;


}
