
package com.mycompany.punto4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Visitas")
public class Visitas extends HttpServlet {
@Override
public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
throws ServletException, IOException {
Integer Visitas = 0;
PrintWriter salida = respuesta.getWriter();
HttpSession sesion = peticion.getSession();

Visitas = (Integer)sesion.getAttribute("numero");
if(Visitas == null){
    Visitas = 0;
}

salida.println("<!DOCTYPE html>");
salida.println("<html>");
salida.println("<head>");
salida.println("<title>Contador de Visitas</title>");            
salida.println("</head>");
salida.println("<body>");
salida.println("<h2> Numero de Visitas en la pagina </h2>");
salida.println("<p>el numero de Visitas es de:" +Visitas+ "</p>");
salida.println("</body>");
salida.println("</html>");
Visitas++;

sesion.setAttribute("numero", Visitas);


  }
}