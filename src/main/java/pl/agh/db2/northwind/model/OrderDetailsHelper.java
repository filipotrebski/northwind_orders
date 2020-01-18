package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDetailsHelper {
    private Integer productId;
    private Integer quantity;
    private Float discount;
}
