/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author chinami
 */
public class 入力フィールドの作成と実装2 extends HttpServlet {

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
        //以下の機能を実現してください。 
        //・名前，性別，趣味の情報をフォームによって送信することができる。 
        //・フォームによって値を送信すると，次回アクセス時に，その値がフォームの初期値となる（セッションかクッキーを利用する）。
      
        //セッション取得
        HttpSession se=request.getSession();
        //セッションからデータ読み出し
        String[] jouhou={(String)se.getAttribute("名前")};
        String[]jouhou2={(String)se.getAttribute("性別")};
        String[]jouhou3={(String)se.getAttribute("趣味")};
        
        
        if(jouhou!=null){
            for(int i=0;i<jouhou.length;i++){
                String a=jouhou[i];
                String deco=URLDecoder.decode(a,"UTF-8");
                out.println("名前:"+deco);
                break;
            }
        }
        out.print("<br>");
        
        if(jouhou2!=null){
            for(int i=0;i<jouhou2.length;i++){
                String b=jouhou2[i];
                String deco2=URLDecoder.decode(b,"UTF-8");
                out.println("性別:"+deco2);
                break;
            }
        }
        out.print("<br>");
        
        if(jouhou3!=null){
            for(int i=0;i<jouhou3.length;i++){
                String c=jouhou3[i];
                String deco3=URLDecoder.decode(c,"UTF-8");
                out.println("趣味:"+deco3);
                break;
            }
        }
        out.print("<br>");
        //* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet 入力フィールドの作成と実装2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet 入力フィールドの作成と実装2 at " + request.getContextPath() + "</h1>");
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
