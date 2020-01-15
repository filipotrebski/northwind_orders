package pl.agh.db2.northwind.mapper;

import org.springframework.stereotype.Component;
import pl.agh.db2.northwind.model.Supplier;
import pl.agh.db2.northwind.model.SupplierDto;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class SupplierMapper {

    public Supplier mapToSupplier(final SupplierDto supplierDto){
        return new Supplier(
                supplierDto.getSupplierID(),
                supplierDto.getCompanyName(),
                supplierDto.getContactName(),
                supplierDto.getContactTitle(),
                supplierDto.getAddress(),
                supplierDto.getCity(),
                supplierDto.getRegion(),
                supplierDto.getPostalCode(),
                supplierDto.getCountry(),
                supplierDto.getPhone(),
                supplierDto.getFax(),
                supplierDto.getHomePage()
        );
    }
    public SupplierDto mapToSupplierDto(final Supplier supplier) {
        return new SupplierDto(
                supplier.getSupplierID(),
                supplier.getCompanyName(),
                supplier.getContactName(),
                supplier.getContactTitle(),
                supplier.getAddress(),
                supplier.getCity(),
                supplier.getRegion(),
                supplier.getPostalCode(),
                supplier.getCountry(),
                supplier.getPhone(),
                supplier.getFax(),
                supplier.getHomePage()
        );
    }

    public List<SupplierDto> mapToSupplierDtoList(final List<Supplier> supplierList) {
        return supplierList.stream()
                .map( t -> new SupplierDto(t.getSupplierID(),
                        t.getCompanyName(),
                        t.getContactName(),
                        t.getContactTitle(),
                        t.getAddress(),
                        t.getCity(),
                        t.getRegion(),
                        t.getPostalCode(),
                        t.getCountry(),
                        t.getPhone(),
                        t.getFax(),
                        t.getHomePage()))
                .collect(Collectors.toList());
    }

}
