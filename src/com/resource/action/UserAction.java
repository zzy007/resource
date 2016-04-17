package com.resource.action;


import java.util.ArrayList;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.resource.dao.UserDao;
import com.resource.model.User;
import com.opensymphony.xwork2.ActionSupport;

@Controller @Scope("prototype")
public class UserAction extends ActionSupport implements SessionAware{
	@Resource UserDao userDao;
	
	private User user;
	private String errMessage;
	private Map<String,Object> session;
	private String prePage;
	
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getPrePage() {
		return prePage;
	}

	public void setPrePage(String prePage) {
		this.prePage = prePage;
	}

	public String getErrMessage() {
		return errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String reg( )throws Exception{
		userDao.AddUser(user);
		session.put("user",user);
		return "show_view";
	}
	public String login(){
		ArrayList<User> listUser =userDao.QueryUserInfo(user.getUsername());
		
		if(listUser.size()==0){
			this.errMessage = "�˺Ų�����";
			System.out.print(this.errMessage);
			return "input";
		}else{
			User db_user =listUser.get(0);
			 if(!db_user.getPassword().equals(user.getPassword())){
					this.errMessage="���벻��ȷ��";
					System.out.print(this.errMessage);
					return INPUT;
		     }else{
			    System.out.print(db_user.getUsername());
			    session.put("user", db_user);
			//prePage = (String)session.get("prePage");
			//System.out.println("��Ҫ������"+prePage);
			//session.remove("prePage");
			
			return"show_view";
		}
		}
	}
}
