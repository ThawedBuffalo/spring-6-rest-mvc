package tbs.spring6restmvc.mappers;

import org.mapstruct.Mapper;
import tbs.spring6restmvc.entities.Customer;
import tbs.spring6restmvc.model.CustomerDTO;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDTO dto);
    CustomerDTO customerToCustomerDto(Customer customer);
}
