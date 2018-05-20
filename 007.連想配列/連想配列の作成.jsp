<%-- 
    Document   : 連想配列の作成
    Created on : 2018/05/20, 14:09:58
    Author     : chinami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="java.util.HashMap" %>

<%
//以下の順で、連想配列を作成してください。
//"1"に"AAA", "hello"に"world", "soeda"に"33", "20"に"20"
    
HashMap<String, String> data1 =new HashMap<String, String>();
HashMap<String, String> data2 =new HashMap<String, String>();
HashMap<String, String> data3 =new HashMap<String, String>();
HashMap<String, String> data4 =new HashMap<String, String>();


data1.put("1","AAA");
out.print("<br>");
data2.put("hello","world");
out.print("<br>");
data3.put("soeda","33");
out.print("<br>");
data4.put("20","20");

out.print("1");












%>
