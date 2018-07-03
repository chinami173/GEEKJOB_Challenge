
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinami
 */
//2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒の差（ミリ秒）を表示してください。
//String datetime="2016/1/1 0:0:0";
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        Date date=sdf.parse(datetime);
//       
//         System.out.print(date.getTime());
public class タイムスタンプの表示2 {
    public static void main(String[]args) throws ParseException{
        String datetime="2015/1/1 00:00:00";  
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date=sdf.parse(datetime);
            System.out.print(date.getTime());
            System.out.print("<br>");
        
        String datetime2="2015/12/31 23:59:59";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date2=sdf2.parse(datetime2);
            System.out.print(date2.getTime());
            System.out.print("<br>");
            
        long a=date.getTime();
        long b=date2.getTime();
        if(a<=b){
            System.out.print(b-a);
        }else{
            System.out.print(a-b);
        }
    }
}
