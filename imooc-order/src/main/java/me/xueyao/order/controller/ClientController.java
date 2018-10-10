package me.xueyao.order.controller;

import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/10.
 */
@RestController
@Slf4j
public class ClientController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    //@Autowired
    //private RestTemplate restTemplate;

    @GetMapping("/getProductMsg")
    public String getProductMsg() {
        final String URL = "http://localhost:9090/msg";
        //第一种  调用其它服务接口，缺点：URL固定，不可改变
        //RestTemplate restTemplate = new RestTemplate();
        //String response = restTemplate.getForObject(URL, String.class);

        //第二种  调用其它服务接口
        RestTemplate restTemplate = new RestTemplate();
        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
        serviceInstance.getHost();
        String url = String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort() + "/msg");
        String response = restTemplate.getForObject(url, String.class);

        //第三种 调用其它服务接口(利用@LoadBalanced,可在restTemplate里使用应用的名字)
        //String response = restTemplate.getForObject("http://PRODUCT/msg", String.class);
        log.info("response={}", response);
        return response;
    }
}
