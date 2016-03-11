package com.resource.model;

/**
 * LikeId entity. @author MyEclipse Persistence Tools
 */

public class LikeId implements java.io.Serializable {

	// Fields

	private User user;
	private Resource resourec;

	// Constructors

	/** default constructor */
	public LikeId() {
	}

	/** full constructor */
	public LikeId(User user, Resource resourec) {
		this.user = user;
		this.resourec = resourec;
	}

	// Property accessors

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Resource getResourec() {
		return this.resourec;
	}

	public void setResourec(Resource resourec) {
		this.resourec = resourec;
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
				&& ((this.getResourec() == castOther.getResourec()) || (this
						.getResourec() != null
						&& castOther.getResourec() != null && this
						.getResourec().equals(castOther.getResourec())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUser() == null ? 0 : this.getUser().hashCode());
		result = 37 * result
				+ (getResourec() == null ? 0 : this.getResourec().hashCode());
		return result;
	}

}