package service;

import java.util.List;
import java.util.Map;

import dao.EventDao;
import dao.UserDao;
import model.Admin;
import model.EventRic;

public class Services {
	private EventDao eventDao;
	private UserDao userDao;
	
	public Services(){
		eventDao = new EventDao();
		userDao = new UserDao();
	}
	
	public Map<Long,EventRic> getAllEvents(){
		return eventDao.getEvents();
	}
	
	public int checkLogin(String user, String password){
		Map<Long,Admin> users = userDao.getUsers();
		int verified = -1;
		for(long i : users.keySet()){
			if(user.equals(users.get(i).getLogin()) &&
					password.equals(users.get(i).getPassword())){
				verified = 1;
				break;
			}
		}
		return verified;
	}
	
	
}
