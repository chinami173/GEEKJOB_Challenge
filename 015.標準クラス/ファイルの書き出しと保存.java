/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinami
 */
//自己紹介の記述されたテキストファイルを作成してください。ファイルの作成は，File クラスなどを利用することによって行ってください。
import java.io.*;
public class ファイルの書き出しと保存 {
    public static void main(String[]args){
        try{
        //ファイルオープン
        File fp=new File("text.txt");
        //FileWriter作成
        FileWriter fw=new FileWriter(fp);
        //書き込み
        fw.write("こんにちは。菅原千波です。宜しくお願い致します。");
        
    }catch(IOException e){
        e.printStackTrace();
    }
}
}