package com.codingwithset.springbootcourse.controller;

import com.codingwithset.springbootcourse.model.Customer;
import com.codingwithset.springbootcourse.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping(value = "/api/customers")
public class CustomerController {


    @Autowired
    private CustomerRepository mRepository;


    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") Integer id) {
        try {
            Customer customer = mRepository.findById(id).get();
            mRepository.delete(customer);
            return ResponseEntity.ok(customer);

        } catch (Exception e) {
            return ResponseEntity.status(404).body(null);
        }


    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCustomerById(@PathVariable Integer id) {

        try {
            Optional<Customer> customer = mRepository.findById(id);
            return ResponseEntity.ok(customer);


        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(404).body(null);
        }

    }

    @PostMapping
    public ResponseEntity<?> addNewCustomer(@RequestBody Customer customer) {
        mRepository.save(customer);
        return ResponseEntity.ok(customer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateCustomer(@PathVariable("id") Integer id,
                                            @RequestBody Customer customer) {

        customer.setId(id);
        mRepository.save(customer);
        return ResponseEntity.ok(customer);

    }


    @GetMapping
    public Iterable<Customer> getAllCustomers(
            @RequestParam(name = "_page", defaultValue = "1") Integer pageNumber,
            @RequestParam(name = "_limit", defaultValue = "10") Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNumber - 1, pageSize); //reason for -1 is list start from 0

        return mRepository.findAll(pageable).getContent();
    }
}
