package miu.servlets;

import miu.utils.FactoryMethods;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

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

        PrintWriter out = response.getWriter();

        out.print("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n" +
                "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
                "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n" +
                "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n" +
                "    <title>Customer Contact App</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <header>\n" +
                "        <nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\n" +
                "            <a class=\"navbar-brand\" href=\"#\">CS472-WAP ::: Assignment 11</a>\n" +
                "            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "                <span class=\"navbar-toggler-icon\"></span>\n" +
                "            </button>\n" +
                "        </nav>\n" +
                "    </header>    \n" +
                "    <main>\n" +
                "        <div class=\"container my-4\">\n" +
                "            <p class=\"text-muted text-right\">" + sdf.format(new Date()) + "</p>\n" +
                "            <div class=\"card\">\n" +
                "                <div class=\"card-header\">\n" +
                "                    <h3 style=\"font-weight: 300;\">Thank you! Your message has been received as follows:</h3>\n" +
                "                </div>\n" +
                "                <div class=\"card-body\">\n" +
                "                    <p class=\"lead\">Name: " + FactoryMethods.getStringValue(request.getParameter("name")) + "</p>\n" +
                "                    <p class=\"text-muted\">Gender: " + FactoryMethods.getStringValue(request.getParameter("gender")) + "</p>\n" +
                "                    <p class=\"text-muted\">Category: " + FactoryMethods.getStringValue(request.getParameter("category")) + "</p>\n" +
                "                    <p>Message: " + FactoryMethods.getStringValue(request.getParameter("message")) + "</p><br />\n" +
                "                    <p>Please feel free to <a href=\"contact-form\">Contact Us</a> again</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <div class=\"container my-4\" style=\"display: flex; justify-content: space-between;\">\n" +
                "            <span class=\"text-muted\">Hit count for this page: " + hitCounter + "</span>\n" +
                "            <span class=\"text-muted\">Total Hit Count for the entire WebApp: --</span>\n" +
                "        </div>\n" +
                "    </main>\n" +
                "    <footer style=\"position: fixed; bottom: 0; width: 100%; height: 50px; background-color: #f5f5f5; line-height: 50px;\">\n" +
                "        <div>\n" +
                "            <span style=\"margin-left: 1em;\">Gantushig Bayasgalan ::: CS472-WAP</span>\n" +
                "            <span style=\"float: right;margin-right: 1em;\">&copy; May 2020</span>\n" +
                "        </div>\n" +
                "    </footer>\n" +
                "</body>\n" +
                "</html>\n");

    }
}
