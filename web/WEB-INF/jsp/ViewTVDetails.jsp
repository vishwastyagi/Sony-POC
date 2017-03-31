<%-- 
    Document   : ViewTVDetails
    Created on : May 24, 2013, 12:14:10 AM
    Author     : vishwas
--%>
<jsp:include page="header.jsp"/>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.List,bean.TVDetailsBean"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <script type="text/javascript">
                function calprice()
                {
                    var price=document.getElementById("price").value;
                    var quantity=document.getElementById("quantity").value;
                    var v=confirm("Amount to be paid "+price*quantity);
                    return v;
                }
    
        </script>
        
    </head>
    <body>
        <div style="height: 500px;;margin-top: 11px;margin-bottom:10px;">
            <%
                if ((String) request.getAttribute("msg") != null) {
            %>
            <%=request.getAttribute("msg")%>
            <%
                }

            %>


            These are details
            <%
                List mylist = (List) request.getSession().getAttribute("myList");

                TVDetailsBean b1 = (TVDetailsBean) mylist.get(0);


            %>

            <form:form action="./buy.htm" commandName="buytv" onsubmit="return calprice(); "> 
                <table border="1" id="tvDescription">
                    <tr>
                        <td><th>ModelName</th></td> <td><input type="text" id="model" value="<%=b1.getModelname()%>"   disabled="true"> </td>                                                                                             
                    </tr>
                    <tr>
                        <td> <th>ScreenType</th></td> <td><input type="text" id="screen" value="<%=b1.getScreentype()%>"   disabled="true"></td>
                    </tr>

                    <tr>
                        <td> <th>3D support</th></td><td><input type="text" path="threed" value="<%=b1.getThreedsupport()%>"   disabled="true"></td> 
                    </tr>

                    <tr>
                        <td><th>Size</th></td><td><input type="text" id="size" value="<%=b1.getTvsize()%>"  disabled="true"></td> 
                    </tr>

                    <tr>
                        <td> <th>HighDefination</th></td><td><input type="text" id="highdefination" value="<%=b1.getHighdefination()%>"  disabled="true"></td>  
                    </tr>


                    <tr>
                        <td> <th>Price</th></td>   <td><input type="text" id="price" value="<%=b1.getPrice()%>"  disabled="true"></td> 
                    </tr>
                    <tr>
                        <td><th>No. Of Pieces</th></td> <td><input type="text" id="quantity" value="1" /></td>
                    </tr>
                    <tr>
                        <td></td><td><input type="submit" value="BUY"></td>
                    </tr>
                </table>

            </form:form>

            <br><br><br>
            <a href="./home.htm">Click here to get previous page</a>

        </div>
    </body>
</html>
<jsp:include page="footer.jsp"/>