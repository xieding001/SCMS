package com.scms.dao;

import com.scms.model.Channel;

/**
 * Created by xieding001 on 2017/8/29.
 */

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class BaseDaoImpl<T> {
    private Logger log = LoggerFactory.getLogger(BaseDaoImpl.class);

    private Session session;
    private static final Configuration cfg = new Configuration();
    private static SessionFactory sessionFactory = null;
    private static final ThreadLocal threadLocal = new ThreadLocal();

    public Session getSession(){
        return null;
    }

    public BaseDaoImpl(){
        this.session = this.getSession();
    }

    public static Serializable save(Channel c) {
        Session session = (Session)threadLocal.get();
        if(session == null){
            if(sessionFactory == null){
                try{
                    cfg.configure("hibernate.cfg.xml");
                    sessionFactory = cfg.buildSessionFactory();
                }catch(HibernateException e){
                    System.out.println("Error Creating SessionFacotry.");
                    e.printStackTrace();
                }
            }
            session = sessionFactory.openSession();
            threadLocal.set(session);
        }
        return session.save(c);
    }




}

