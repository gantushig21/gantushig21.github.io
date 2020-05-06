package miu.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Home", urlPatterns = "/home")
public class Home extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
                "    <title>Home</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <header>\n" +
                "        <nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\n" +
                "            <a class=\"navbar-brand\" href=\"#\">CS472-WAP ::: Assignment 11</a>\n" +
                "            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "                <span class=\"navbar-toggler-icon\"></span>\n" +
                "            </button>\n" +
                "            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
                "                <ul class=\"navbar-nav mr-auto\">\n" +
                "                    <li class=\"nav-item active\">\n" +
                "                        <a href=\"home\" class=\"nav-link\">Home</a>\n" +
                "                    </li>\n" +
                "                    <li class=\"nav-item\">\n" +
                "                        <a href=\"#\" class=\"nav-link\">About</a>\n" +
                "                    </li>\n" +
                "                    <li class=\"nav-item\">\n" +
                "                        <a href=\"contact-form\" class=\"nav-link\">Contact Us</a>\n" +
                "                    </li>\n" +
                "                </ul>\n" +
                "                <form class=\"form-inline my-2 my-lg-0\">\n" +
                "                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n" +
                "                    <button class=\"btn btn-dark my-2 my-sm-0\" type=\"submit\">Search</button>\n" +
                "                </form>\n" +
                "            </div>\n" +
                "        </nav>\n" +
                "    </header>    \n" +
                "    <main>\n" +
                "        <div class=\"container\">\n" +
                "            <div class=\"jumbotron\">\n" +
                "                <h1 class=\"display-4\">Hello, world of HttpServlet 4.0!</h1>\n" +
                "                <h5>Welcome to Assignment 11</h5>\n" +
                "                <p class=\"lead\">This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>\n" +
                "                <hr />\n" +
                "                <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>\n" +
                "                <button class=\"btn btn-primary\">Learn more</button>\n" +
                "            </div>\n" +
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
