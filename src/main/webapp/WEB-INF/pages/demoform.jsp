<%-- 
    Document   : demoform
    Created on : Dec 4, 2015, 5:27:12 PM
    Author     : cuongdx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            .error{
                color: red;
            }
        </style>
    </head>
    <body>
        <h1>thua dat </h1>
        <form:form action="/mavenSpringGis/addThuaDat" method="post" modelAttribute="objThuaDat">
            <label for="nameInput">SHBanDo: </label>
            <form:input path="SHBANDO" id="nameInput" />
            <form:errors path="SHBANDO" cssClass="error"/>
            <br/>

            <label for="ageInput">SHThua: </label>
            <form:input path="SHTHUA" id="ageInput" />
            <form:errors path="SHTHUA" cssClass="error"/>
            <br/>

            <input type="submit" value="Add" />
        </form:form>
    </body>
</html>
