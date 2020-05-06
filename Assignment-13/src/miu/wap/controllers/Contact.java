package miu.wap.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ContactUs", urlPatterns = "/contact-form")
public class Contact extends HttpServlet {
    private int hitCounter;

    @Override
    public void init() throws ServletException {
        hitCounter = 0;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        hitCounter++;

        request.setAttribute("statusContact", "active");
        request.setAttribute("hitCounter", hitCounter);
        request.getRequestDispatcher("views/contact-form.jsp").forward(request, response);
    }
}
