package pl.agh.db2.northwind.controllers;

import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.agh.db2.northwind.mapper.*;
import pl.agh.db2.northwind.model.*;
import pl.agh.db2.northwind.service.DbService;

import java.util.ArrayList;
import java.util.Date;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
public class CartController {

    @Autowired
    private DbService service;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderDetailsMapper orderDetailsMapper;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private ShipperMapper shipperMapper;

    @RequestMapping(method = RequestMethod.POST, value = "/cart", consumes = APPLICATION_JSON_VALUE)
    public void addToCart(@RequestParam Integer customerId, @RequestParam Integer employeeId, @RequestParam Integer shipperId,
                          @RequestBody ArrayList<OrderDetailsHelper> detailsDto) {
        CustomerDto customer = customerMapper.mapToCustomerDto(service.getCustomerDao().getOne(customerId));
        ShipperDto shipper = shipperMapper.mapToShipperDto(service.getShipperDao().getOne(shipperId));
        Order order = service.getOrderDao().save(orderMapper.mapToOrder(new OrderDto(0 ,
                service.getCustomerDao().getOne(customerId),
                service.getEmployeeDao().getOne(employeeId),
                new Date(),
                new Date(),
                new Date(),
                service.getShipperDao().getOne(shipperId),
                shipper.getCompanyName(),
                customer.getCompanyName(),
                customer.getAddress(),
                customer.getCity(),
                customer.getRegion(),
                customer.getPostalCode(),
                customer.getCountry())));

        detailsDto.stream().map(t ->
                new OrderDetailsDto(
                        order.getOrderID(),
                        t.getProductId(),
                        service.getProductDao().getOne(t.getProductId()).getUnitPrice(),t.getQuantity(),t.getDiscount())
        ).forEach(x -> service.getDetailsDao().save(orderDetailsMapper.mapToOrderDetails(x)));

    }
}
