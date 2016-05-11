package com.resource.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.resource.model.Like;
import com.resource.model.User;

@Service @Transactional      
public class LikeDao {
	@Resource SessionFactory factory;
	
	public void addLike(Like like)
	{
		Session s=factory.getCurrentSession();
		s.save(like);
	}
	public void deleteLike(String resourceName)
	{
		Session s=factory.getCurrentSession();
		Object like=s.load(Like.class, resourceName);
		s.delete(like);
	}
	public void updateLike(Like like)
	{
		Session s=factory.getCurrentSession();
		s.update(like);
	}
	
	public ArrayList<Like> queryOrderInfo(User user,Resource resource)
	 {
	    Session s = factory.getCurrentSession();
	   	String hql = "From Order order where 1=1";
	   	if(null != user && user.getUsername()!=null) 
	   		hql = hql + " and user.getUsername like '%" + user.getUsername()+ "%'";
	   	if(null != resource ) 
   		hql = hql + " and like.resources.resourcesname like '%" ;
	    Query q = s.createQuery(hql);
	   	List likeList = q.list();
	   	return (ArrayList<Like>) likeList; 	
	 }


	 
	@SuppressWarnings("unchecked")
	public ArrayList<Resource> QueryLikeInfo(String resourcename){
		Session s = factory.getCurrentSession();
		String hql = "From Resource resource where 1 = 1";
		if(!resourcename.equals(""))hql = hql+"and resource.resourcename like '%"+resourcename+"%'";
		Query q = s.createQuery(hql);
		List resourceList=q.list();
		return (ArrayList<Resource>) resourceList;
	}
}
