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
//「2016年11月4日 10時0分0秒」の情報を持つタイムスタンプ（ミリ秒）を生成し，画面に表示してください。
public class タイムスタンプの表示 {
    public static void main(String[]args) throws ParseException{
        String datetime="2016年11月4日 10:00:00";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date=sdf.parse(datetime);
            System.out.print(date.getTime()+"<br>");
//その後，さらにこの情報を「2016-11-04 10:00:00」の形式で画面に表示してください。
        long timestamp=date.getTime();
        Date date2=new Date(timestamp);
        SimpleDateFormat a=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.print(a.format(date2));
    }
}
