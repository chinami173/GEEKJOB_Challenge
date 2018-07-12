<%-- 
    Document   : クエストリングの利用jsp
    Created on : 2018/07/10, 13:55:36
    Author     : chinami
--%>
<%--
以下の仕様を全て満たすプログラミングを作成してください。
■入力画面
・query_string_input.jsp ... フォームでの入力処理をします
▼フォームで入力できる値
・total ... 購入した商品の総額
・count ... 購入した商品の数量
・type ... 商品種別
（type の数値は， 1 が「雑貨」，2 が「生鮮食品」， 3 が「その他」になります）
※GETでデータを送信する様にしましょう。

--%>
<%@page contentType="query_string_output.jsp" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="query_string_output.jsp; charset=UTF-8">
        <title>クエストリングの利用</title>
    </head>
    
    <body>
        <form action="query_string_output.jsp" method="get">
        <label>商品</label>
            <select name="se">
                <option value="1">雑貨</option>
                <option value="2">生鮮食品</option>
                <option value="3">その他</option>
            </select><br>
        
        <label>総額</label>
            <input total="total" name="総額" ><br>
        
        <label>数量</label>
            <input count="kazu" name="数量"><br>
            <input type="submit" name="submit"><br>
        </form>
    </body>
</html>
