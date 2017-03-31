<%-- 
    Document   : adminhome
    Created on : May 26, 2013, 7:44:26 PM
    Author     : vishwas
--%>
<jsp:include page="header.jsp"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
           <div style="height: 500px;;margin-top: 11px;margin-bottom:10px;">
        <%
        if((String)request.getAttribute("msg")!=null)
        {
            %>
            <%=request.getAttribute("msg") %>
            <%
        }
        
        %>
        <br/><br/>
        <a href="./addtv.htm">Add TV</a> <br/><br/>
        <a href="./Register.htm">Add Admin</a> <br/><br/>
        <a href="./home.htm">Go to Home</a>
           </div>
    </body>
    
</html>
<jsp:include page="footer.jsp"/>