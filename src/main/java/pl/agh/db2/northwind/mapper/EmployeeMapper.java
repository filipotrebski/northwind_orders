package pl.agh.db2.northwind.mapper;

import org.springframework.stereotype.Component;
import pl.agh.db2.northwind.model.Employee;
import pl.agh.db2.northwind.model.EmployeeDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeMapper {

    public Employee mapToEmployee(final EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getEmployeeId(),
                employeeDto.getLastName(),
                employeeDto.getFirstName(),
                employeeDto.getTitle(),
                employeeDto.getTitleOfCourtesy(),
                employeeDto.getBirthDate(),
                employeeDto.getHireDate(),
                employeeDto.getAddress(),
                employeeDto.getCity(),
                employeeDto.getRegion(),
                employeeDto.getPostalCode(),
                employeeDto.getCountry(),
                employeeDto.getHomePhone(),
                employeeDto.getExtension(),
                employeeDto.getPhoto(),
                employeeDto.getNotes(),
                employeeDto.getReportsto(),
                employeeDto.getPhotoPath()
//                ,employeeDto.getSubordinates()
        );
    }
    public EmployeeDto mapToEmployeeDto(final Employee employee) {
        return new EmployeeDto(
                employee.getEmployeeId(),
                employee.getLastName(),
                employee.getFirstName(),
                employee.getTitle(),
                employee.getTitleOfCourtesy(),
                employee.getBirthDate(),
                employee.getHireDate(),
                employee.getAddress(),
                employee.getCity(),
                employee.getRegion(),
                employee.getPostalCode(),
                employee.getCountry(),
                employee.getHomePhone(),
                employee.getExtension(),
                employee.getPhoto(),
                employee.getNotes(),
                employee.getReportsto(),
                employee.getPhotoPath()
//                , employee.getSubordinates()
        );
    }

    public List<EmployeeDto> mapToEmployeeDtoList(final List<Employee> employeeList) {
        return employeeList.stream()
                .map( t -> {
                    return new EmployeeDto(
                            t.getEmployeeId(),
                            t.getLastName(),
                            t.getFirstName(),
                            t.getTitle(),
                            t.getTitleOfCourtesy(),
                            t.getBirthDate(),
                            t.getHireDate(),
                            t.getAddress(),
                            t.getCity(),
                            t.getRegion(),
                            t.getPostalCode(),
                            t.getCountry(),
                            t.getHomePhone(),
                            t.getExtension(),
                            t.getPhoto(),
                            t.getNotes(),
                            t.getReportsto(),
                            t.getPhotoPath()
//                            , t.getSubordinates()
                    );
                })
                .collect(Collectors.toList());
    }
}
