<%-- 
    Document   : switch文1
    Created on : 2018/05/17, 16:51:36
    Author     : chinami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
//変数を宣言し，数値を格納してください。その後，変数の値によって条件分岐し，以下のような画面表示をしてください。なお，条件分岐には switch 文を利用してください。 

//変数の値が１の場合 ... 「one」と表示する 
//変数の値が２の場合 ... 「two」と表示する 
//それ以外の場合 ... 「想定外」と表示する

int num=1;

switch (num) {
    case 1:
        out.print("one");
        break;
    
    case 2:
        out.print("two");
        break;
        
    default:
        out.print("想定外");
        break;
        
}

int A=2;

switch (A) {
    case 1:
        out.print("one");
        break;
    
    case 2:
        out.print("two");
        break;
        
    default:
        out.print("想定外");
        break;
        
}


int B=3;

switch (B){
    case 1:
        out.print("one");
        break;
        
    case 2:
        out.print("two");
        break;
        
    default:
        out.print("想定外");
        break;
        
         


}


%>