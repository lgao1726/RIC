package dao;

import java.util.Map;

import XMLManager.LoginXMLManager;
import model.Admin;

public class UserDao {
	private LoginXMLManager manager;
	private Map<Long,Admin> users;
	
	
	public UserDao(){
		this.manager = LoginXMLManager.getInstance();
		users = manager.getUsers();
	}
	
	public Map<Long,Admin> getUsers() {
		return users;
	}

}
