<%-- 
    Document   : home
    Created on : May 28, 2013, 1:04:40 PM
    Author     : VT108366
--%>
 <jsp:include page="header.jsp"/>

<%@page import="org.apache.derby.impl.sql.compile.CountAggregateDefinition"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="bean.TVDetailsBean,java.util.*"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="application/javascript">
           
            function addCart(x)
            {


            alert("Your Selected Model: "+x);
            window.location.href="./ViewTVDetails.htm?modelname="+x+"&pageid=home.jsp"
            }

        </script>
    </head>
   
    <body>

        
        <div style="height: 500px;;margin-top: 11px;margin-bottom:10px;">
        
        <%
            
            List<TVDetailsBean> l = (List<TVDetailsBean>) request.getServletContext().getAttribute("myList");
            Iterator itr = l.iterator();
            int flag = l.size(), count = 0;
        %>   
        <table border="1px" >
            <%
                while (flag-- > 0) {

            %>
            <tr>

                <%
                    while (itr.hasNext()) {
                        count++;
                %>
                <td>
                    <%
                        TVDetailsBean bean = (TVDetailsBean) itr.next();
                        count++;
                        String modelName=bean.getModelname();
                    %>
                    <img src="<%=bean.getImagelocation()%>" alt="Some Problem woth image" >
                    <br>
                    <input type="text" value="<%=bean.getModelname()%>" disabled="true" size="15"> &nbsp;&nbsp;&nbsp;
                    <input type="button" value="View Details" onclick="addCart('<%=modelName%>')" >

                </td>   
                <%
                        if (count == 3) {
                            count = 0;
                            break;
                        }

                    }
                %>
            </tr>
            <%
                }
            %>   

        </table>

        </div>
    </body>
   
</html>
 <jsp:include page="footer.jsp"/>
