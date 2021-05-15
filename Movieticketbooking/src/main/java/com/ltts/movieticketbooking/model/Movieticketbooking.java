package com.ltts.movieticketbooking.model;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movieticketbooking {
	@Id
	private String movieName;
	private String circleType;
	private String bookingDate;
	private String showDate;
	private int noOfTickets;
	public Movieticketbooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movieticketbooking(String movieName, String circleType, String bookingDate, String showDate, int noOfTickets) {
		super();
		this.movieName = movieName;
		this.circleType = circleType;
		this.bookingDate = bookingDate;
		this.showDate = showDate;
		this.noOfTickets = noOfTickets;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getCircleType() {
		return circleType;
	}
	public void setCircleType(String circleType) {
		this.circleType = circleType;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getShowDate() {
		return showDate;
	}
	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	@Override
	public String toString() {
		return "BookTicket [movieName=" + movieName + ", circleType=" + circleType + ", bookingDate=" + bookingDate
				+ ", showDate=" + showDate + ", noOfTickets=" + noOfTickets + "]";
	}
	
}
