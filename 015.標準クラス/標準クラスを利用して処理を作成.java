/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinami
 */
//Java の標準クラスについて，これまでに扱っていないものを自身で調査し，その標準クラスを利用した処理を記述してください。 
//その際，「ファイル操作編」の単元で学習した内容を利用して，以下の内容が記載されたログファイルを作成してください。 
//1. 処理の内容（例：文字列の置換） 
//2. 処理を開始する旨と，その時刻（例：2000-01-01 12:00 開始） 
//3. 処理を終了する旨と，その時刻（例：2000-04-04 11:00 終了） 
//※ なお，ログファイルとは，一定の記録（Log）が記述されたファイルの一般的な名称です（特定のファイル形式を指すものではありません）。
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
public class 標準クラスを利用して処理を作成 {
    public static void main(String[]args){
       try{
            File mojihen=new File("mojihen");
            FileWriter a=new FileWriter(mojihen);
         //1.処理の内容(全ての文字を大文字に、または小文字に変換)  
            a.write("全ての文字を大文字に、または小文字に変換");
                System.out.println("MoJiを全て大文字ver.と小文字ver.を表示");
                
        //2.処理を開始する時刻
                Date start=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd HH-mm-ss");
                String dateString=sdf.format(start);
                   // System.out.println("START");
                    System.out.println("Start "+dateString);
                    
        //処理開始
                String moji="MoJi";
                String omoji=moji.toUpperCase();
                String komoji=moji.toLowerCase();
                System.out.println(omoji);
                System.out.println(komoji);
                
        //3.処理を終了する時刻
                Date finish=new Date();
                SimpleDateFormat sdf2=new SimpleDateFormat("yyyy.MM.dd HH-mm-ss");
                String dateString2=sdf2.format(finish);
                   // System.out.println("Finish");
                    System.out.println("Finish "+dateString2);
                    
            a.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
