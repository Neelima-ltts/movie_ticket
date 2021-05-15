package com.ltts.movieticketbooking.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.movieticketbooking.model.Movieticketbooking;

@Repository
public class MovieticketbookingDao {
	@Autowired
	private SessionFactory sf;
	public boolean AddBooking(Movieticketbooking tb) {
	   boolean b=false;
	   Session s=null;
			   try {
				   s=sf.openSession();
				   s.beginTransaction();
				   s.save(b);
				   s.getTransaction().commit();
			   }
	   catch(Exception e){
		   System.out.println("Exception "+e);
		   b=true;
		   
	   }
		return b;
		
	}
	

}
