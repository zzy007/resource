package com.resource.model;

/**
 * Like entity. @author MyEclipse Persistence Tools
 */

public class Like implements java.io.Serializable {

	// Fields

	private LikeId id;
	private User user;
	private Resource resource;

	// Constructors

	/** default constructor */
	public Like() {
	}

	/** full constructor */
	public Like(LikeId id, User user, Resource resource) {
		this.id = id;
		this.user = user;
		this.resource = resource;
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

	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

}