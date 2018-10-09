package me.xueyao.product.service;

import me.xueyao.product.pojo.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/9.
 */
@Service
public interface CategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
