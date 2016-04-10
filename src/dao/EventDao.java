package dao;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import XMLManager.EventXMLManager;
import model.EventRic;

public class EventDao{
	private EventXMLManager manager;
	private Map<Long,EventRic> events;
	
	
	public EventDao(){
		this.manager = EventXMLManager.getInstance();
		events = manager.getEvents();
	}
	
	public Map<Long,EventRic> getEvents() {
		return events;
	}

}