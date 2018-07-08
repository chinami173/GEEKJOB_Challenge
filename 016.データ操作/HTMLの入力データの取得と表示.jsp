<%-- 
    Document   : HTMLの入力データの取得と表示
    Created on : 2018/07/08, 14:14:33
    Author     : chinami
--%>

<%@page contentType="C:\Users\chinami\Documents\NetBeansProjects\Sample A\src\java\入力フィールド.html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    

        <%
        //課題「入力フィールド」で作成した HTML のフォームから値を送信し，サーブレットか JSP で受け取ってください。また，受け取った値を画面に表示してください。    
        //受け取るパラメータの文字コード
        request.setCharacterEncoding("UTF-8");
        //テキストボックスの情報
        out.print(request.getParameter("txtName"));
        out.print("<br>");
        //ラジオボタンの情報
        out.print(request.getParameter("rdoSample"));
        out.print("<br>");
 
        //テキストエリアの情報
        out.print(request.getParameter("mulText"));
        out.print("<br>");
        
        
        
        %>
 