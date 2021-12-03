package com.testuser.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

import com.test.model.User;

public class ReadUsers {

	public static List<User> getUsers() {

		List<User> userList = new LinkedList<User>();

		try {
			File f = new File("shopmart-db-users.txt");
			if (f.exists()) {
				FileInputStream file = new FileInputStream("shopmart-db-users.txt");
				ObjectInputStream input = new ObjectInputStream(file);
				userList = (List<User>) input.readObject();
				input.close();
				file.close();
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return userList;
	}

}
