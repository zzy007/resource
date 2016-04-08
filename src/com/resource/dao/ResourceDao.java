package com.resource.dao;

import java.util.ArrayList;
import java.util.List;
import com.resource.model.*;
import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service @Transactional
public class ResourceDao {
	@Resource SessionFactory factory;
	//���
/*	public void AddResource(Resource resource)throws Exception{
		Session s=factory.getCurrentSession();
		s.save(resource);
	}*/
	public void AddResource(Resource resource)throws Exception{
		Session s = factory.getCurrentSession();
		s.save(resource);
	}
	//ɾ��
	public void DeleteResource(String resourceName)throws Exception{
		Session s = factory.getCurrentSession();
		Object resource = s.load(Resource.class, resourceName);
		s.delete(resource);
	}
	//�޸�
	public void UpdateResource(Resource resource)throws Exception{
		Session s = factory.getCurrentSession();
		s.update(resource);
	}
	//��ѯ���е�all
	@SuppressWarnings("unchecked")
	public ArrayList<Resource> QueryAllResource(){
		Session s = factory.getCurrentSession();
		String hql="From Resource";
		Query q =s.createQuery(hql);
		List resourceList = q.list();
		return (ArrayList<Resource>) resourceList;
	}
	//����������ȡ
	public Resource GetResourceByName(String resourceName){
		Session s = factory.getCurrentSession();
		Resource resource = (Resource)s.get(Resource.class,resourceName);
		return resource;
	}
	//����������ѯ
	@SuppressWarnings("unchecked")
	public ArrayList<Resource> QueryResourceInfo(String resourcename){
		Session s = factory.getCurrentSession();
		String hql = "From Resource resource where 1 = 1";
		if(!resourcename.equals(""))hql = hql+"and resource.resourcename like '%"+resourcename+"%'";
		Query q = s.createQuery(hql);
		List resourceList=q.list();
		return (ArrayList<Resource>) resourceList;
	}
}