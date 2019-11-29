package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.agh.db2.northwind.model.Order;
import pl.agh.db2.northwind.repository.OrderDao;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderDao orderDao;

    @GetMapping("/order/id")
    @ResponseBody
    public Object object(@PathVariable Integer id){

        Order byOrder = orderDao.getOrderById(id);

        return byOrder;

    }

    @GetMapping("/order/all")
    @ResponseBody
    public List<Order> orderList(){

        List<Order> orders = (List<Order>) orderDao.findAll();

        return orders;
    }
}
