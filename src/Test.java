import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import model.EventRic;
import service.Services;

public class Test {
	
	public static void main(String[] args){
		Services services = new Services();
		Map<Long,EventRic> events = services.getAllEvents();
		JSONObject json = new JSONObject(events);
		String jsonString = "{";
		
		for(long i:events.keySet()){
			jsonString += "\"event\":"+events.get(i).toJSON()+",";
		}
		jsonString = jsonString.substring(0,jsonString.length()-1);
		jsonString += "}";
		System.out.println(jsonString);
	}

}
