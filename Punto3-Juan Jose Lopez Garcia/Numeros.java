/**
 * Juan Jose Lopez Garcia
 */
package com.mycompany.punto3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static jdk.internal.vm.compiler.word.LocationIdentity.init;

@WebServlet("/Numeros")
public class Numeros extends HttpServlet {
    
@Override    
public void init(){
ArrayList<Double> numeros = new ArrayList(10);     

 Random random = new Random();
    for(int i=0;i<10;i++){
    numeros.add(random.nextDouble()*100+1);
}    
     System.out.println(numeros);
}     
@Override
public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
throws ServletException, IOException {
PrintWriter salida = respuesta.getWriter();
 ArrayList<Double> numeros = new ArrayList(10); 
Random random = new Random();

    for(int i=0;i<10;i++){
          numeros.add(random.nextDouble()*100+1);
}    
salida.println(numeros);


double suma = 0;
    for (int i = 0; i < numeros.size(); i++) {
        suma += numeros.get(i);
    }
salida.println("La suma de la ArrayList es:");
salida.println(suma);
   }
}
