package tbs.spring6restmvc.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import tbs.spring6restmvc.entities.Customer;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    void testSavedCustomer() {
        Customer customer = customerRepository.save(Customer.builder()
                        .name("New Customer")
                .build());

        assertThat(customer.getId()).isNotNull();
    }
}