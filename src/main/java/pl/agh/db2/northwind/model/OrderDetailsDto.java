package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class OrderDetailsDto {
    private Integer orderId;
    private Integer productId;
    private float unitPrice;
    private int quantity;
    private float discount;

}
