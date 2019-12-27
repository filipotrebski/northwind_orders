package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.agh.db2.northwind.model.Shipper;
import pl.agh.db2.northwind.repository.ShipperDao;

import java.util.Optional;

@Controller
public class ShipperController {

    @Autowired
    ShipperDao shipperDao;

    @GetMapping("/shipper")
    @ResponseBody
    public String shipper(){

        return "shipper";
    }

    @GetMapping("/shipper/{id}")
    @ResponseBody
    public Optional<Shipper> getShipperById(@PathVariable Integer id){return shipperDao.findById(id);}
}
