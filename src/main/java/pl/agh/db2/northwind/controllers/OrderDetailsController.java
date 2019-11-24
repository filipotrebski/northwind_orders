package pl.agh.db2.northwind.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderDetailsController {

    @GetMapping("/orderdetails")
    @ResponseBody
    public String orderDetails(){

        return "order details";
    }
}