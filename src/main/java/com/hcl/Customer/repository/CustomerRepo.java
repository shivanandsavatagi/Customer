package com.hcl.Customer.repository;

import com.hcl.Customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
public Customer findByCustId(Integer id);
public void deleteByCustId(Integer id);

}
