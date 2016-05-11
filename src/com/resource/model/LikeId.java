package com.resource.model;

/**
 * LikeId entity. @author MyEclipse Persistence Tools
 */

public class LikeId implements java.io.Serializable {

	// Fields

	private User user;
	private Resource resource;

	// Constructors

	/** default constructor */
	public LikeId() {
	}

	/** full constructor */
	public LikeId(User user, Resource resource) {
		this.user = user;
		this.resource = resource;
	}

	// Property accessors

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Resource getresource() {
		return this.resource;
	}

	public void setresource(Resource resource) {
		this.resource = resource;
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
				&& ((this.getresource() == castOther.getresource()) || (this
						.getresource() != null
						&& castOther.getresource() != null && this
						.getresource().equals(castOther.getresource())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUser() == null ? 0 : this.getUser().hashCode());
		result = 37 * result
				+ (getresource() == null ? 0 : this.getresource().hashCode());
		return result;
	}

}