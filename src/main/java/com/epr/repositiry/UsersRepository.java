package com.epr.repositiry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epr.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	Optional<Users> findByUsername(String username);
}
