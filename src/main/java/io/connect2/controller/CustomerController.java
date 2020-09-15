package io.connect2.controller;

import io.connect2.dto.CourseDto;
import io.connect2.dto.CustomerDTO;
import io.connect2.model.Customer;
import io.connect2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/customer")
	public void addCustomer(@RequestBody CustomerDTO customerDTO) {
        System.out.println("===========  "+customerDTO.getBusinessName()+" ,  "+customerDTO.getEmail());
        customerService.saveCustomer(customerDTO);
	}

    @GetMapping("/customers")
    public List<Customer> viewAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/abcd")
    public String viewAllCustomers3(){
        return "Hi sudaraka";
    }

    @GetMapping("sign/{mail}/{pwd}")
    public CustomerDTO searchToLog(@PathVariable String mail,@PathVariable String pwd) {
        return customerService.findUserToLog(mail,pwd);
    }

    @GetMapping("customer/{mail}")
    public CustomerDTO searchCustomerId(@PathVariable String mail) {
        return customerService.searchCustomer(mail);
    }



}
