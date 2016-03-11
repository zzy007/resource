package com.resource.action;

import java.util.List;

import javax.annotation.Resource;

import com.resource.model.User;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import com.resource.dao.UserDAO;

@Controller @Scope("prototype")
public class UserAction extends ActionSupport{
	
    @Resource UserDAO userDao;
    
    
    private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	private List<User> userList;
	
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
private String keyWords;
	
	public String getKeyWords() {
		return keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
	/*æ·»å?Food*/
	public String addUser() throws Exception{
		
		userDao.AddUser(user);
		return "message";
		
	}
	
	/*?¾ç¤º???Food*/
    public String showUser() {
        
    	userList = userDao.QueryAllUser();
        return "show_view";
    }
    public String showDetail() {
    	user = userDao.GetUserByName(user.getUsername());
        return "detail_view";
    }
    /*?¾ç¤ºfood??¿®?¹é¡¹*/
    public String showEdit() throws Exception {
    	user = userDao.GetUserByName(user.getUsername());
        return "edit_view";
    }
    /*ç¼??food*/
    public String editUser() throws Exception {
    	userDao.UpdateUser(user);
        return "edit_message";
    }
    
    /*???Food*/
    public String deleteUser() throws Exception {
    	userDao.DeleteUser(user.getUsername());
        return "delete_message";
    }
    /*?¥è?Food*/
    public String queryUsers() throws Exception {
    	userList = userDao.QueryUserInfo(keyWords);
        return "show_view";
    }
}
