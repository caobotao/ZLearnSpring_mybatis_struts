package com.cbt.action;

import java.util.List;

import com.cbt.entity.User;
import com.cbt.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
    private static final long serialVersionUID = 1L;
    
    private List<User> list;
    private UserService userService;
    
    public String list(){
	list = userService.getAll();
	return "list";
    }
    
    public List<User> getList() {
        return list;
    }
    public void setList(List<User> list) {
        this.list = list;
    }
    public UserService getUserService() {
        return userService;
    }
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
}
