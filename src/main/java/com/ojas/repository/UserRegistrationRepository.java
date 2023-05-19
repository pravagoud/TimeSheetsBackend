package com.ojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.entity.UserRegistration;
@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Integer> {

	UserRegistration findByEmailAndPassword(String email, String password);

}
