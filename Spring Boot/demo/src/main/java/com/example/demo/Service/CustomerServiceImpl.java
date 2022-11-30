package com.example.demo.Service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import com.example.demo.model.Customer;

import com.example.demo.repository.*;
@Service
public  class CustomerServiceImpl implements CustomerService {
		@Autowired
		public CustomerRepository customerRepo;
		
		
	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
	    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	    customer.setPassword(bCryptPasswordEncoder.encode(customer.getPassword()));
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
		return (Customer) customerRepo.findById(id).get();
	}

	@Override
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		int id = -1;
		List <Customer> customers = this.getAllCustomers();
		for (Customer obj : customers) {
			if((customer.getEmail().equals(obj.getEmail())) && customer.getPassword().equals(obj.getPassword())) {
				 id = obj.getId();
				 if(id >0) {
						
						customerRepo.deleteById(id);
					}
			}
		}
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		//updates customer with all the passed attributes but nulls all the ones that aren't passed.
	    //int id= -1;
	    List <Customer> list = this.getAllCustomers();
	    for (Customer obj: list) {
	        if(obj.getId() == customer.getId()) {
	            
	            if(customer.getName()!=null) {
	                obj.setName(customer.getName());
	            }
	            if(customer.getEmail()!=null) {
	                obj.setEmail(customer.getEmail());
	            }
	            if(customer.getPassword()!=null) {
	                obj.setPassword(customer.getPassword());
	            }
	            this.saveCustomer(obj);
	            return;
	        }
	    }
	}

	@Override
	public void addCredit(Customer customer) {
		int id = -1;
		List <Customer> customers = this.getAllCustomers();
		for (Customer obj : customers) {
			if(customer.getEmail().equals(obj.getEmail()) && obj.getPassword().equals(customer.getPassword())) {
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
    public String  isPresent(Customer customer) {
        // TODO Auto-generated method stub
        List <Customer> customers = this.getAllCustomers();
        for(Customer obj : customers) {
            if( customer.getPassword().equals(obj.getPassword())) {
                return obj.getPassword();
            }
        }
        
        return customer.getPassword() + "if failed";
    }

 

	
	
}