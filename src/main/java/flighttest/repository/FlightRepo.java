package flighttest.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import flighttest.entity.Flight;



public interface FlightRepo extends JpaRepository<Flight, Integer> {

	//Flight saveAll(String fNumber, String operAirline, String dCity, String arCity, String dateOfDeparture,
		//	String estimedDepartureTime);

	//@Query(value="INSERT INTO `t_flight` t  where t.fNumber=:fNumber  ,t.operAirline=:operAirline, t.dCity= :dCity, t.arCity=:arCity, t.dateOfDeparture=:dateOfDeparture, t.estimedDepartureTime=:estimedDepartureTime) )",nativeQuery=true)
	//@Query("INSERT INTO `t_flight`(`f_number`, `opr_airline`, `departure_city`, `arrival_city`, `date_of_departure`, `es_departure_time`) VALUES ('fNumber','operAirline','dCity','arCity','dateOfDeparture','estimedDepartureTime')")
	//Flight save( String fNumber,String operAirline, String dCity, String arCity,String dateOfDeparture,String estimedDepartureTime);

	//void saveAll(Object setfNumber);
	
}
