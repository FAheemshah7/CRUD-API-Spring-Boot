package flighttest.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import flighttest.entity.User;


public interface UserRepo extends JpaRepository<User, Integer>{

	User findByEmailAndPass(String email,String pass);

	User findByEmail(String email);

}
