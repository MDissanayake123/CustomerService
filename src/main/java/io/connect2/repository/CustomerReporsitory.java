package io.connect2.repository;

import io.connect2.dto.CustomerDTO;
import io.connect2.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerReporsitory extends CrudRepository<Customer,String> {

    @Query("select c from Customer c where c.email=?1 and c.password=?2")
   //@Query("select c from Customer c where c.email like %?1")
    Customer findByEmailAndPassword(String email,String password);

    @Query("select c from Customer c where c.email=?1")
    Customer findByCustomerId(String email);
}
