package pl.agh.db2.northwind.services;

import pl.agh.db2.northwind.model.Shipper;
import pl.agh.db2.northwind.repository.ShipperDao;
import org.springframework.beans.factory.annotation.Autowired;

public class ShipperService {

    @Autowired
    private ShipperDao shipperDao;
}
