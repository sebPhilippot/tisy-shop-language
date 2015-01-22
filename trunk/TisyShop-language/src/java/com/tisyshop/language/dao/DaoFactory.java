/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tisyshop.language.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author seb
 */
public class DaoFactory {
    static int choixBase = 1;

public static DaoUser createDAOTypeES(){
        DaoUser dao = null;
        switch(choixBase){
             case 1 :
                dao = new DaoPgSQLUser();
                break;

        }
         return dao;
    }

 public static Connection getConnection() throws Exception {
       Connection con = null;
        switch(choixBase){
             case 1 :
                con = getPostgreConnection();
                break;

        }
         return con;
    }

private static Connection getPostgreConnection()  throws Exception{
        Connection con = null;

	String driver = "org.postgresql.Driver";
	String url = "jdbc:postgresql://localhost:5433/tisyShop-language";
            try{
                    Class.forName(driver).newInstance();
                   con = DriverManager.getConnection(url, "root", "TisyShop");
                   // con = DriverManager.getConnection(url,"root","irghtdupain")  ;
                    System.out.println("Connection établie");
            }
            catch (IllegalAccessException e)
            {
            	e.printStackTrace();
            }
            catch (SQLException e1) 
            {
            	e1.printStackTrace();
            }
            catch (InstantiationException e) 
            {
            	
            }
            catch (ClassNotFoundException e)
            {
            	
            }
	return con;
 }
}