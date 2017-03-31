<%-- 
    Document   : addTv
    Created on : May 27, 2013, 12:07:41 AM
    Author     : vishwas
--%>
<jsp:include page="header.jsp"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <script type="text/javascript">
            function validate()
            {
                alert("validate called");
                var tv_size = /^\d{1,3}$/;
                var ck_price = /^\d{4,10}$/;
                var ck_name = /^[A-Za-z0-9]{3,20}$/;

                if (document.forms["addtvform"]["modelname"].value == "" || document.forms["addtvform"]["modelname"].value.search(ck_name) == -1)
                {
                    alert("modelname")
                    return false;
                }


                if (document.forms["addtvform"]["tvsize"].value == "" || document.forms["addtvform"]["tvsize"].value.search(tv_size) == -1)
                {
                    alert("phone number is wrong");
                    return false;
                }

                if (document.forms["addtvform"]["price"].value == "" || document.forms["addtvform"]["price"].value.search(ck_price) == -1)
                {
                    alert("price number is wrong");
                    return false;
                }



                return true;
            }

        </script>

    </head>
    <body>
        <div style="height: 500px;;margin-top: 11px;margin-bottom:10px;">
            <form:form action="./addtvform.htm" name="addtvform" commandName="addTvForm" enctype="multipart/form-data">
                Enter Model Name &nbsp;&nbsp;&nbsp;&nbsp; &nbsp; <input type="text" size="20" name="modelname"/><br/><br/>
                Screen Type &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select name="screentype">
                    <option value="LED" selected="LED">LED</option>
                    <option value="CRT">CRT</option>
                    <option value="TFT">TFT</option>
                </select>
                <br/><br/>
                3D Support &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select name="threedsupport">
                    <option value="true">true</option>
                    <option value="false">false</option>

                </select>
                <br/>&nbsp;<br/>
                TV Size &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; <input type="text" size="20" name="tvsize" size="10" maxlength="4" /><br/><br/>
                HighDefinnation &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; <select name="highdefination">
                    <option value="Yes">Yes</option>
                    <option value="No">No</option>
                </select>

                <br/><br/>
                Price &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; <input type="text" size="20" name="price"/>
                <br/><br/>
                Upload Image&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="file" name="file"/><br/><br/><br/>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" value="Submit"/>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;<input type="reset" value="Reset">


            </form:form>
        </div>
    </body>
</html>
<jsp:include page="footer.jsp"/>
