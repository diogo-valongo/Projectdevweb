/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import entidade.Administrador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AdministradorDAO;

/**
 *
 * @author matmr
 */
@WebServlet(name = "AdministradorController", urlPatterns = {"/admin"})
public class AdministradorController extends HttpServlet {

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
                try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println(request.getParameter("acao"));
            out.println("<head> GET");
            out.println("<title>Servlet AdministradorController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdministradorController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        
            String acao = (String)request.getParameter("acao");
            switch(acao) {
                case "login":
                    int id = Integer.parseInt(request.getParameter("id"));
                    String senha = (String)request.getParameter("password");
                    AdministradorDAO administradorDAO =  new AdministradorDAO();
                    Administrador administrador  = administradorDAO.get(id);
                    
                    if(administrador.getSenha() != null && administrador.getSenha().equals(senha)) {
                        
                        request.getRequestDispatcher("./view/extratoAdm.jsp").forward(request, response);
                        return;
                    }
                    request.getRequestDispatcher("../loginAdm.jsp").forward(request, response);

                    
            }          
        }
    }
