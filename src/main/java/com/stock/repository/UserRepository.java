package com.stock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stock.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	public List<User> findByCountry(String cname);
	public List<User> findByAge(Integer age);
	public List<User> findByAgeGreaterThanEqual(Integer age);
	public List<User> findByCountryIn(List<String> countries);
	//select *from user_master where user_country = 'India' and user_age = 25
    public List<User> findByCountryAndAge(String cname, Integer age);
	//select *from user_master where user_country = 'India' and user_age = 25 and user_gender = 'Male'
    public List<User> findByCountryOrAgeOrGender(String cname,Integer age,String gender);
   
    
    //Custom Queries
    @Query(value = "From User")
    public List<User> getAllUsersHql();
    @Query(value = "select * from user_master",nativeQuery = true)
    public List<User> getAllUsersSql();
    @Query(value = "From User where country =:cname")
    public List<User> getAllUsersByCountry(String cname);
    @Query(value = "From User where country =:cname and age= :age")
    public List<User> getAllUsersByCountryAndAge(String cname,Integer age);

}
