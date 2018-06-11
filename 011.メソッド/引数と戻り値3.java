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
public class 引数と戻り値3 extends HttpServlet {
//課題「引数，戻り値２」を改修します。
//整数型の変数 limit を値 2 で用意してください。そして，limit を利用して，表示するプロフィール情報を２名分のみにしてください。
//「limit」は Java の用語ではなく，ただの変数名です。
//この課題では（全員分ではなく）２名分のみのプロフィールを表示しますが，その「２」という情報を limit という変数に格納し，
//これを使って処理を実現してください。
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
           
            
            for(int limit=1;limit<3;limit++){
            
            String id=String.valueOf(limit);
            if(limit==0){
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
            out.println("<title>Servlet 引数と戻り値3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet 引数と戻り値3 at " + request.getContextPath() + "</h1>");
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
