package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Customer;
import com.example.demo.repository.*;
@Service
public  class CustomerServiceImpl implements CustomerService {
		@Autowired
		public CustomerRepository customerRepo;
		
	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return  customerRepo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerRepo.getReferenceById(id);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		int id = -1;
		List <Customer> customers = this.getAllCustomers();
		for (Customer obj : customers) {
			if(customer.getEmail().equals(obj.getEmail())) {
				 id = obj.getId();
				 if(id >0) {
						
						customerRepo.deleteById(id);
					}
			}
		}
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		if (customer.getName()!=null || customer.getEmail()!=null)
		{customerRepo.save(customer);}
		else {
			return;
		}	
	}

	@Override
	public void addCredit(Customer customer) {
		int id = -1;
		List <Customer> customers = this.getAllCustomers();
		for (Customer obj : customers) {
			if(customer.getEmail().equals(obj.getEmail())) {
				 id = obj.getId();
				 if(id >0) {
						Customer updatedCustomer = new Customer();
						updatedCustomer.setId(id);
						updatedCustomer.setName(obj.getName());
						updatedCustomer.setEmail(obj.getEmail());
						updatedCustomer.setCredit(obj.getCredit()+customer.getCredit());
						customerRepo.save(updatedCustomer);
					}
			}
		}
		
	}

	@Override
	public void add(Customer customer,@PathVariable int id) {
		customer.setId(id);
		customerRepo.save(customer);
		// TODO Auto-generated method stub
		
	}
	
}
