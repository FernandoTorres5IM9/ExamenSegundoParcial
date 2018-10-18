/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ipn.cecyt9.edusite.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.ipn.cecyt9.edusite.model.Info;
import mx.edu.ipn.cecyt9.edusite.utils.Conexion;

/**
 *
 * @author Alumno
 */
public class ConsultaServlet extends HttpServlet {

    private Connection conex;
    private ResultSet res = null;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

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
         Conexion con = new Conexion();
        con.conecta();
        conex = con.getConnection();
        Info reg = null;
        ArrayList<Info> regs = new ArrayList();

        final String INSERT = "select * from Info();";

        try {
            con.query(INSERT);
            
            while (res.next()) {
                reg = new Info();
                reg.setIdInfo(res.getInt("id_Info"));
                reg.setNombre(res.getNString("Nombre"));
                reg.setApePater(res.getNString("ApePater"));
                reg.setApeMater(res.getNString("ApeMater"));
                reg.setEscuela(res.getNString("Escuela"));
                reg.setMatFav(res.getNString("MatFav"));
                reg.setDepFav(res.getNString("DepFav"));
                regs.add(reg);  
            }
            conex.close();
        } catch (Exception eee) {
            System.out.println("No se encontraron los registros");
        }
        
        request.getServletContext().setAttribute("Infos", reg);
        response.sendRedirect("JSP/Consulta.jsp");
        
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
