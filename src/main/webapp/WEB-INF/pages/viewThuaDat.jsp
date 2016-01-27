<%-- 
    Document   : viewThuaDat
    Created on : Jan 25, 2016, 5:11:33 PM
    Author     : cuongdx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Danh sách thửa đất:${lstThua.size()}</h1>
        <c:forEach items="${lstThua}" var="thua">
            <div>
                <span>${thua.ID}</span>
                <span>${thua.TENCHU}</span>
            </div>    
        </c:forEach>
    </body>
</html>
