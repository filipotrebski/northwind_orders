package pl.agh.db2.northwind.mapper;

import org.springframework.stereotype.Component;
import pl.agh.db2.northwind.model.Shipper;
import pl.agh.db2.northwind.model.ShipperDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ShipperMapper {

    public Shipper mapToShipper(final ShipperDto shipperDto){
        return new Shipper(
                shipperDto.getShipperId(),
                shipperDto.getCompanyName(),
                shipperDto.getPhone()
        );
    }
    public ShipperDto mapToShipperDto(final Shipper shipper) {
        return new ShipperDto(
                shipper.getShipperId(),
                shipper.getCompanyName(),
                shipper.getPhone()
        );
    }

    public List<ShipperDto> mapToShipperDtoList(final List<Shipper> shipperList) {
        return shipperList.stream()
                .map( t -> new ShipperDto(
                        t.getShipperId(),
                        t.getCompanyName(),
                        t.getPhone()
                ))
                .collect(Collectors.toList());
    }
}
