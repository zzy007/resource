package com.res.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.res.model.Res;


@Service @Transactional
public class ResDao {
	@Resource SessionFactory factory;
	
	//���
	public void AddRes(Res res)throws Exception{
		Session s=factory.getCurrentSession();
		s.save(res);
	}
	//ɾ��
	public void DeleteRes(String resName)throws Exception{
		Session s = factory.getCurrentSession();
		Object res = s.load(Res.class, resName);
		s.delete(res);
	}
	//�޸�
	public void UpdateRes(Res res)throws Exception{
		Session s = factory.getCurrentSession();
		s.update(res);
	}
	//��ѯ���е�all
	public ArrayList<Res> QueryAllRes(){
		Session s = factory.getCurrentSession();
		String hql="From Res";
		Query q =s.createQuery(hql);
		List resList = q.list();
		return (ArrayList<Res>) resList;
	}
	//����������ȡ
	public Res GetResByName(String resName){
		Session s = factory.getCurrentSession();
		Res res = (Res)s.get(Res.class,resName);
		return res;
	}
	//����������ѯ
	public ArrayList<Res> QueryResInfo(String resname){
		Session s = factory.getCurrentSession();
		String hql = "From Res res where 1 = 1";
		if(!resname.equals(""))hql = hql+"and res.resname res '%"+resname+"%'";
		Query q = s.createQuery(hql);
		List resList=q.list();
		return (ArrayList<Res>) resList;
	}
}