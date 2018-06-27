package org.camp.servlet;



import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinami
 */

//全てのメソッドにpublic
//全てのフィールドにprotected
//①Humanという抽象クラスを作成し、以下を実装してください。
     //myCardsというArrayListの変数を用意してください。(フィールド)。DealerとUserが持つ手札の情報。手札の一枚一枚は整数によって表現する。
 abstract class Human {
    protected ArrayList<Integer>myCards=new ArrayList<Integer>();
    //openというabstractな公開メソッドを用意してください。
    abstract public int open();//手札の合計値を計算、戻り値は手札の合計値
    //setCardというArrayListを引数とした、abstractな公開メソッドを用意してください
    abstract public void setCard(ArrayList<Integer> a);//引いたカードを手札に追加(セット)
    //checkSumというabstractな公開メソッドを用意してください。
    abstract public boolean checkSum();//まだカードを引くか判断する。まだカードを引くときの戻り値はtrue。もうカードを引かないときは戻り値をfalse。
 }  







             