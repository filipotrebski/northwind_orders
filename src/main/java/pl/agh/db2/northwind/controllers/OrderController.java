package pl.agh.db2.northwind.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {

    @GetMapping("/order")
    @ResponseBody
    public String order(){

        return "order";
    }
}
