<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <src type="text/javascript" src="../js/angular.js"/>
        <title>Bienvenue</title>
        <html:base/>
    </head>
    
    <!--La directive 'ng-app' permet de signaler à angularJS de démarrer la compilation sur un élément ciblé--> 
    <body>
        Email: <input type="email" name="input"  required>
    </body>
    
</html:html>
