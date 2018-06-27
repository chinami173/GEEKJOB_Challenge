/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;
import org.camp.servlet.User;
import org.camp.servlet.Dealer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
/**
 *
 * @author chinami
 */
@WebServlet(name = "NewServlet_1", urlPatterns = {"/NewServlet_1"})
public class ブラックジャック01 extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
         //   タンス化し、メソッドを呼び出し、ゲームを進めよう。
    //実行結果・・・ゲームの簡単な実況、終了時の互いの手札の合計値と勝敗を表示
    out.print("START!<br>ディーラーが手札を配ります。<br>");
    
    
    //インスタンス化
    User user=new User();
    Dealer dealer=new Dealer();
       
    //out.print(dealer.cards);
    //ディーラーがセットしました
    dealer.setCard(dealer.deal());
    user.setCard(dealer.deal());
     
    //checkSum
    while(user.checkSum()){
      user.setCard(dealer.hit());
    }
    
    while(dealer.checkSum()){
      dealer.setCard(dealer.hit());
    }
     out.print("あなたの手札は"+user.myCards+"<br>");
     out.print("ディーラーの手札は"+dealer.myCards+"<br>");
    
    if(21<user.open()){
        if(21<dealer.open()){
            out.print("どちらもOUT<br>");
        }else{
             out.print("lose");
        }
    }else{
        if(21<dealer.open()){
            out.print("you win");
            }else{
                if(dealer.open()==user.open()){
                    out.print("draw");
                }else if(dealer.open()>user.open()){
                  out.print("lose");
                }else{
                    out.print("win");
                }
            }
        }
            
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
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
