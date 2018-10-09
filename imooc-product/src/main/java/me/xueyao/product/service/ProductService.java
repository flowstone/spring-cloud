package me.xueyao.product.service;

import me.xueyao.product.pojo.ProductInfo;

import java.util.List;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/9.
 */
public interface ProductService {

    /*
    * 查询所有在架的商品列表
    * */
    List<ProductInfo> findUpAll();

}
