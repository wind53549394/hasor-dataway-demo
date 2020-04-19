package com.pp.hasor.dataway.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Freemarker测试用控制器
 *
 * @author Kevin
 */
@Controller
public class FreemarkerController {

    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("content", "Hello World");
        return "index";
    }
}
