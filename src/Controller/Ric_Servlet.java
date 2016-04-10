package Controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import Actions.*;
import service.Services;
import model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;



/**
 * Servlet implementation class Ric_Servlet
 * @author lingfangao@hotmail.com
 */
@WebServlet("/Ric_Servlet")
public class Ric_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ric_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		String todo = request.getParameter("todo");
		String task = request.getParameter("task");
		if(todo.equals("standard")){			
			Action action = this.getAction(task);
			action.doAction(request);
			
			String view = this.setView(task);
			request.getRequestDispatcher(view).forward(request, response);	
		}else if(todo.equals("ajax")){
			if(task.equals("events")){
				Services services = new Services();
				Map<Long,EventRic> events = services.getAllEvents();
				JSONObject json = new JSONObject(events);
				//construct the json string for event list
				String jsonString = "{";
				
				for(long i:events.keySet()){
					jsonString += "\"event\":"+events.get(i).toJSON()+",";
				}
				jsonString = jsonString.substring(0,jsonString.length()-1);
				jsonString += "}";
			}else if(task.equals("login")){
				Services services = new Services();
				String user = request.getParameter("user");
				String password = request.getParameter("password");
				response.setContentType("text/xml");
			    response.setHeader("Cache-Control", "no-cache");
			    System.out.println(services.checkLogin(user, password));
			    response.getWriter().write(String.valueOf(services.checkLogin(user, password)));
			}
			
		}
		
	}
	
	private Action getAction(String task){
		Action action = null;
		switch(task){
			case "default" :{
				action = new DefaultAction();
				break;
			}
			
			case "about" :{
				action = new DefaultAction();				
				break;
			}
		}
		return action;
	}
	
	private String setView(String task){
		String view = "";
		switch(task){
			case "default" :{
				view = "default.jsp";
				break;
			}
			
			case "about" :{
				view = "about.jsp";
				break;
			}
			
		}
		return view;
	}	

}
