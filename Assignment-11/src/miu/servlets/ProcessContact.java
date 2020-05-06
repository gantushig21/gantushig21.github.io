package miu.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProcessContact", urlPatterns = "/process-contact-form")
public class ProcessContact extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String gender = request.getParameter("radioGender");
        String category = request.getParameter("category");
        String message = request.getParameter("message");

        StringBuilder sb = new StringBuilder();
        if (name == null || name.trim().isEmpty())
            sb.append("Name is missing<br />");

        if (gender == null || gender.trim().isEmpty())
            sb.append("Gender is required<br />");

        if (category == null || category.trim().isEmpty())
            sb.append("Category is required<br />");

        if (message == null || message.trim().isEmpty())
            sb.append("Message is required");

        String errorMessage = sb.toString();
        if (errorMessage.isEmpty()) {
            response.sendRedirect("thankyou?name=" + name + "&gender=" + gender + "&category=" + category + "&message=" + message);
        } else {
            request.setAttribute("errorMessage", errorMessage);
            request.getRequestDispatcher("contact-form").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
