package com.jobiak.mongodb;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jobiak.mongodb.model.Customer;
import com.jobiak.mongodb.repository.CustomerRpo;



@SpringBootApplication
public class SpringbootForm422Application implements CommandLineRunner{ 
	@Autowired
	CustomerRpo repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootForm422Application.class,args); 
		
     }

@Override
public void run(String... args) throws Exception {
	
	Customer c1=new Customer();
	c1.setAcctno(101);
	c1.setName("Nobitha");
	c1.setBalance(4000);
repo.save(c1);
	Customer c2=new Customer();
	c2.setAcctno(102);
	c2.setName("Suziki");
	c2.setBalance(5000);
repo.save(c2);
	
	Customer c3=new Customer();
	c3.setAcctno(103);
	c3.setName("Zeon");
	c3.setBalance(44500);

	repo.save(c3);
	Customer c4=new Customer();
	c4.setAcctno(104);
	c4.setName("Dora");
	c4.setBalance(4300);
repo.save(c4);

Optional <Customer> cust=repo.findById(102L);
if(cust.isPresent()) {
	System.out.println(cust.get());
}
 List<Customer> list=repo.findAll();
for(Customer c:list) {
	System.out.println(c);
}
}

}


