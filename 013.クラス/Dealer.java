package org.camp.servlet;


import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinami
 */
//Dealerクラス
public class Dealer extends Human{
//Humanクラスで定義した抽象メソッドをすべて実装 
//cardsというArrayListの変数を用意し、初期処理でこのcardsに全てのトランプを持たせてください。これは山札。
//追加するメソッド(Dealer)　コンストラクタ。山札にすべてのカード52枚追加 
   
    public ArrayList<Integer> cards = new ArrayList<Integer>();
    public Dealer (){        //カードの山札
        for(int n = 1; n<=4; n++){       //for文の中にfor文を書くことによって13枚のカードをcardsにaddする処理を４回繰り返すことができる
            for (int i = 1; i <= 13; i++ ){  
                              //13枚のトランプをプリントしてcardsに入れる処理
                if(i>=11){
                    cards.add(10);
                }else{
                    cards.add(i);
                }
            }
        }
    }
   
       

//dealのArrayListメソッドを用意。山札(cards)からランダムで2枚のカードを引き、引いたカードを戻り値にする。
    public ArrayList<Integer> deal(){  //カードを引く処理のみ
  ArrayList<Integer> data1 = new ArrayList<Integer>();  //data1にdata1のカード情報を入れる
    Random rand = new Random();
    Integer index = rand.nextInt(cards.size());  
     data1.add(cards.get(index));                 //ランダムの要素を二つ追加するための処理
     
    Integer index1 = rand.nextInt(cards.size()); 
     data1.add(cards.get(index1));
       return data1;
  }

//hitのArrayListメソッドを用意。山札(cards)からランダムで1枚のカードを引き、引いたカードを戻り値にする。
public ArrayList<Integer> hit(){  //カードを引く処理のみ
    Random rand = new Random();
    Integer index = rand.nextInt(cards.size());    //cardsの全要素をランダムにしている
    ArrayList<Integer> data2 = new ArrayList<>(); 
      data2.add(cards.get(index));                            
        return data2;
  }   

public void setCard(ArrayList<Integer> a){        //ArrayListで受けたカードをmyCardsに入れる処理
    for (int i= 0; i < a.size(); i++){             
        myCards.add(a.get(i));                     
    }                                               
}                                                  
               
public int open(){//手札の合計値を計算
    int tefuda = 0;
    for(int i = 0;i< myCards.size(); i++){
      tefuda+=myCards.get(i);
  }
     return tefuda;
}
        
//abstract public void setCard(ArrayList<Integer>myCards);//引いたカードを手札に追加(セット)
//public void setCard(ArrayList<Integer>myCards){
//   myCards.size();
//}

//abstract public boolean checkSum();

//まだカードを引くべきかを判断するメソッド
public boolean checkSum(){
       int sum = 0;
   for(int i = 0;i< myCards.size(); i++){
    sum+=myCards.get(i);
   }
   if (sum <= 16 ){//合計してから処理する
      out.print("ディーラー:はい、引きます。<br>");
    return true;
    }else{
      out.print("ディーラー:もう引きません。<br>");
    return false;
    }
    }
}
