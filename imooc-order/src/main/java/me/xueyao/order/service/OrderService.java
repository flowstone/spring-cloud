package me.xueyao.order.service;

import me.xueyao.order.dto.OrderDTO;
import me.xueyao.order.pojo.OrderDetail;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/9.
 */
public interface OrderService {
    OrderDTO create(OrderDTO orderDTO);
}
