package XMLManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import model.EventRic;

public class EventXMLManager {
	
	private DocumentBuilderFactory factory;
	private DocumentBuilder builder;
	private Document doc;
	
	private static EventXMLManager manager = new EventXMLManager("./data/Events.xml");
	
	
	
	private EventXMLManager(String file){
		init(file);		
	}
	
	public static EventXMLManager getInstance(){
		return manager;
	}
	
	private void init(String file){
		factory = DocumentBuilderFactory.newInstance();
		try {
			builder = factory.newDocumentBuilder();
			doc = builder.parse(file);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		} catch (SAXException e){
			e.printStackTrace();
		}
	}
	
	public Map<Long,EventRic> getEvents(){
		Map<Long, EventRic> events = new HashMap<Long, EventRic>();
		NodeList eventList = doc.getElementsByTagName("Event");
		for(int i=0;i<eventList.getLength();i++){
			Element current = (Element) eventList.item(i);
			
			String name = current.getElementsByTagName("Name").item(0).getTextContent();
			String sport = current.getElementsByTagName("Sport").item(0).getTextContent();
			String location = current.getElementsByTagName("Location").item(0).getTextContent();
			long id = Integer.parseInt(current.getElementsByTagName("ID").item(0).getTextContent());
			Calendar date = Calendar.getInstance();
			date.set(Calendar.YEAR,Integer.parseInt(current.getElementsByTagName("Year").item(0).getTextContent()));
			date.set(Calendar.MONTH,Integer.parseInt(current.getElementsByTagName("Month").item(0).getTextContent()));
			date.set(Calendar.DAY_OF_MONTH,Integer.parseInt(current.getElementsByTagName("Day").item(0).getTextContent()));
			
			EventRic event = new EventRic(name,sport,date,location);
			event.setId(id);
			events.put(id,event);
					
		}
		return events;
	}
	
	public void addEvent(EventRic event){
		Element docElement = doc.getDocumentElement();
		Element newEvent = doc.createElement("Event");
		
		Element newEventName = doc.createElement("Name");
		Element newEventSport = doc.createElement("Sport");
		Element newEventLocation = doc.createElement("location");
		Element newEventYear = doc.createElement("Year");
		Element newEventMonth = doc.createElement("Month");
		Element newEventDay = doc.createElement("Day");
		
		newEventName.setTextContent(event.getName());
		newEventSport.setTextContent(event.getSport());
		newEventLocation.setTextContent(event.getLocation());
		newEventYear.setTextContent(String.valueOf(event.getDate().YEAR));
		newEventMonth.setTextContent(String.valueOf(event.getDate().MONTH));
		newEventDay.setTextContent(String.valueOf(event.getDate().DAY_OF_MONTH));
		
		newEvent.appendChild(newEventName);
		newEvent.appendChild(newEventSport);
		newEvent.appendChild(newEventLocation);
		newEvent.appendChild(newEventYear);
		newEvent.appendChild(newEventMonth);
		newEvent.appendChild(newEventDay);
		
		docElement.appendChild(newEvent);
	}

}
