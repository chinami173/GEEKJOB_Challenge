/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

//java.io.Serializableインターフェイスを実装する。
import java.io.Serializable;
import java.util.Date;
import javax.servlet.RequestDispatcher;


/**
 *
 * @author chinami
 */
public class ResultData implements Serializable {
 //フィールドは、カプセル化する
 private Date d;
 private String luck;
 //Publicで引数の無いコンストラクタを持つ。
 public ResultData(){}
 //フィールドは、publicで命名規則に沿ったgetter/setterを持つ
 public Date getD(){
     return d;
     
 }
 
 public void setD(Date d){
    this.d=d;
 }
 
 public String getLuck(){
     return luck;
 }
 
 public void setLuck(String luck){
     this.luck=luck;
 }
}


 
    