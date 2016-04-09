package com.resource.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.resource.dao.ResourceDao;

@Controller @Scope("prototype")
public class ResourceAction extends ActionSupport{
	@Resource ResourceDao resourceDao;
	private Resource resource;
	
	
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	private List<Resource> resourceList;
	public List<Resource> getResourceList() {
		return resourceList;
	}
	public void setResourceList(List<Resource> resourceList) {
		this.resourceList = resourceList;
	}
	
	
	public String addResource() throws Exception{
		resourceDao.AddResource(resource);
		return"message";
	}
	public String showResource(){
		resourceList=resourceDao.QueryAllResource();
		return"main_view";
	}

}
