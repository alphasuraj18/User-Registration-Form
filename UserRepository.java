package com.becoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prog.entity.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {

	

}
