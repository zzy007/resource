package com.resource.action;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport{
private String userName;
private String userPassword;
public String getUserName() {
   return userName;
}
public void setUserName(String userName) {
   this.userName = userName;
}
public String getUserPassword() {
   return userPassword;
}
public void setUserPassword(String userPassword) {
   this.userPassword = userPassword;

}
public String execute(){
   String page = "fail";
   boolean flag = false;
   if(flag){
    page = "success";
   }
   return page;
  }

}
