package io.connect2.service;

import io.connect2.dto.CustomerDTO;
import io.connect2.model.Customer;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);
    void updateCustomer(CustomerDTO customerDTO ,String id);
    void deleteCustomer(String id);
    CustomerDTO searchCustomer(String id);
    public List<Customer> getAllCustomers();
    CustomerDTO findUserToLog(String email,String pwd);
}
