/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import javax.servlet.http.Cookie;
/**
 *
 * @author chinami
 */
@WebServlet(urlPatterns = {"/________"})
public class クッキーの記録と表示 extends HttpServlet {
    
        
       
    
    
   
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
           
    //クッキーを利用して現在時刻を記録してください。
    //また，２回目以降のアクセス時は，クッキーの値を取り出し，前回にアクセスした時刻の情報を画面に表示してください.
    
   
    //Cookieの中身を取得
   Cookie[] c=request.getCookies();
   
   if(c!=null){
       for(int i=0;i<c.length;i++){
           if(c[i].getName().equals("time")){
               String cookietime=c[i].getValue();
               
            //デコード化
            String deco=URLDecoder.decode(cookietime,"UTF-8");
                out.print("前回のアクセス時刻は「"+deco+"」です。");
                break;
           }
       }
   }
   
   
    
//   if(c!=null){
//       out.print("現在の時刻を記録<br>"+c[0]+"<br>");
//   }
//         for(int i=0;i<c.length;i++){
//             if(c[i].getName().equals(time)){
//                 out.print(time);
//                 break;
//             }
//         }
//    }
      
    
       
            
            
            
            
            
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet クッキーの記録と表示</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet クッキーの記録と表示 at " + request.getContextPath() + "</h1>");
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
