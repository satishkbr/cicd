package com.tsk.customersvcs1.jpa;
import org.springframework.data.repository.CrudRepository;

import com.tsk.customersvcs1.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer>{

}
