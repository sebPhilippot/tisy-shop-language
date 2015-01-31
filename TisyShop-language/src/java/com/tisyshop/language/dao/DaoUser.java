/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tisyshop.language.dao;

import com.tisyshop.language.entity.User;

/**
 *
 * @author seb
 */
public interface DaoUser {
    public void insert(User u);
    public void delete(String session_id);
}
