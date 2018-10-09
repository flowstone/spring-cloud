package me.xueyao.order.repository;

import me.xueyao.order.pojo.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/9.
 */
@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {

}
