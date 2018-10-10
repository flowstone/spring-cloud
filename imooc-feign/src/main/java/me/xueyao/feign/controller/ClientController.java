package me.xueyao.feign.controller;

import lombok.extern.slf4j.Slf4j;
import me.xueyao.feign.client.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/10.
 */
@RestController
@Slf4j
public class ClientController {
    @Autowired
    private ProductClient productClient;

    @GetMapping("/getProductMsg")
    public String getProductMsg() {
        String response = productClient.productMsg();
        log.info("response = {}", response);
        return response;
    }
}
