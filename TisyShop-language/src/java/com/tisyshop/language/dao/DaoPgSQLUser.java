/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tisyshop.language.dao;

import com.tisyshop.language.entity.User;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author seb
 */
public class DaoPgSQLUser implements DaoUser{

    @Override
    public void insert(User u) {
       String req="INSERT INTO users(username,language, language_learning,session_id, user_ip,date)" +
                                    "VALUES (?, ?, ?, ?,?,NOW());";
       
                Connection cnx = null;
		boolean autoCommitDefault=true;
		try
		{
                        cnx = DaoFactory.getConnection();
			autoCommitDefault= cnx.getAutoCommit();
			cnx.setAutoCommit(false);
			java.sql.PreparedStatement s = cnx.prepareStatement(req);
                        s.setString(1, u.getUsername());
			s.setString(2, u.getLanguage());
                        s.setString(3,u.getLanguageLearning());
                        s.setString(4,u.getSessionID());
                        s.setString(5, u.getUserIP());
                        s.executeUpdate();
                        cnx.commit();
		} 
		
		
		catch (SQLException sqlErrors)
		{
			try
			{
			    cnx.rollback();
			} catch (SQLException e)
			{
			    e.printStackTrace();
			}
			sqlErrors.printStackTrace();
		} catch (Exception e)
		{
			try
			{
                            cnx.rollback();
			} catch (SQLException se)
			{
				
                            se.printStackTrace();
			}
			e.printStackTrace();
		} finally
		{
			try
			{
                            cnx.setAutoCommit(autoCommitDefault);
                            cnx.close();
			} catch (Exception e)
			{
                            e.printStackTrace();
			}
		}
    }

    @Override
    public void delete(String session_id) {
        String req="delete from users where session_id =?";
         Connection cnx = null;
		boolean autoCommitDefault=true;
		try
		{
                        cnx = DaoFactory.getConnection();
			autoCommitDefault= cnx.getAutoCommit();
			cnx.setAutoCommit(false);
			java.sql.PreparedStatement s = cnx.prepareStatement(req);
                        s.setString(1, session_id);
			s.executeUpdate();
                        cnx.commit();
		} 
		
		
		catch (SQLException sqlErrors)
		{
			try
			{
			    cnx.rollback();
			} catch (SQLException e)
			{
			    e.printStackTrace();
			}
			sqlErrors.printStackTrace();
		} catch (Exception e)
		{
			try
			{
                            cnx.rollback();
			} catch (SQLException se)
			{
				
                            se.printStackTrace();
			}
			e.printStackTrace();
		} finally
		{
			try
			{
                            cnx.setAutoCommit(autoCommitDefault);
                            cnx.close();
			} catch (Exception e)
			{
                            e.printStackTrace();
			}
		}
    }
    
}
