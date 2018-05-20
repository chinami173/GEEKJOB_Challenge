<%-- 
    Document   : switch文2
    Created on : 2018/05/17, 17:27:05
    Author     : chinami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
//char型の変数を宣言し，値を格納してください。その後，変数の値によって条件分岐し，以下のような画面表示をしてください。なお，条件分岐には switch 文を利用してください。 

//変数の値が 'A' の場合 ... 「英語」と表示する  
char c='A';
  
switch (c){
    case 'A':
     out.print("英語");
     break;
     
    case 'あ':
     out.print("日本語");
     break;
     
    case 'ア':
     break;   
    
}

out.print("<br>");

//変数の値が 'あ' の場合 ... 「日本語」と表示する
char b='あ';

switch (b){
    case 'A':
     out.print("英語");
     break;
     
    case 'あ':
     out.print("日本語");
     break;
     
    case 'ア':
     break;
      
     
}

out.print("<br>");

//それ以外の場合 ... 何も表示しない（処理を行わない）
char e='ア';

switch(e){
    case 'A':
     out.print("英語");
     break;
     
    case 'あ':
     out.print("日本語");
     break;
     
    case 'ア':
     break;   
    
}


 













%>
