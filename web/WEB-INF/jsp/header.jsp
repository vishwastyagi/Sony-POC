

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            
            function login()
            {
                 window.location.href="./login.htm";
            }
            
            function logout()
            {
                window.location.href="./logout.htm";
            }
            function homclicked()
            {
                window.location.href="./homeClicked.htm";
            }
            

            
        </script>
   <style type="text/css">
.style1 {
	font-size: medium;
     
}
.style2 {
	font-size: x-large;
	font-family: "Times New Roman", Times, serif;
	font-weight: bold;
}
.newStyle1 {
	background-color: #FFFFCC;
	
	margin: 0px;
    
    border: 0px;
    
    margin:-11px;
	
}
</style>
</head>

<body>

<div class="newStyle1">

<center class="style2" >Welcome</center>

<div style="width:58%;text-align:right;display:inline-block;position:relative " class="style2">Sony World</div>
<div  id="username" style="width:39%;text-align:right;display:inline-block;position:relative" class="style2">
    <%
       if(request.getSession().getAttribute("username")!=null)
       {
           out.println(""+request.getSession().getAttribute("username"));
       }
    %>
    
</div>

<div style="width:100%;position:relative">
<div style="text-align:right;width:62%;display:inline-block;margin-top:0px;float:left;position:relative" class="style1">
	make.believe</div>
<div style="width:37%;display:inline-block;height:45px;position:relative">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" value="Home" onclick="homclicked();"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" value="SignIn" onclick="login();"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<%
       if(request.getSession().getAttribute("username")!=null)
       {
           
 %>
 <input type="button" value="SignOut" onclick="logout();"/>
<%
       }
%>
<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="./Register.htm">Register</a>
</div>
</div>


</div>

</body>

</html>
