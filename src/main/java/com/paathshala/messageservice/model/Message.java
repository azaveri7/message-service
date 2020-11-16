package com.paathshala.messageservice.model;

public class Message {
	
	private String emailId;
	private Flight flight;
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString(){
		return "Flight Id: " + flight.getFlightId() + " \n" +
				"Flight name: " + flight.getAirlinesName() + " \n" +
				"Destination name: " + flight.getDestinationName() + " \n" +
				"Source name: " + flight.getBoardingName() + " \n" +
				"Email id: " + getEmailId() + " \n";
	}
}
