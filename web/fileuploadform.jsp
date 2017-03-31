<%-- 
    Document   : fileuploadform
    Created on : May 27, 2013, 1:12:09 AM
    Author     : vishwas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form action="./fileuploadcontroller.htm" commandName="fileupload" enctype="multipart/form-data">
            <input type="file" name="file"/>
            <input type="submit" value="Upload"/>
        </form:form>
    </body>
</html>
