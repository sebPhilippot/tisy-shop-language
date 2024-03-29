<%@page import="com.tisyshop.language.dao.DaoPgSQLLanguage"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Bienvenue</title>
    <link rel="stylesheet" type="text/css" href="style/style.css" />
    <html:base/>
</head>

<!--La directive 'ng-app' permet de signaler à angularJS de démarrer la compilation sur un élément ciblé--> 
<body ng-app>
        <h1>[TisyShop-Language] Version de dev</h1>
        <html:form  action="/authentificationAction">
            
            <div class="form-group" />
            <label  for="Pseudo"><bean:message key="label.username"/></label>
                <html:text property="user.username" styleId="Pseudo"/>
             </div>
             
            <% DaoPgSQLLanguage language= new DaoPgSQLLanguage();
               ArrayList<String> myLanguages = new ArrayList<String>();
               myLanguages = language.getLanguage();
            %>
                
            <div class="form-group" />
                <label  for="Parle"><bean:message key="label.language"/></label>
                <html:select property="user.language" >
                <%
                for (int i=0; i < myLanguages.size(); i++){
                    %> 
                    <option> <% out.println(myLanguages.get(i)); %> </option>
                <%
                }
                %>
                </html:select>
            </div>
            
            <div class="form-group" />
                <label  for="Apprend"><bean:message key="label.languageLearning"/></label>
                <html:select property="user.language" >
                <%
                for (int i=0; i < myLanguages.size(); i++){
                    %> 
                    <option> <% out.println(myLanguages.get(i)); %> </option>
                <%
                }
                %>
               </html:select>
            </div>
            
            <div>
                <html:submit property="submit" value="Entrer"/>
            </div>
        </html:form>  
</body>

</html:html>
