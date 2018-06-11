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
import java.util.ArrayList;

/**
 *
 * @author chinami
 */
public class 引数と戻り値2 extends HttpServlet {
//ユーザー定義メソッドを作成してください。引数・戻り値・処理内容については，以下の通りです。
//・引数　文字列型
//・戻り値　配列（ArrayList で実現してもOK）
//・処理内容
//　３人分のプロフィール情報を，それぞれ配列で作成してください（プロフィール情報の項目は，課題「引数、戻り値1」と同様です）。
//ただし，そのうちの１人については，住所 の値を null にしてください。
//　そして，引数で受け取った文字列と ID の値が一致する人物について，そのプロフィール情報の配列を戻り値としてください。
//
//　メソッドを作成したら，このメソッドを適宜呼び出し，３人分のプロフィール情報をすべて画面に表示してください。
//ただし，値が null なデータについては continue; を利用して画面表示をスキップしてください。
ArrayList<String> method(String id){
ArrayList<String>user1=new ArrayList<String>();
 user1.add("0");
 user1.add("生年月日:1991年4月1日");
 user1.add(null);
ArrayList<String>user2=new ArrayList<String>();    
 user2.add("1");
 user2.add("生年月日:1991年5月1日");
 user2.add("住所:渋谷1-1");
ArrayList<String>user3=new ArrayList<String>();    
 user3.add("2");
 user3.add("生年月日:1991年6月1日");
 user3.add("住所:新宿1-1");
 



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
//　メソッドを作成したら，このメソッドを適宜呼び出し，３人分のプロフィール情報をすべて画面に表示してください。
//ただし，値が null なデータについては continue; を利用して画面表示をスキップしてください。
        for(int j=0;j<3;j++){
            String id=String.valueOf(j);
            if(j==0){
            continue;
        }
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
            out.println("<title>Servlet 引数と戻り値2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet 引数と戻り値2 at " + request.getContextPath() + "</h1>");
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
