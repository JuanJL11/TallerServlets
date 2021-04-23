/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punto2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juanj
 */
@WebServlet("/Datos")
public class Datos extends HttpServlet {
 @Override
public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
throws ServletException, IOException {
PrintWriter salida = respuesta.getWriter();

String c1 = peticion.getParameter("caja1");
String c2 = peticion.getParameter("caja2");
double n1 = Double.parseDouble(c1);
double n2 = Double.parseDouble(c2);
double resultado = Math.pow(n1, 2)+ Math.pow(n2, 2);
salida.println("<!DOCTYPE html>");
salida.println("<html>");
salida.println("<head>");
salida.println("<title>Resultado Hipotenusa</title>");            
salida.println("</head>");
salida.println("<body bgcolor=\"#FDF5E6\">");
salida.println("<h1 align=\"center\">" + "Resultado longitud de la hipotenusa" + "</h1>\n");
salida.println(resultado);
salida.println("</body>");
salida.println("</html>");





    }   

} 