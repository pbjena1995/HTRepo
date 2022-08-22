package com.ht.projectdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ht.projectdemo.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
