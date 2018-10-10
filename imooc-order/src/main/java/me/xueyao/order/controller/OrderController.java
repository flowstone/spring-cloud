package me.xueyao.order.controller;

import lombok.extern.slf4j.Slf4j;
import me.xueyao.order.form.OrderForm;
import me.xueyao.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/9.
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public void create(@Valid OrderForm orderForm, BindingResult bindingResult) {
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<@Valid OrderForm>> validate = validator.validate(orderForm);
        for (ConstraintViolation<OrderForm> orderFormConstraintViolation : validate) {
            System.out.println(orderFormConstraintViolation.getMessage());
        }
        if (bindingResult.hasErrors()) {
            log.error("[创建订单]参数不正确，orderForm={}",orderForm);
        }

    }
}
