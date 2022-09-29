/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import data.AutoDAO;
import entity.Auto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author emidz
 */
@WebServlet(name = "SvAutos", urlPatterns = {"/SvAutos"})
public class SvAutos extends HttpServlet {
    
    AutoDAO dao = new AutoDAO();
    List<Auto> lista = dao.readAll();
      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession ses = request.getSession();
        ses.setAttribute("lista",lista);
        
        
        response.sendRedirect("mostrarAutos.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String patente = request.getParameter("patente");
        String marca = request.getParameter("marca");
        String modelo = request.getParameter("modelo");
        String color = request.getParameter("color");
        String tipoMotor = request.getParameter("tipoMotor");
        
        Auto auto = new Auto (patente, marca, modelo, color, tipoMotor);
        lista.add(auto);
        dao.insertAuto(auto);
        
        response.sendRedirect("autos.jsp");
        
    }

    public void mostrarLista(){
        for (Auto a: lista){
            System.out.println(""+a);
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
    }

    
   

    
    

