package me.xueyao.order.repository;

import me.xueyao.order.enums.OrderStatusEnum;
import me.xueyao.order.enums.PayStatusEnum;
import me.xueyao.order.pojo.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/9.
 */
@Component
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123456");
        orderMaster.setBuyerName("Simon.Xue");
        orderMaster.setBuyerAddress("上海");
        orderMaster.setBuyerPhone("13111111111");
        orderMaster.setBuyerOpenid("wx000001");
        orderMaster.setOrderAmount(new BigDecimal(11.98));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.NEW.getCode());
        OrderMaster result = orderMasterRepository.save(orderMaster);
        Assert.assertTrue(result != null);
    }
}