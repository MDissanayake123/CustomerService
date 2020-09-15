package io.connect2.service.impl;

import io.connect2.dto.CustomerDTO;
import io.connect2.model.Course;
import io.connect2.model.Customer;
import io.connect2.repository.CustomerReporsitory;
import io.connect2.service.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerReporsitory customerReporsitory;

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO, customer);
        customerReporsitory.save(customer);


    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO, String id) {

    }

    @Override
    public void deleteCustomer(String id) {

    }

    @Override
    public CustomerDTO searchCustomer(String email) {
      //get customer detail using username(CustomerId)
        CustomerDTO customerDTO = new CustomerDTO();
        Customer customer=customerReporsitory.findByCustomerId(email);
        BeanUtils.copyProperties(customer, customerDTO);
        return customerDTO;
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customerList = new ArrayList<Customer>();
        customerReporsitory.findAll().forEach(customerList::add);
        return customerList;
      //  return null;
    }


    @Override
    public CustomerDTO findUserToLog(String email,String pwd) {
        CustomerDTO customerDTO = new CustomerDTO();
        Customer customer=customerReporsitory.findByEmailAndPassword(email,pwd);
        BeanUtils.copyProperties(customer, customerDTO);
        return customerDTO;
    }
}
