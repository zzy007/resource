package com.resource.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.resource.model.Log;

@Service @Transactional
public class LogDAO {
	@Resource SessionFactory factory;
	
    public  void AddLog(Log log) throws Exception {
    	Session s = factory.getCurrentSession();
    	s.save(log);
    }
    
    public void DeleteLog (Integer logId) throws Exception {
        Session s = factory.getCurrentSession(); 
        Object log = s.load(Log.class, logId);
        s.delete(log);
    }
    
    public void UpdateLog(Log log) throws Exception {
        Session s = factory.getCurrentSession();
        s.update(log);
    }
    
    public ArrayList<Log> QueryAllLog() {
        Session s = factory.getCurrentSession();
        String hql = "From Log";
        Query q = s.createQuery(hql);
        List logList = q.list();
        return (ArrayList<Log>) logList;
    }

    public Log GetLogById(Integer logid) {
        Session s = factory.getCurrentSession();
        Log log = (Log)s.get(Log.class, logid);
        return log;
    }
    
    public ArrayList<Log> QueryLogInfo(String filename) { 
    	Session s = factory.getCurrentSession();
    	String hql = "From Log log where 1=1";
    	if(!filename.equals("")) hql = hql + " and log.filename like '%" + filename + "%'";
    	Query q = s.createQuery(hql);
    	List logList = q.list();
    	return (ArrayList<Log>) logList;
    }

}