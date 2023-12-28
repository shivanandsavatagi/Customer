package com.hcl.Customer.controller;


import com.hcl.Customer.model.Customer;
import com.hcl.Customer.repository.CustomerRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hcl.com")
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;
    @PostMapping("/createCust")
    public String createCustomer(@RequestBody Customer customer){
        customerRepo.save(customer);
        return "successfully created customer";

    }

    @GetMapping("/getbycustid/{id}")
    public Customer getByCustId(@PathVariable Integer id){
      Customer customer =  customerRepo.findByCustId(id);

        return customer;
    }
    @GetMapping("/getallcustomers")
    public List<Customer> getAllCustomers(){
       List<Customer> customerList =customerRepo.findAll();

        return customerList;
    }

    @Transactional
    @DeleteMapping("/deletebyid/{id}")
    public String deleteByCustId(@PathVariable Integer id){
        customerRepo.deleteByCustId(id);
        return "successfully deleted";

    }

    @DeleteMapping("/deleteallcust")
    public String deleteAllCust(){
        customerRepo.deleteAll();
        return "Successfully deleted all customers";
    }

    @PutMapping("/updatebycustid/{id}")
    public Customer updateByCustId(@PathVariable Integer id){
       Customer customer= customerRepo.findByCustId(id);
       customer.SetCustadd("Bangalore");
       customerRepo.save(customer);
     return customer;
    }

    @PutMapping("/updatebycustid/{id}/{addr}")
    public Customer updateByCustId(@PathVariable Integer id,@PathVariable String addr){
        Customer customer= customerRepo.findByCustId(id);
        customer.SetCustadd(addr);
        customerRepo.save(customer);
        return customer;
    }

}
