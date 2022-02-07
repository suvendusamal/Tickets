package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
 

public interface TicketRepo  extends  JpaRepository<TicketEntity,Integer>{
	

}
