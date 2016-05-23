package com.res.model;

/**
 * Like entity. @author MyEclipse Persistence Tools
 */

public class Like implements java.io.Serializable {

	// Fields

	private LikeId id;
	private User user;
	private Res res;

	// Constructors

	/** default constructor */
	public Like() {
	}

	/** full constructor */
	public Like(LikeId id, User user, Res res) {
		this.id = id;
		this.user = user;
		this.res = res;
	}

	// Property accessors

	public LikeId getId() {
		return this.id;
	}

	public void setId(LikeId id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Res getRes() {
		return this.res;
	}

	public void setRes(Res res) {
		this.res = res;
	}

}