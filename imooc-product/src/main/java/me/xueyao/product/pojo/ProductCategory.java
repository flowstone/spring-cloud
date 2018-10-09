package me.xueyao.product.pojo;

import lombok.Data;
import lombok.Generated;

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
public class ProductCategory {
    @Id
    @Generated
    private Integer categoryId;
    //类目名称
    private String categoryName;
    //类目编号
    private Integer categoryType;

    private Date createTime;
    private Date updateTime;
}
