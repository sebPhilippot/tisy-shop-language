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
                <label  for="Pseudo">Pseudo</label>
                <html:text property="username" styleId="Pseudo"/>
             </div>
                
            <div class="form-group" />
                <label  for="Parle">Je parle</label>
                <select name="selectParle" id="parle" >
                    <option>France</option>
                    <option>Anglais</option>
                    <option>Espagnol</option>
                    <option>Allemand</option>
                </select>
            </div>
            
            <div class="form-group" />
                <label  for="Apprend">J'apprend</label>
                <select name="selectApprend" id="Apprend">
                    <option>France</option>
                    <option>Anglais</option>
                    <option>Espagnol</option>
                    <option>Allemand</option>
                </select>
            </div>
            
            <div>
                <html:submit property="submit" value="Entrer"/>
            </div>
        </html:form>  
</body>

</html:html>
