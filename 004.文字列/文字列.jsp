<%-- 
    Document   : newjsp
    Created on : 2018/05/17, 13:08:31
    Author     : chinami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
   //「groove」「-」「gear」の３つの文字列を連結することで，「groove-gear」と画面に表示してください。
   
 final String NAME="groove";
 final String texit="-";
 String cheer ="gear";



out.print(NAME+texit+cheer);



%>