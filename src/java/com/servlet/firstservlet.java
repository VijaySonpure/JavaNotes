/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;

/**
 *
 * @author H P
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.* ;


public class firstservlet implements Servlet {
    ServletConfig conf;
     
   public void init(ServletConfig conf){
       System.out.print("Creating Objecs:-....");
   }
    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException{
        System.out.print("Servicing......");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h1>This is My Output from servlet Method:</h1>");
         out.println("<h1>Today date and Time is:" +new Date().toString()+"</h1>");
    }
   public void destroy(){
       System.out.println("Going to Destroy Servlet Objects.....");
   }

   public ServletConfig getServletConfig() {
       return this.conf;
    }
   
   public String getServletInfo(){
       return "This Servlet Created by Vijay...";
   }

 }
