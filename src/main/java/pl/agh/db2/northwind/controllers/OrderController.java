package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.agh.db2.northwind.mapper.OrderMapper;
import pl.agh.db2.northwind.model.OrderDto;
import pl.agh.db2.northwind.service.DbService;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
public class OrderController {

    @Autowired
    private DbService service;

    @Autowired
    private OrderMapper orderMapper;

    @RequestMapping(method = RequestMethod.GET, value = "/order/{id}")
    public OrderDto getOrder(@PathVariable Integer id){
        return orderMapper.mapToOrderDto(service.getOrderDao().getOne(id));

    }

    @RequestMapping(method = RequestMethod.GET, value = "/order")
    public List<OrderDto> getOrders() {
        return orderMapper.mapToOrderDtoList(service.getOrderDao().findAll());
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/order/{id}")
    public void deleteOrder(@RequestParam Integer id) {
        service.getOrderDao().deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/order")
    public OrderDto updateOrder(@RequestBody OrderDto orderDto) {
        return orderMapper.mapToOrderDto(service.getOrderDao().save(orderMapper.mapToOrder(orderDto)));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/order", consumes = APPLICATION_JSON_VALUE)
    public void createOrder(@RequestBody OrderDto orderDto) {
        service.getOrderDao().save(orderMapper.mapToOrder(orderDto));
    }
}
