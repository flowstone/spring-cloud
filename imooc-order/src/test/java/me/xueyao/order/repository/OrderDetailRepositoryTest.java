package me.xueyao.order.repository;

import me.xueyao.order.pojo.OrderDetail;
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
public class OrderDetailRepositoryTest {
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void testSave() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId("123456");
        orderDetail.setDetailId("78945");
        orderDetail.setProductId("p123456");
        orderDetail.setProductName("Macbook Pro");
        orderDetail.setProductPrice(new BigDecimal(9999.999));
        orderDetail.setProductQuantity(1);
        orderDetail.setProductIcon("http://baidu.com");

        OrderDetail save = orderDetailRepository.save(orderDetail);
        Assert.assertTrue(save != null);
    }
}