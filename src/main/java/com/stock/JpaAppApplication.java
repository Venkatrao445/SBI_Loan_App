package com.stock;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.stock.entity.User;
import com.stock.repository.UserRepository;

@SpringBootApplication
public class JpaAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaAppApplication.class, args);
		UserRepository repo = context.getBean(UserRepository.class);
//		User u1 = new User(101, "Ramu" , "Male" , 24 , "India");
//		//repo.save(u1);
//		User u2 = new User(102, "Bheem" , "Male" , 22 , "Us");
//
//		repo.saveAll(Arrays.asList(u1,u2));
//	    Optional<User> findById = repo.findById(102);	
//	    if(findById.isPresent()) {
//	    	System.out.println(findById.get());
//	    }
//	    List<User> findAllById = repo.findAllById(Arrays.asList(101,102));
//	    findAllById.forEach(user -> {
//	    	System.out.println(user);
//	    });
//		List<User> findAll = repo.findAll();
//		findAll.forEach(user -> {
//			System.out.println(user);
//		});
//		long count = repo.count();
//		System.out.println("Total records are: " +count);
//		boolean existsById = repo.existsById(101);
//		System.out.println("Record Presemce with id : 101 " +existsById);
//		List<User> findByCountry = repo.findByCountry("India");
//		findByCountry.forEach(user -> {
//			System.out.println(user);
//			
//		});
//		List<User> findByAge = repo.findByAge(24);
//		findByAge.forEach(user -> {
//			System.out.println(user);
//		});
//		List<User> equal = repo.findByAgeGreaterThanEqual(22);
//		equal.forEach(user -> System.out.println(user));
//		List<User> countryIn = repo.findByCountryIn(Arrays.asList("India" , "Us"));
//		countryIn.forEach(user -> System.out.println(user));
//		List<User> countryAndAge = repo.findByCountryAndAge("India", 24);
//		countryAndAge.forEach(user -> {
//			System.out.println(user);
//		});
//		List<User> countryAndAgeAndGender = repo.findByCountryOrAgeOrGender("India", 22, "Male");
//		countryAndAgeAndGender.forEach(user -> {
//			System.out.println(user);
//		});
//		List<User> users = repo.getAllUsersHql();
//		users.forEach(user -> {
//			System.out.println(user);
//		});
//		List<User> allUsersByCountry = repo.getAllUsersByCountry("India");
//		allUsersByCountry.forEach(user -> {
//			System.out.println(user);
//		});
		List<User> allUsersByCountryAndAge = repo.getAllUsersByCountryAndAge("Us",22);
		allUsersByCountryAndAge.forEach(user -> {
			System.out.println(user);
		});

	}

}
