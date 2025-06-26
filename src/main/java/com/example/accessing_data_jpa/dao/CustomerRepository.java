package com.example.accessing_data_jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.accessing_data_jpa.model.Customer;

//public interface CustomerRepository extends CrudRepository<Customer, Long> {
	public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

	Customer findById(long id);

}
