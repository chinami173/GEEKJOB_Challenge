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
public class 戻り値1 extends HttpServlet {
//課題「ユーザー定義メソッドの作成」で作成したメソッドを改修します（ファイルは新規に作成してください）。
//引数・戻り値・処理内容については，以下の通りです。
//・引数　PrintWriter型
//・戻り値　boolean型
//　このメソッドは，つねに true を返します。
//メソッドを作成したら，このメソッドを呼び出し，戻り値に応じて以下の条件判断を行ってください。
//true ... 「この処理は正しく実行できました」と画面に表示
//false ... 正しく実行できませんでした」と画面に表示
//    
  void myprofile(PrintWriter sc){   
    sc.print("私の名前は菅原千波です<br>");
    sc.print("1991年4月17日生まれです<br>");
    sc.print("一生懸命頑張ります<br>");
    }
  
  boolean myprofile(int num,PrintWriter sc){
      if(num>=0){
          return true;
      }else{
          return false;
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
           if(myprofile(-100,out)){
               out.print("この処理は正しく実行できました");
           }else{
               out.print("正しく実行できませんでした");
           }
           
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet 戻り値1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet 戻り値1 at " + request.getContextPath() + "</h1>");
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
