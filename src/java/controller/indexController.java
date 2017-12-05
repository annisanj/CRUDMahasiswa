/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Annisa
 */
public class indexController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Servlet " + this.getServletName() + " has started");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Servlet " + this.getServletName() + " has stopped");
    }
}
