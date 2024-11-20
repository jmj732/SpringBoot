package com.example.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ItemController {
    @GetMapping("/list")
    public String list(Model model) {
        ArrayList<String>[] items = new ArrayList[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = new ArrayList<>();
            items[i].add("바지");
            items[i].add("10000");
            items[i].add("100");
        }
        model.addAttribute("items", items);
        return "list.html";
    }

}
