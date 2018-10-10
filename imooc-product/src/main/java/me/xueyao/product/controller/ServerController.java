package me.xueyao.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/10.
 */
@RestController
public class ServerController {
    @GetMapping("/msg")
    public String msg() {
        return "this is product msg";
    }
}
