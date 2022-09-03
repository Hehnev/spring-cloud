package com.flamexander.cloud.front.service.controllers;

import com.flamexander.cloud.common.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class ProductsController {
    private final RestTemplate restTemplate;

    @GetMapping("/show")
    public List<ProductDto> getProducts() {
        return restTemplate.getForObject("http://product-service/api/v1/products", ArrayList.class);
    }
}
