package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.NewUser;

public interface NewUserService {
	void addNewUser(NewUser nu);

	List<NewUser> displayAll();


}
