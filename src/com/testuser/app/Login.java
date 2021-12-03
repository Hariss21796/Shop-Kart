package com.testuser.app;

import java.util.List;

import com.test.model.User;

public class Login {

	public static boolean login(User user) {
		List<User> userList = ReadUsers.getUsers();

		int match = 0;
		for (User userLog : userList) {
			if (user.getUserNmae().equals(userLog.getUserNmae()) && user.getPassword().equals(userLog.getPassword())) {
				System.out.println(" <<< Login Successfull! >>> ");

				match++;
				return true;
			}
		}
		if (match == 0) {
			System.out.println(" <<< Login Failed! >>> ");
		}
		return false;
	}

}
