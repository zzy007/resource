package com.res.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.res.model.Like;

@Service @Transactional
public class LikeDao {
	@Resource SessionFactory factory;
	
	//添加
	public void AddLike(Like like)throws Exception{
		Session s=factory.getCurrentSession();
		s.save(like);
	}
	//删除
	public void DeleteLike(Integer likeId)throws Exception{
		Session s = factory.getCurrentSession();
		Object like = s.load(Like.class, likeId);
		s.delete(like);
	}
	//修改
	public void UpdateLike(Like like)throws Exception{
		Session s = factory.getCurrentSession();
		s.update(like);
	}
	//查询所有的all
	public ArrayList<Like> QueryAllLike(){
		Session s = factory.getCurrentSession();
		String hql="From Like";
		Query q =s.createQuery(hql);
		List likeList = q.list();
		return (ArrayList<Like>) likeList;
	}
	//根据主键获取
	public Like GetLikeById(Integer likeid){
		Session s = factory.getCurrentSession();
		Like like = (Like )s.get(Like.class,likeid);
		return like;
	}
	//根据条件查询
	public ArrayList<Like> QueryLikeInfo(String likename){
		Session s = factory.getCurrentSession();
		String hql = "From Like like where 1 = 1";
		if(!likename.equals(""))hql = hql+"and like.likename like '%"+likename+"%'";
		Query q = s.createQuery(hql);
		List likeList=q.list();
		return (ArrayList<Like>) likeList;
	}
}