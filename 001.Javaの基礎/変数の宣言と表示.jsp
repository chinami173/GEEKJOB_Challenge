<%-- 
    Document   : java1
    Created on : 2018/05/13, 14:15:58
    Author     : chinami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        

        <%
        int age=100;
        String name="soeda";
        
         out.print("私の名前は菅原千波です");
         
        float point=0.8F;
        Float ap=age*point;
        
         out.print(ap);
        
        %>
    </body>
</html>
