package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.agh.db2.northwind.mapper.OrderDetailsMapper;
import pl.agh.db2.northwind.model.OrderDetailsDto;
import pl.agh.db2.northwind.model.OrderDetailsId;
import pl.agh.db2.northwind.repository.OrderDetailsDao;
import pl.agh.db2.northwind.service.DbService;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
public class OrderDetailsController {

    @Autowired
    private DbService service;

    @Autowired
    private OrderDetailsMapper orderDetailsMapper;

    @RequestMapping(method = RequestMethod.GET, value = "/order_details")
    public List<OrderDetailsDto> getOrderDetails() {
        return orderDetailsMapper.mapToOrderDetailsDtoList(service.getDetailsDao().findAll());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/order_details/{orderId}&{productId}")
    public OrderDetailsDto getOrderDetails(@RequestParam Integer orderId, @RequestParam Integer productId) {
        return orderDetailsMapper.mapToOrderDetailsDto(service.getDetailsDao().findByOrderIdAndProductId(orderId, productId));
    }
}
