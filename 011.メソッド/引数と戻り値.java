/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author chinami
 */
public class 引数と戻り値 extends HttpServlet {

    private String id;

   
//ユーザー定義メソッドを作成してください。引数・戻り値・処理内容については，以下の通りです。 
//・引数 
//　文字列型 
//・戻り値 
//　文字列型を要素に持つ配列型 
//・処理内容 
//　３人分のプロフィール情報を，それぞれ配列で作成してください（プロフィール情報の項目は，課題「戻り値2」と同様です）。
//そして，引数として受け取った ID の値と同じ ID の値を持つ配列を，戻り値として返してください。 
//
ArrayList<String> method(String id){
ArrayList<String>user1=new ArrayList<String>();
 user1.add("0");
 user1.add("生年月日:1991年4月1日");
 user1.add("住所:品川1-1");
ArrayList<String>user2=new ArrayList<String>();    
 user2.add("1");
 user2.add("生年月日:1991年5月1日");
 user2.add("住所:渋谷1-1");
ArrayList<String>user3=new ArrayList<String>();    
 user3.add("2");
 user3.add("生年月日:1991年6月1日");
 user3.add("住所:新宿1-1");
 
ArrayList[]a={user1,user2,user3};


//該当するIDを持つプロフィールを探す
    if(id.equals("0")){
       return user1;
    }

    if(id.equals("1")){
       return user2;
    }
    
    if(id.equals("2")){
       return user3;
    }
return null;
    
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
            
    //メソッ呼び出し側の記述については，課題「戻り値2」と同様としてください。    
        //下記は課題「戻り値2」
//          method();//{"IDは1234","生年月日は1991年1日1","住所は東京都品川区品川1-1"}
//        
//         ArrayList<String> a =  method();
//         
//         for(int i=1;i<a.size();i++){
//             out.print(a.get(i));
//         }  
          
//          String id="123";
                 
         for(int j=0;j<3;j++){
            String id=String.valueOf(j);
            ArrayList<String>a = method(id);
            for(int i=0;i<a.size();i++){
                out.print(a.get(i));
                out.print("<br>");
            }
         }
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet 引数と戻り値</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet 引数と戻り値 at " + request.getContextPath() + "</h1>");
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
