package com.teksystems.casestudy.database.dao;

import com.teksystems.casestudy.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {

    User findByEmail(String email);

    List<User> findByFirstName(String firstName);

    List<User> findByFirstNameAndLastName(String firstName, String lastName);

    List<User> findByFirstNameContainsAndLastNameContains(String firstName, String lastName);


    @Query(value = "select u from User u where u.password = :password")
    List<User> getByPassword(@Param("password") String password);

}
