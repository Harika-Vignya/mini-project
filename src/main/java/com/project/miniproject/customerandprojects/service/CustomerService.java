package com.project.miniproject.customerandprojects.service;
import com.project.miniproject.customerandprojects.entity.Customer;
import com.project.miniproject.customerandprojects.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.getReferenceById(id);
    }
}
