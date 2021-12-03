package flighttest.entity;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tFlight")
public class Flight  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="f_number")
	private String fNumber;
	
	@Column(name="opr_airline")
	private String operAirline;
	
	@Column(name="departure_city")
	private String dCity;
	
	@Column(name="arrival_city")
	private String arCity;
	
	@Column(name="date_of_departure")
	private String dateOfDeparture;
	
	@Column(name="es_departure_time")
	private String estimedDepartureTime;
	
	public String getfNumber() {
		return fNumber;
	}
	public void setfNumber(String fNumber) {
		this.fNumber = fNumber;
	}
	public String getOperAirline() {
		return operAirline;
	}
	public void setOperAirline(String operAirline) {
		this.operAirline = operAirline;
	}
	public String getdCity() {
		return dCity;
	}
	public void setdCity(String dCity) {
		this.dCity = dCity;
	}
	public String getArCity() {
		return arCity;
	}
	
	public void setArCity(String arCity) {
		this.arCity = arCity;
	}
	public String getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(String dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public String getEstimedDepartureTime() {
		return estimedDepartureTime;
	}
	public void setEstimedDepartureTime(String estimedDepartureTime) {
		this.estimedDepartureTime = estimedDepartureTime;
	}
	@Override
	public String toString() {
		return "Flight [fNumber=" + fNumber + ", operAirline=" + operAirline + ", dCity=" + dCity + ", arCity=" + arCity
				+ ", dateOfDeparture=" + dateOfDeparture + ", estimedDepartureTime=" + estimedDepartureTime + "]";
	}

	public Flight(int id, String fNumber, String operAirline, String dCity, String arCity, String dateOfDeparture,
			String estimedDepartureTime) {
		super();
		this.id = id;
		this.fNumber = fNumber;
		this.operAirline = operAirline;
		this.dCity = dCity;
		this.arCity = arCity;
		this.dateOfDeparture = dateOfDeparture;
		this.estimedDepartureTime = estimedDepartureTime;
	}

	public Flight() {
		super();
	}


}
