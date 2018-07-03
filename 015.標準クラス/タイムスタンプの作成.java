package newpackage;

import static java.lang.System.out;
import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinami
 */
//「2016年1月1日 0時0分0秒」の情報を持つタイムスタンプ（ミリ秒）を生成し，画面に表示してください。
class タイムスタンプの作成 {
    public static void main(String[]args) throws ParseException{
        String datetime="2016/1/1 0:0:0";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date=sdf.parse(datetime);
       
         System.out.print(date.getTime());
            
    }
}
