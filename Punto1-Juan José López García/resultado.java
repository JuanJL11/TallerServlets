/**
 * Juan Jose Lopez Garcia
 */
package com.mycompany.ejemplo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/resultado")
public class resultado extends HttpServlet {
  @Override
public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
throws ServletException, IOException {
PrintWriter salida = respuesta.getWriter();

String c1 = peticion.getParameter("caja");
double n1 = Double.parseDouble(c1);
double resultado = Math.pow(n1, 3);


salida.println("<title>Resultado</title>");            
salida.println("<h1>Resultado</h1>");
salida.println(peticion.getParameter("caja") +
" <sup>3</sup> ");
salida.println("<p>Es igual a: </p>");
salida.println(resultado);
    }   
}
