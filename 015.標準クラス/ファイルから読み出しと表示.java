/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinami
 */
//課題「ファイルの書き出しと保存」で作成したテキストファイルを読み込み，その内容を画面に表示してください。
import java.io.*;
public class ファイルから読み出しと表示 {
    public static void main(String[]args){
        try{
            File fp=new File("text.txt");
            //FileReader作成
            FileReader fr=new FileReader(fp);
            //BufferedReader作成
            BufferedReader br=new BufferedReader(fr);
            //読み出し
            System.out.println(br.readLine());
            
            fr.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
