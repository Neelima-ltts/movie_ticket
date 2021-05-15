package com.ltts.movieticketbooking.controller;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.movieticketbooking.dao.MovieticketbookingDao;
import com.ltts.movieticketbooking.model.Movieticketbooking;

@RestController
public class MovieticketbookingController {
	@Autowired
	MovieticketbookingDao m;
	
	@RequestMapping("")
	public ModelAndView secondMethod() {
		return new ModelAndView("movielist");
	}
	@RequestMapping("/Book")
	public ModelAndView thirdMethod() {
		return new ModelAndView("Book");
	}
	
	@RequestMapping(value="Booking",method=RequestMethod.POST)
	public ModelAndView Booking(HttpServletRequest req, Model model,HttpSession httpSession) {
		ModelAndView mv=null;
		String movieName=req.getParameter("movieName");
		String circleType=req.getParameter("circleType");
		String date = req.getParameter("bookingDate");
		String date1 = req.getParameter("showDate");
		int noOfTickets=Integer.parseInt(req.getParameter("noOfTickets"));
		int TotalSeats=500;
		int AvailableSeats=TotalSeats-noOfTickets;
		httpSession.setAttribute("nt", AvailableSeats);
		
		Movieticketbooking mtb=new Movieticketbooking(movieName,circleType,date,date1,noOfTickets);
		boolean b=m.AddBooking(mtb);
		if(b==true) {
			mv=new ModelAndView("success");
			
		}
		else {
			mv=new ModelAndView("error");
			model.addAttribute("msg","Error due to Connections");
		}
		
		return mv;
		
	}


}
