package com.resource.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.resource.model.Like;
import com.opensymphony.xwork2.ActionSupport;
import com.resource.dao.LikeDao;
import com.resource.model.Like;

@Controller @Scope("prototype")
public class LikeAction extends ActionSupport{
	@Resource LikeDao likeDao;
	private Like like;
	public Like getLike() {
		return like;
	}
	public void setLike(Like like) {
		this.like = like;
	}
	private List<Like> likeList;
	public List<Like> getLikeList() {
		return likeList;
	}
	public void setLikeList(List<Like> likeList) {
		this.likeList = likeList;
	}
	public String addLike() throws Exception{
		likeDao.AddLike(like);
		return"message";
	}
	public String showLike(){
		likeList=likeDao.QueryAllLike();
		return"main_view";
	}
}
