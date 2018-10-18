/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ipn.cecyt9.edusite.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.ipn.cecyt9.edusite.utils.Conexion;

/**
 *
 * @author Alumno
 */
public class RegistroServlet extends HttpServlet {
    
    private Connection conex;
    

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
        
        Conexion con = new Conexion();
        con.conecta();
        conex = con.getConnection();
        String nombre;
        String apepater;
        String apemater;
        String escue;
        String matfav;
        String depfav;

        final String INSERT = "insert into Info(Nombre,ApePater,ApeMater,Escuela,MatFav,DepFav) values(?, ?, ?, ?, ?, ?);";

        nombre = request.getParameter("NOMBRE");
        apepater = request.getParameter("APELLIDOPAT");
        apemater = request.getParameter("APELLIDOMAT");
        escue = request.getParameter("ESCUELA");
        matfav = request.getParameter("MATERIA");
        depfav = request.getParameter("DEPORTE");
               

        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conex.prepareStatement(INSERT);
            stmt.setString(1, nombre);
            stmt.setString(2, apepater);
            stmt.setString(3, apemater);
            stmt.setString(4, escue);
            stmt.setString(5, matfav);
            stmt.setString(6, depfav);

            if (stmt.executeUpdate() == 0) {
                //algo paso
            }
            conex.close();
        } catch (Exception eee) {

        }
        response.sendRedirect("JSP/index.jsp");
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
