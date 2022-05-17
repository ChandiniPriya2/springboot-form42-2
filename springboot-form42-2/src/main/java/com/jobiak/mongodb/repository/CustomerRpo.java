package com.jobiak.mongodb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobiak.mongodb.model.Customer;

@Repository
public interface CustomerRpo extends JpaRepository<Customer,Long> {

}
