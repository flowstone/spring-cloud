package me.xueyao.product.service.impl;

import me.xueyao.product.enums.ProductStatusEnum;
import me.xueyao.product.pojo.ProductInfo;
import me.xueyao.product.repository.ProductInfoRepository;
import me.xueyao.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/9.
 */
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
