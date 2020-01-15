package pl.agh.db2.northwind.mapper;

import org.springframework.stereotype.Component;
import pl.agh.db2.northwind.model.OrderDetails;
import pl.agh.db2.northwind.model.OrderDetailsDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderDetailsMapper {

    public OrderDetails mapToOrderDetails(final OrderDetailsDto orderDetailsDto){
        return new OrderDetails(
                orderDetailsDto.getOrderId(),
                orderDetailsDto.getProductId(),
                orderDetailsDto.getUnitPrice(),
                orderDetailsDto.getQuantity(),
                orderDetailsDto.getDiscount()
        );
    }
    public OrderDetailsDto mapToOrderDetailsDto(final OrderDetails orderDetails) {
        return new OrderDetailsDto(
                orderDetails.getOrderId(),
                orderDetails.getProductId(),
                orderDetails.getUnitPrice(),
                orderDetails.getQuantity(),
                orderDetails.getDiscount()
        );
    }

    public List<OrderDetailsDto> mapToOrderDetailsDtoList(final List<OrderDetails> orderDetailsList) {
        return orderDetailsList.stream()
                .map( t -> new OrderDetailsDto(
                        t.getOrderId(),
                        t.getProductId(),
                        t.getUnitPrice(),
                        t.getQuantity(),
                        t.getDiscount()
                ))
                .collect(Collectors.toList());
    }

}
