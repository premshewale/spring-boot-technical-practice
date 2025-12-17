package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.NewUser;

public interface NewUserDAO extends JpaRepository<NewUser, Integer>{

}
