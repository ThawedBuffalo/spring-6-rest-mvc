package tbs.spring6restmvc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tbs.spring6restmvc.mappers.CustomerMapper;
import tbs.spring6restmvc.model.CustomerDTO;
import tbs.spring6restmvc.repositories.CustomerRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Primary
@RequiredArgsConstructor
public class CustomerServiceJpaImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    public Optional<CustomerDTO> getCustomerById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return List.of();
    }

    @Override
    public CustomerDTO saveNewCustomer(CustomerDTO customer) {
        return null;
    }

    @Override
    public void updateCustomerById(UUID customerId, CustomerDTO customer) {

    }

    @Override
    public void deleteCustomerById(UUID customerId) {

    }

    @Override
    public void patchCustomerById(UUID customerId, CustomerDTO customer) {

    }
}
