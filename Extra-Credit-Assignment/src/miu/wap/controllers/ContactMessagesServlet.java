package miu.wap.controllers;

import miu.wap.models.Customers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ContactMessagesServlet", urlPatterns = "/contact-messages")
public class ContactMessagesServlet extends HttpServlet {
    private Customers customersModel = new Customers();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String search = request.getParameter("search");

        request.setAttribute("active", "contact-messages");
        request.setAttribute("customers", customersModel.getCustomers(search != null ? search.trim().toLowerCase() : ""));
        request.getRequestDispatcher("WEB-INF/views/contact-messages.jsp").forward(request, response);
    }
}
