package com.resource.model;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private String username;
	private String password;
	private Set records = new HashSet(0);
	private Set likes = new HashSet(0);
	private Set resourecs = new HashSet(0);
	private Set records_1 = new HashSet(0);
	private Set resourecs_1 = new HashSet(0);
	private Set likes_1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String password) {
		this.password = password;
	}

	/** full constructor */
	public User(String password, Set records, Set likes, Set resourecs,
			Set records_1, Set resourecs_1, Set likes_1) {
		this.password = password;
		this.records = records;
		this.likes = likes;
		this.resourecs = resourecs;
		this.records_1 = records_1;
		this.resourecs_1 = resourecs_1;
		this.likes_1 = likes_1;
	}

	// Property accessors

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set getRecords() {
		return this.records;
	}

	public void setRecords(Set records) {
		this.records = records;
	}

	public Set getLikes() {
		return this.likes;
	}

	public void setLikes(Set likes) {
		this.likes = likes;
	}

	public Set getResourecs() {
		return this.resourecs;
	}

	public void setResourecs(Set resourecs) {
		this.resourecs = resourecs;
	}

	public Set getRecords_1() {
		return this.records_1;
	}

	public void setRecords_1(Set records_1) {
		this.records_1 = records_1;
	}

	public Set getResourecs_1() {
		return this.resourecs_1;
	}

	public void setResourecs_1(Set resourecs_1) {
		this.resourecs_1 = resourecs_1;
	}

	public Set getLikes_1() {
		return this.likes_1;
	}

	public void setLikes_1(Set likes_1) {
		this.likes_1 = likes_1;
	}

}