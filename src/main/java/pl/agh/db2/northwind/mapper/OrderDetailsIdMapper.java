package pl.agh.db2.northwind.mapper;

import org.springframework.stereotype.Component;
import pl.agh.db2.northwind.model.OrderDetailsId;
import pl.agh.db2.northwind.model.OrderDetailsIdDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderDetailsIdMapper {

    public OrderDetailsId mapToOrderDetailsId(final OrderDetailsIdDto orderDetailsIdDto){
        return new OrderDetailsId(
                orderDetailsIdDto.getOrderId(),
                orderDetailsIdDto.getProductId()
        );
    }
    public OrderDetailsIdDto mapToOrderDetailsIdDto(final OrderDetailsId orderDetailsId) {
        return new OrderDetailsIdDto(
                orderDetailsId.getOrderId(),
                orderDetailsId.getProductId()
        );
    }

    public List<OrderDetailsIdDto> mapToOrderDetailsIdDtoList(final List<OrderDetailsId> orderDetailsIdList) {
        return orderDetailsIdList.stream()
                .map( t -> new OrderDetailsIdDto(
                        t.getOrderId(),
                        t.getProductId()
                ))
                .collect(Collectors.toList());
    }
}
