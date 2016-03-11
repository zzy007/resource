package com.resource.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.resource.dao.ResourceDao;
import com.resource.dao.LikeDao;
import com.resource.model.User;
import com.resource.model.Like;
import com.opensymphony.xwork2.ActionSupport;

@Controller @Scope("prototype")
public class LikeAction extends ActionSupport {

    @Resource LikeDao likeDao;
    @Resource ResourceDao resourceDao;

	
	private Like like;
	private List<Like> likelist;
    private User user;
    private Resource resource;

	public Like getLike () 
	{
		return like;
	}
	public void setOrder(Like Like) 
	{
		this.like = like;
	}
	public List<Like> getLikelist() 
	{
		return likelist;
	}
	public void setLikelist(List<Like> likelist) 
	{
		this.likelist = likelist;
	}
	
	public String addLike()
	{
		Like ord =new Like();
		ord.setUser(user);
		ord.setResource(resource);
		likeDao.addLike(ord);
		return "show_like";
			
	}
	public String showLike()
	{
		
		System.out.println(user.getUsername());
        return "show_like";
	}
	public String deleteLike() throws Exception 
	{
		likeDao.deleteLike(like.getResource().name());
		return "show_like";
	}
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Resource getResources() {
		return resource;
	}

	public void setResources(Resource resource) {
		this.resource = resource;
	}
}
