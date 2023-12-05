/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import entidade.Administrador;
import entidade.Cliente;
import entidade.Conta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.AdministradorDAO;
import model.ClienteDAO;
import model.ContaDAO;

/**
 *
 * @author matmr
 */
@WebServlet(name = "ClienteController", urlPatterns = {"/cliente"})
public class ClienteController extends HttpServlet {
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
        
            String acao = (String)request.getParameter("acao");
            switch(acao) {
                case "saldo":
                    HttpSession sessao = request.getSession();
                    int clientId = (Integer)sessao.getAttribute("client_id");

                    ClienteDAO clienteDao =  new ClienteDAO();
                    Cliente cliente  = clienteDao.get(clientId);
                    
                    ContaDAO contaDAO = new ContaDAO();
                    Conta conta = contaDAO.get(clientId);
                    request.setAttribute("saldo", conta.getSaldo());
                    request.setAttribute("nome", cliente.getNome());

                    request.getRequestDispatcher("./view/saldo.jsp").forward(request, response);
                   
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
                    ClienteDAO clienteDao =  new ClienteDAO();
                    Cliente cliente  = clienteDao.get(id);
                    
                    if(cliente.getSenha() != null && cliente.getSenha().equals(senha)) {
                        ContaDAO contaDAO = new ContaDAO();
                        Conta conta = contaDAO.get(id);
                        request.setAttribute("saldo", conta.getSaldo());
                        
                        HttpSession sessao = request.getSession();
                        sessao.setAttribute("client_id", id);
                       
                        response.sendRedirect("/Projectdevweb/cliente?acao=saldo");
                        return;
                    }
                    request.getRequestDispatcher("../login.jsp").forward(request, response);
                    return;         
            }
    }
    }
