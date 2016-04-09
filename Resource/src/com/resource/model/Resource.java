package com.resource.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Resource entity. @author MyEclipse Persistence Tools
 */

public class Resource implements java.io.Serializable {

	// Fields

	private String resourcename;
	private User user;
	private String keyword;
	private String description;

    private String filepath;
	private Set likes = new HashSet(0);
	private Set likes_1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public Resource() {
	}

	/** minimal constructor */
	public Resource(User user, String keyword, String description,String filepath) {
		this.user = user;
		this.keyword = keyword;
		this.description = description;
		this.filepath = filepath;
	}

	/** full constructor */
	public Resource(User user, String keyword, String description,String filepath, Set likes,
			Set likes_1) {
		this.user = user;
		this.keyword = keyword;
		this.description = description;
		this.filepath = filepath;
		this.likes = likes;
		this.likes_1 = likes_1;
	}

	// Property accessors

	public String getResourcename() {
		return this.resourcename;
	}

	public void setResourcename(String resourcename) {
		this.resourcename = resourcename;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public Set getLikes() {
		return this.likes;
	}

	public void setLikes(Set likes) {
		this.likes = likes;
	}

	public Set getLikes_1() {
		return this.likes_1;
	}

	public void setLikes_1(Set likes_1) {
		this.likes_1 = likes_1;
	}

}