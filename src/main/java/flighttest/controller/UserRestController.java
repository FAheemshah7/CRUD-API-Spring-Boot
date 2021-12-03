package flighttest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import flighttest.entity.User;
import flighttest.repository.UserRepo;

@RestController
@RequestMapping("User")
public class UserRestController {

	@Autowired
	UserRepo reposit;
	
	@CrossOrigin("*")
	@ResponseBody
	@GetMapping("/login/{email}&{pass}")
	public boolean getUser(@PathVariable("email") String email,@PathVariable("pass") String pass) {
		System.out.println(email);
		System.out.println(pass);		
		User user=reposit.findByEmail(email);
		if(user.getPass().equals(pass))
		{
		return true;
		}
		else{
		return false;
		}
	}
	@CrossOrigin("*")
	@ResponseBody
	@PostMapping("/loginUser")
	public int getUsser(@RequestParam("email") String email,@RequestParam("pass") String pass) {
		System.out.println(email);
		System.out.println(pass);		
		User user=reposit.findByEmail(email);
		if(user.getPass().equals(pass))
		{
			User user1=reposit.findByEmail(email);
			int id = user1.getId();
		return id;
		}
		else{
		return 0;
		}
	}
	
}