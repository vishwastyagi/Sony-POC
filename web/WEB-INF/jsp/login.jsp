<jsp:include page="header.jsp"/>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
<form:form  action="./loginform.htm" id="loginform"  commandName="login" >
 
<label id="usernameLabel">Enter UserName</label>&nbsp;&nbsp;<input name="username" id="username" type="text" size="20" maxlength="30"/>
<br /><br/>

<label id="passLabel">Enter Password</label>&nbsp; &nbsp;<input id="password" name="password" type="password" size="20" maxlength="40"/>
<br />
<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


<input type="submit" id="formsubmit" value="Login"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<input type="reset" id="reset" value="Reset"/>


</form:form>
<a href="./Register.htm">Register</a>
</div>
</body>
</html>

<jsp:include page="footer.jsp"/>