package pl.agh.db2.northwind.mapper;

import org.springframework.stereotype.Component;
import pl.agh.db2.northwind.model.Order;
import pl.agh.db2.northwind.model.OrderDto;
import pl.agh.db2.northwind.repository.CustomerDao;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderMapper {

    public Order mapToOrder(final OrderDto orderDto){
        return new Order(
                orderDto.getOrderID(),
                orderDto.getCustomerID(),
                orderDto.getEmployeeID(),
                orderDto.getOrderDate(),
                orderDto.getRequiredDate(),
                orderDto.getShippedDate(),
                orderDto.getShipVia(),
                orderDto.getFreight(),
                orderDto.getShipName(),
                orderDto.getShipAddress(),
                orderDto.getShipCity(),
                orderDto.getShipRegion(),
                orderDto.getShipPostalCode(),
                orderDto.getShipCountry()
        );
    }
    public OrderDto mapToOrderDto(final Order order) {
        return new OrderDto(
                order.getOrderID(),
                order.getCustomerID(),
                order.getEmployeeID(),
                order.getOrderDate(),
                order.getRequiredDate(),
                order.getShippedDate(),
                order.getShipVia(),
                order.getFreight(),
                order.getShipName(),
                order.getShipAddress(),
                order.getShipCity(),
                order.getShipRegion(),
                order.getShipPostalCode(),
                order.getShipCountry()
        );
    }

    public List<OrderDto> mapToOrderDtoList(final List<Order> orderList) {
        return orderList.stream()
                .map( t -> new OrderDto(
                        t.getOrderID(),
                        t.getCustomerID(),
                        t.getEmployeeID(),
                        t.getOrderDate(),
                        t.getRequiredDate(),
                        t.getShippedDate(),
                        t.getShipVia(),
                        t.getFreight(),
                        t.getShipName(),
                        t.getShipAddress(),
                        t.getShipCity(),
                        t.getShipRegion(),
                        t.getShipPostalCode(),
                        t.getShipCountry()
                ))
                .collect(Collectors.toList());
    }
}
