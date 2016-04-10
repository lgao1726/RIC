package XMLManager;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import model.Admin;

public class LoginXMLManager {
	private DocumentBuilderFactory factory;
	private DocumentBuilder builder;
	private Document doc;
	
	private static LoginXMLManager manager = new LoginXMLManager("./data/Admin.xml");
	
	
	
	private LoginXMLManager(String file){
		init(file);		
	}
	
	public static LoginXMLManager getInstance(){
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
	
	public Map<Long,Admin> getUsers(){
		Map<Long, Admin> users = new HashMap<Long, Admin>();
		NodeList userList = doc.getElementsByTagName("User");
		for(int i=0;i<userList.getLength();i++){
			Element current = (Element) userList.item(i);
			
			String login = current.getElementsByTagName("Login").item(0).getTextContent();
			String password = current.getElementsByTagName("Password").item(0).getTextContent();
			long id = Integer.parseInt(current.getElementsByTagName("ID").item(0).getTextContent());
			
			Admin admin = new Admin(login,password);
			admin.setId(id);
			users.put(id,admin);
					
		}
		return users;
	}

}
