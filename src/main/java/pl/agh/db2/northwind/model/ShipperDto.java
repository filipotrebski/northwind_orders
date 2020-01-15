package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ShipperDto {
    private Integer shipperId;
    private String companyName;
    private String phone;
}
