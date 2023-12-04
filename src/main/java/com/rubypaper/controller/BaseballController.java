package com.rubypaper.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class BaseballController {

    @GetMapping("/")
    public String index(Model model) {
        List<Product> products = Arrays.asList(
                new Product("모자 1", "스포츠 테마의 모자", 25000),
                new Product("모자 2", "캐주얼한 디자인의 모자", 30000),
                new Product("모자 3", "야구 팬을 위한 모자", 28000)
        );
        model.addAttribute("products", products);
        return "hello";
    }

    private static class Product {
        private final String name;
        private final String description;
        private final int price;

        public Product(String name, String description, int price) {
            this.name = name;
            this.description = description;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public int getPrice() {
            return price;
        }
    }
}
