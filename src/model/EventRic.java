package model;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EventRic {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String sport;
	private Calendar date;
	private String location;	

	public EventRic(String name, String sport, Calendar date, String location){
		this.name = name;
		this.sport = sport;
		this.date = date;
		this.location = location;
	}

	public void setId(long id){
		this.id = id;
	}
	
	public long id(){
		return this.id();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toJSON(){
		String json = null;
		json = ""
				+ "{\"name\":\""+this.name+"\","
				+ "\"location\":\""+this.location+"\","
				+ "\"sport\":\""+this.sport+"\""
				+ "\"id\":\""+this.id+"\""
				+ "}";
		
		return json;
	}
}
