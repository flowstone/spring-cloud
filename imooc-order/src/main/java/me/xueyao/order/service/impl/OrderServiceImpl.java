package me.xueyao.order.service.impl;

import com.netflix.discovery.converters.Auto;
import me.xueyao.order.dto.OrderDTO;
import me.xueyao.order.enums.OrderStatusEnum;
import me.xueyao.order.enums.PayStatusEnum;
import me.xueyao.order.pojo.OrderMaster;
import me.xueyao.order.repository.OrderDetailRepository;
import me.xueyao.order.repository.OrderMasterRepository;
import me.xueyao.order.service.OrderService;
import me.xueyao.order.utils.KeyUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/9.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        //TODO 查询商品信息(调用商品服务）
        //TODO 计算总价
        //TODO 扣库存(调用商品服务）

        //订单入库
        OrderMaster orderMaster = new OrderMaster();
        orderDTO.setOrderId(KeyUtils.genUniqueKey());
        BeanUtils.copyProperties(orderDTO, orderMaster);

        orderMaster.setOrderAmount(new BigDecimal(5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.NEW.getCode());

        OrderMaster save = orderMasterRepository.save(orderMaster);
        return orderDTO;
    }
}
