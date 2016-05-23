package com.res.model;

/**
 * LikeId entity. @author MyEclipse Persistence Tools
 */

public class LikeId implements java.io.Serializable {

	// Fields

	private User user;
	private Res res;

	// Constructors

	/** default constructor */
	public LikeId() {
	}

	/** full constructor */
	public LikeId(User user, Res res) {
		this.user = user;
		this.res = res;
	}

	// Property accessors

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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LikeId))
			return false;
		LikeId castOther = (LikeId) other;

		return ((this.getUser() == castOther.getUser()) || (this.getUser() != null
				&& castOther.getUser() != null && this.getUser().equals(
				castOther.getUser())))
				&& ((this.getRes() == castOther.getRes()) || (this.getRes() != null
						&& castOther.getRes() != null && this.getRes().equals(
						castOther.getRes())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUser() == null ? 0 : this.getUser().hashCode());
		result = 37 * result
				+ (getRes() == null ? 0 : this.getRes().hashCode());
		return result;
	}

}