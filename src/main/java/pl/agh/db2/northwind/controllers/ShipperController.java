package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.agh.db2.northwind.mapper.ShipperMapper;
import pl.agh.db2.northwind.model.ShipperDto;
import pl.agh.db2.northwind.service.DbService;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
public class ShipperController {

    @Autowired
    private DbService service;

    @Autowired
    private ShipperMapper shipperMapper;

    @RequestMapping(method = RequestMethod.GET, value = "/shipper")
    public List<ShipperDto> getShippers() {
        return shipperMapper.mapToShipperDtoList(service.getShipperDao().findAll());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/shipper/{id}")
    public ShipperDto getShipper(@RequestBody Integer id) {
        return shipperMapper.mapToShipperDto(service.getShipperDao().getOne(id));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/shipper/{id}")
    public void deleteShipper(@RequestParam Integer id) {
        service.getShipperDao().deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/shipper")
    public ShipperDto updateShipper(@RequestBody ShipperDto shipperDto) {
        return shipperMapper.mapToShipperDto(service.getShipperDao().save(shipperMapper.mapToShipper(shipperDto)));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/shipper", consumes = APPLICATION_JSON_VALUE)
    public void createShipper(@RequestBody ShipperDto shipperDto) {
        service.getShipperDao().save(shipperMapper.mapToShipper(shipperDto));
    }
}
