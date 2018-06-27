package org.camp.servlet;


import static java.lang.System.out;
import org.camp.servlet.Human;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinami
 */

//②１で作成した抽象クラスを継承して、以下のクラスを作成してください。
//Dealerクラス,Userクラス
//Userクラス・・・Humanクラスを継承。Humanクラスで継承した抽象メソッドをすべて実装
public class User extends Human{ //継承


public int open(){
   int sum = 0;
   for(int i = 0;i< myCards.size(); i++){
    sum+=myCards.get(i);
  }
    return sum;
}

public void setCard(ArrayList<Integer> a){
   for(int i =0 ;  i < a.size(); i++){
    myCards.add(a.get(i));
}
}

public boolean checkSum(){
   int sum = 0;
   for(int i = 0;i< myCards.size(); i++){
    sum+=myCards.get(i);
   }
   if (sum <= 16 ){//合計してから処理する
      out.print("私:はい、引きます。<br>");   
    return true;
    }else{
       out.print("私:もう引きません。<br>");
    return false;
    }
  }
}  

