package miu.wap.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;

@WebServlet(name = "ThankYou", urlPatterns = "/thankyou")
public class ThankYou extends HttpServlet {
    private int hitCounter;
    private SimpleDateFormat sdf = new SimpleDateFormat("EEEEE, dd MMMMM yyy");

    @Override
    public void init() throws ServletException {
        hitCounter = 0;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        hitCounter++;

        request.setAttribute("hitCounter", hitCounter);
        request.setAttribute("type", "thankyou");
        request.getRequestDispatcher("views/thank-you.jsp").forward(request, response);
    }
}
