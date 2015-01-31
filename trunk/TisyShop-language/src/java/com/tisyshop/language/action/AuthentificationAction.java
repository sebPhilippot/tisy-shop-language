/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tisyshop.language.action;

import com.tisyshop.language.dao.DaoFactory;
import com.tisyshop.language.dao.DaoUser;
import com.tisyshop.language.entity.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

/**
 *
 * @author seb
 */
public class AuthentificationAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        DynaActionForm authentificationDynaForm=(DynaActionForm) form;
        User user=(User) authentificationDynaForm.get("user");
        
        //Récupère l'adresse IP du client, lorsque celui-ci est derrière un proxy ce code récupère l'adresse du proxy
        //CF. X-Forwarded-For (XFF)“. -http://www.mkyong.com/java/how-to-get-client-ip-address-in-java/-
	String ipAddress = request.getRemoteAddr();  
        user.setUserIP(ipAddress);
        user.setSessionID(request.getSession().getId());
        DaoUser dao=DaoFactory.createDAOTypeES();
        dao.insert(user);
        return mapping.findForward(SUCCESS);
    }
}
