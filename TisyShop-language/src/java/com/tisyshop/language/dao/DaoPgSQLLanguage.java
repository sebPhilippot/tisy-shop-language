/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tisyshop.language.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author smo
 */
public class DaoPgSQLLanguage implements DaoLanguage {
    
    public void DaoPgSQLLanguage(){
        
    }
    
    @Override
    public ArrayList<String> getLanguage() {
         
        ArrayList<String> myLanguages = new ArrayList<String>();
        String req = "SELECT language FROM LANGUAGES;";
        Connection cnx;
        Statement state;
        ResultSet result;
              
        try {
            cnx = DaoFactory.getConnection();
            state = cnx.createStatement();
            result = state.executeQuery(req);
            ResultSetMetaData resultMeta = result.getMetaData();
            while (result.next()) {       
                myLanguages.add(result.getObject(1).toString());
            }    
            
            cnx.close();
            state.close();
            result.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        
        if (myLanguages.isEmpty()) {
            myLanguages.add("erreur chargement des languages");
        }
        
        return myLanguages;
                
    }
    
}
