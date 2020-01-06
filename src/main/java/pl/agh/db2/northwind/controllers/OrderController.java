package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.agh.db2.northwind.model.Order;
import pl.agh.db2.northwind.repository.OrderDao;

import java.util.List;
import java.util.Optional;

@Controller
public class OrderController {

    @Autowired
    private OrderDao orderDao;

    @GetMapping("/order/{id}")
    @ResponseBody
    public Optional<Order> getOrder(@PathVariable Integer id){
        return orderDao.findById(id);

    }

    @GetMapping("/order/all")
    @ResponseBody
    public List<Order> orderList(){

        List<Order> orders = (List<Order>) orderDao.findAll();

        return orders;
    }
}
