package pl.agh.db2.northwind.mapper;

import org.springframework.stereotype.Component;
import pl.agh.db2.northwind.model.Customer;
import pl.agh.db2.northwind.model.CustomerDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomerMapper {

    public Customer mapToCustomer(final CustomerDto customerDto){
        return new Customer(
                customerDto.getCustomerId(),
                customerDto.getCompanyName(),
                customerDto.getContactName(),
                customerDto.getContactTitle(),
                customerDto.getAddress(),
                customerDto.getCity(),
                customerDto.getRegion(),
                customerDto.getPostalCode(),
                customerDto.getCountry(),
                customerDto.getPhone(),
                customerDto.getFax()
        );
    }
    public CustomerDto mapToCustomerDto(final Customer customer) {
        return new CustomerDto(
                customer.getCustomerId(),
                customer.getCompanyName(),
                customer.getContactName(),
                customer.getContactTitle(),
                customer.getAddress(),
                customer.getCity(),
                customer.getRegion(),
                customer.getPostalCode(),
                customer.getCountry(),
                customer.getPhone(),
                customer.getFax()
        );
    }

    public List<CustomerDto> mapToCustomerDtoList(final List<Customer> customerList) {
        return customerList.stream()
                .map( t -> new CustomerDto(
                        t.getCustomerId(),
                        t.getCompanyName(),
                        t.getContactName(),
                        t.getContactTitle(),
                        t.getAddress(),
                        t.getCity(),
                        t.getRegion(),
                        t.getPostalCode(),
                        t.getCountry(),
                        t.getPhone(),
                        t.getFax()
                ))
                .collect(Collectors.toList());
    }
}
