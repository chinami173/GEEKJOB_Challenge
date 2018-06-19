/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chinami
 */
public class クラス継承 extends HttpServlet {
//以下の仕様を満たすクラスを作成してください。 
//また，処理が正しく書かれていることを確認するために，作成したクラスを呼び出すクラス（以下，実行クラスと言います）を別途作成し，
//実行クラスからインスタンス化・メソッド呼び出しを行ってください。 
//■継承 
//・このクラスは，課題「クラスの作成」で作成したクラス（実行クラスではないほう。以下，親クラスといいます）を継承する。 
//■フィールド 
//親クラスから継承されているフィールド以外に，フィールドはない。  
//■メソッド 
//親クラスから継承されているメソッド以外に，以下のメソッドを追加する。 
//①以下の条件を満たすメソッド 
//・引数　なし 
//・戻り値　なし 
//・処理内容 
//　フィールドの値をクリアする（「クリアする」とは，フィールドが int 型であれば 0，String 型であれば空文字や null といった値に変更するということ）

//「クラスの作成」
class Hito{  //クラス
  //２つのフィールドを用意する。フィールドがどんな情報を持つかは，自由とする。
     String name;//フィールド
     int age;    //フィールド
 //■メソッド 
//①以下の条件を満たすメソッド   
   void aa(String a,int b){  //メソッド・戻り値　なし・引数 ２つの引数を取る。データ型はそれぞれフィールドのデータ型と同じものとする。
//・処理内容 
//　引数として受け取った２つの変数を，フィールドに格納する。
        this.name=a;  //引数をフィールドへ設定
        this.age=b;   //引数をフィールドへ設定
    }
//②
   void bb (PrintWriter out){   //メソッド・引数　なし ・戻り値　なし 
//・処理内容 
//　２つのフィールドの値をそれぞれ画面に表示する。
   out.print("私は"+name+"です。");
   out.print(age+"歳です。");
}
    

    }    
    
//■継承 
//・このクラスは，課題「クラスの作成」で作成したクラス（実行クラスではないほう。以下，親クラスといいます）を継承する。 
//■フィールド 
//親クラスから継承されているフィールド以外に，フィールドはない。  
//■メソッド 
//親クラスから継承されているメソッド以外に，以下のメソッドを追加する。 
//①以下の条件を満たすメソッド 
//・引数　なし 
//・戻り値　なし 
//・処理内容 
//　フィールドの値をクリアする（「クリアする」とは，フィールドが int 型であれば 0，String 型であれば空文字や null といった値に変更するということ）
class Ningen extends Hito{
    public void ikiru(PrintWriter out){
        String a="";
        int b=0;
        out.print(out);
    }
}


    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        //「クラスの作成」     
        Hito ab=new Hito();    //Hitoクラスのabインスタンス生成
        ab.aa("山田",32);
        ab.bb(out);
    
    //クラスの継承        
    //また，処理が正しく書かれていることを確認するために，作成したクラスを呼び出すクラス（以下，実行クラスと言います）を別途作成し，
    //実行クラスからインスタンス化・メソッド呼び出しを行ってください。 
        Ningen cc=new Ningen();
         cc.ikiru(out);
         
    
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet クラス継承</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet クラス継承 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
