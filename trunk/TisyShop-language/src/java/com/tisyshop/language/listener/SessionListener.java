/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tisyshop.language.listener;

import com.tisyshop.language.dao.DaoFactory;
import com.tisyshop.language.dao.DaoUser;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author seb
 */
public class SessionListener implements HttpSessionListener{

    @Override
    public void sessionCreated(HttpSessionEvent se) {
       System.out.println("Session créée "+se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
         
       DaoUser dao= DaoFactory.createDAOTypeES();
       dao.delete(se.getSession().getId());
    }
    
}
