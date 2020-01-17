package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.agh.db2.northwind.mapper.SupplierMapper;
import pl.agh.db2.northwind.model.SupplierDto;
import pl.agh.db2.northwind.service.DbService;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
public class SupplierController {

    @Autowired
    private DbService service;
    @Autowired
    private SupplierMapper supplierMapper;

    @RequestMapping(method = RequestMethod.GET, value = "/supplier")
    public List<SupplierDto> getSuppliers() {
        return supplierMapper.mapToSupplierDtoList(service.getSupplierDao().findAll());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/supplier/{id}")
    public SupplierDto getSupplier(@RequestParam Integer id) {
        return supplierMapper.mapToSupplierDto(service.getSupplierDao().getOne(id));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/supplier/{id}")
    public void deleteSupplier(@RequestParam Integer id) {
        service.getShipperDao().deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/supplier")
    public SupplierDto updateSupplier(@RequestBody SupplierDto supplierDto) {
        return supplierMapper.mapToSupplierDto(service.getSupplierDao().save(supplierMapper.mapToSupplier(supplierDto)));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/suplier", consumes = APPLICATION_JSON_VALUE)
    public void createSupplier(@RequestBody SupplierDto supplierDto) {
        service.getSupplierDao().save(supplierMapper.mapToSupplier(supplierDto));
    }
}