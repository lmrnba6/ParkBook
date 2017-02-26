package com.riadh.parkbook.service;

import com.riadh.parkbook.genric.Executer;
import com.riadh.parkbook.model.User;

public interface UserService extends Executer<User> {

	public boolean checkLogin(String userName, String userPassword);

}
