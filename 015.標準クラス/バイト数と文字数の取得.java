/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinami
 */
//自分の氏名について，バイト数と文字数を取得してください。また，それぞれの値を画面に表示してください。
public class バイト数と文字数の取得 {
    public static void main(String[]args){
        String name="菅原千波";
            //バイト数取得
            System.out.println(name.getBytes().length);
            //文字数取得 
            System.out.println(name.length());
    }
}
