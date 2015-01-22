/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tisyshop.language.entity;

/**
 *
 * @author seb
 */
public class User {
    private int userID;
    private String username;
    private String language;
    private String languageLearning;
    private String userIP;
    private String sessionID;

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the languageLearning
     */
    public String getLanguageLearning() {
        return languageLearning;
    }

    /**
     * @param languageLearning the languageLearning to set
     */
    public void setLanguageLearning(String languageLearning) {
        this.languageLearning = languageLearning;
    }

    /**
     * @return the userIP
     */
    public String getUserIP() {
        return userIP;
    }

    /**
     * @param userIP the userIP to set
     */
    public void setUserIP(String userIP) {
        this.userIP = userIP;
    }

    /**
     * @return the sessionID
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * @param sessionID the sessionID to set
     */
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }
    
    
}
