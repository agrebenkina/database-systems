package airTraffic.model.bean;

import java.sql.Date;
import java.sql.Time;
import java.util.LinkedList;

public class FlightSegmentBean {

	private Date date ;
	private String flight_number;
	private LinkedList<String> maerketing_carrier_flight_numbers;
	private String gate_nr;
	private Time boarding_time;
	private Time arriving_time;
	private Time departure_time;
	private String departure_airport;
	private String arrival_airport;
	private String operated_by;
	private int flightBy;
	public int getFlightBy() {
		return flightBy;
	}
	public void setFlightBy(int flightBy) {
		this.flightBy = flightBy;
	}
	public String getOperated_by() {
		return operated_by;
	}
	public void setOperated_by(String operated_by) {
		this.operated_by = operated_by;
	}
	public Time getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(Time departure_time) {
		this.departure_time = departure_time;
	}
	public String getDeparture_airport() {
		return departure_airport;
	}
	public void setDeparture_airport(String departure_airport) {
		this.departure_airport = departure_airport;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}
	public LinkedList<String> getMaerketing_carrier_flight_numbers() {
		return maerketing_carrier_flight_numbers;
	}
	public void setMaerketing_carrier_flight_numbers(
			LinkedList<String> maerketing_carrier_flight_numbers) {
		this.maerketing_carrier_flight_numbers = maerketing_carrier_flight_numbers;
	}
	public String getGate_nr() {
		return gate_nr;
	}
	public void setGate_nr(String gate_nr) {
		this.gate_nr = gate_nr;
	}
	public Time getBoarding_time() {
		return boarding_time;
	}
	public void setBoarding_time(Time boarding_time) {
		this.boarding_time = boarding_time;
	}
	public Time getArriving_time() {
		return arriving_time;
	}
	public void setArriving_time(Time arriving_time) {
		this.arriving_time = arriving_time;
	}
	public String getArrival_airport() {
		return arrival_airport;
	}
	public void setArrival_airport(String arrival_airport) {
		this.arrival_airport = arrival_airport;
	}
	
	
}
