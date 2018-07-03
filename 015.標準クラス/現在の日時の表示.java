import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinami
 */
//現在の日時を「1988年5月21日 1時23分45秒」といった形式で表現してください。
public class 現在の日時の表示 {
    public static void main(String[]args){
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyy年MM月dd日 HH時mm分ss秒"); 
            System.out.print(sdf.format(d));
    }
}
