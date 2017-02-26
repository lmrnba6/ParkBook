package com.riadh.parkbook.dao;

import com.riadh.parkbook.genric.Executer;
import com.riadh.parkbook.model.User;

public interface UserDAO extends Executer<User> {

	public boolean checkLogin(String userName, String userPassword);

}
