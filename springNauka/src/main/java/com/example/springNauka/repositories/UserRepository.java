package com.example.springNauka.repositories;

import com.example.springNauka.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
