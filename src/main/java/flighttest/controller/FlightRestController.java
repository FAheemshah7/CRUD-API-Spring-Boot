package flighttest.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import flighttest.entity.Flight;
import flighttest.repository.FlightRepo;


@RestController
@RequestMapping("Flight")
public class FlightRestController {
	@Autowired
	FlightRepo repository;
	
	@CrossOrigin("*")
	@ResponseBody
	@GetMapping("getAll")
	public List<Flight> getAllLocation(){	
		return repository.findAll();
	}
	
	@CrossOrigin("*")
	@ResponseBody
	@PostMapping("/saveData")
	public int addData(@RequestParam("fNumber") String fNumber,@RequestParam("operAirline") String operAirline,@RequestParam("dCity") String dCity,@RequestParam("arCity") String arCity,@RequestParam("dateOfDeparture") String dateOfDeparture,@RequestParam("estimedDepartureTime") String estimedDepartureTime) {
		System.out.println(fNumber);
		System.out.println(operAirline);		
		System.out.println(dCity);
		System.out.println(arCity);
		System.out.println(dateOfDeparture);
		System.out.println(estimedDepartureTime);
	
		Flight flight = new Flight();
		flight.setfNumber(fNumber);
		flight.setOperAirline(operAirline);
		flight.setdCity(dCity);
		flight.setArCity(arCity);
		flight.setDateOfDeparture(dateOfDeparture);
		flight.setEstimedDepartureTime(estimedDepartureTime);
		
		Flight save = repository.save(flight);
		int id = save.getId();
		System.out.println(id);		
	
		return id;
			}
	
	
	@CrossOrigin("*")
	@ResponseBody
	@GetMapping("/getById/{id}")
	public Optional<Flight> getRecordById(@PathVariable("id") int id) { 
		return repository.findById(id);
	}
	
	
	@CrossOrigin("*")
	@ResponseBody
	@DeleteMapping("/del/{id}")
	public String deleteRecord(@PathVariable("id") int id) {
		repository.deleteById(id);
		return "Data Deleted Successfully";
	}
	@CrossOrigin("*")
	@ResponseBody
	@PostMapping("/updateData/")
	public int updateData(@RequestParam("id")int id,@RequestParam("fNumber") String fNumber,@RequestParam("operAirline") String operAirline,@RequestParam("dCity") String dCity,@RequestParam("arCity") String arCity,@RequestParam("dateOfDeparture") String dateOfDeparture,@RequestParam("estimedDepartureTime") String estimedDepartureTime) { 
		Optional<Flight> byId = repository.findById(id);
		
		System.out.println("--------------------Previous Values--------------------");
		System.out.println(fNumber);
		System.out.println(operAirline);		
		System.out.println(dCity);
		System.out.println(arCity);
		System.out.println(dateOfDeparture);
		System.out.println(estimedDepartureTime);

		Flight flight = byId.get();
		flight.setfNumber(fNumber);
		flight.setOperAirline(operAirline);
		flight.setdCity(dCity);
		flight.setArCity(arCity);
		flight.setDateOfDeparture(dateOfDeparture);
		flight.setEstimedDepartureTime(estimedDepartureTime);
		
		System.out.println("------------------After Updating Values-----------------");
		System.out.println(flight.getfNumber());
		System.out.println(flight.getOperAirline());		
		System.out.println(flight.getdCity());
		System.out.println(flight.getArCity());
		System.out.println(flight.getDateOfDeparture());
		System.out.println(flight.getEstimedDepartureTime());
		
		repository.save(flight);
		
		return id;
			}
		
}
