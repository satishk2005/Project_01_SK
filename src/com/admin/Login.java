package com.admin;

	import java.util.Map;  
	import org.apache.struts2.dispatcher.SessionMap;  
	import org.apache.struts2.interceptor.SessionAware;

import com.DAO.LoginDao;  
	  
public class Login {  
	private String username,userpass;  
	//SessionMap<String,String> sessionmap;  
	  
	public String getUsername() {  
	    return username;  
	}  
	  
	public void setUsername(String username) {  
	    this.username = username;  
	}  
	  
	public String getUserpass() {  
	    return userpass;  
	}  
	  
	public void setUserpass(String userpass) {  
	    this.userpass = userpass;  
	}  
	  
	public String execute(){  
	    if(LoginDao.validate(username, userpass)){  
	        return "success";  
	    }  
	    else{  
	        return "error";  
	    }  
	}  
	  
	/*public void setSession(Map map) {  
	    sessionmap=(SessionMap)map;  
	    sessionmap.put("login","true");  
	}  */
	  
	/*public String logout(){  
	    sessionmap.invalidate();  
	    return "success";  
	}  */
	  
	}  
