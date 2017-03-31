<%-- 
    Document   : Register
    Created on : May 26, 2013, 12:26:58 PM
    Author     : vishwas
--%>
<jsp:include page="header.jsp"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
           
            function validate()
            {
                var abc=/^\d{10}$/;
		var ck_name = /^[A-Za-z ]{3,20}$/;
		var ck_password=/^[A-Za-z0-9!@#$%^&*()_]{6,20}$/;
		var ck_username=/^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
                if(document.forms["registerform"]["name"].value==""||document.forms["registerform"]["name"].value.search(ck_name)==-1)
                    {
                        alert("name")
			return false;
                    }
		if(document.forms["registerform"]["username"].value=="" || document.forms["registerform"]["username"].value.search(ck_username)==-1)
			{
				alert("username number is wrong");
				return false;
			}
		if(document.forms["registerform"]["password"].value=="" || document.forms["registerform"]["password"].value.search(ck_password)==-1)
		{
			alert("password is wrong");
				return false;
		}
		if(document.forms["registerform"]["retypePassword"].value=="" || document.forms["registerform"]["retypePassword"].value!=document.forms
["registerform"]["password"].value)
		{
			alert("retype password is wrong");
				return false;
		}
		
                    if(document.forms["registerform"]["phoneno"].value=="" || document.forms["registerform"]["phoneno"].value.search(abc)==-1)
			{
				alert("phone number is wrong");
				return false;
			}
			
                        
                
                return true;
            }
            
        
            
        </script>
    </head>
    <body>
            <div style="height: 500px;;margin-top: 11px;margin-bottom:10px;">
        <form:form  action="./registerform.htm" name="registerform"  commandName="registerBean" onsubmit="return validate()">
        
            Enter Full Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;<input type="text" size="50" name="name"  /><br/><br/>
            Enter Email-Id(Username)&nbsp;&nbsp;&nbsp; &nbsp;<input type="text"  size="50" name="username"/><br/>&nbsp;<br/>
            Enter Password &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input  type="password"  size="50" name="password"/><br/><br/>
            Re-type password &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;<input type="password" size="50" name="retypePassword"/><br/><br/>
            Enter Phone Number &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;<input tyep="text" size="10" name="phoneno"/><br/><br/>
            
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            
            <input type="submit" value="Submit"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="Reset"/>
                

            
        </form:form>
            </div>
    </body>
</html>
<jsp:include page="footer.jsp"/>