<%-- 
    Document   : query_string_output
    Created on : 2018/07/10, 14:02:15
    Author     : chinami
--%>
<%--
■出力画面
・query_string_output.jsp ... クエリストリングを取得する処理をします
▼処理内容
1.total,count,type の値を取得し，値が画面に表示される
　※typeは数字ではなく，対応する商品種別が表示される様にしましょう
2.商品の単価が画面に表示される
3.商品購入総額に応じてポイントを計算し，その値が画面に表示される
　※ポイントは商品購入総額を基準にして，以下の様に算出する 
　　3000 円未満 ... 0% 
　　3000 円以上で5000円未満 ... 購入総額の 4% 
　　5000 円以上 ... 購入総額の 5%
--%>
<%@page contentType="query_string_input.jsp" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="query_string_input.jsp; charset=UTF-8">
        <title>クエストリングの利用</title>
    </head>
    <body>
        <%
        request.setCharacterEncoding("UTF-8");
        String sina=request.getParameter("se");
        String total=request.getParameter("総額");
        String ryou=request.getParameter("数量");
        
        //総額表示
            out.println("総額"+total+"円"+"<br>");
        //数量表示    
            out.println("数量"+ryou+"個"+"<br>");
           
        //選んだ商品の表示    
            out.print("商品");
            
            if(sina.equals("1")){
                out.print("  雑貨<br>");
            }
            if(sina.equals("2")){
                out.print("  生鮮食品<br>");
            }
            if(sina.equals("3")){
                out.print("  その他<br>");
            }
        
        //単価表示    
        int total1=Integer.parseInt(total);
        int total2=Integer.parseInt(ryou);
            out.print("単価"+total1/total2+"円<br>");
        
        //ポイント表示
        if(total1>=3000&&total1<5000){
            out.print(total1*0.04+"pt");
        }else if(total1>=5000){
            out.print(total1*0.05+"pt");
        }    
            
        %>
    </body>
</html>
