package miu.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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

        String name = request.getParameter("name");
        String gender = request.getParameter("radioGender");
        String category = request.getParameter("category");
        String message = request.getParameter("message");

        String errorMessage = request.getAttribute("errorMessage") != null ?  request.getAttribute("errorMessage").toString() : null;
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
                "            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
                "                <ul class=\"navbar-nav mr-auto\">\n" +
                "                    <li class=\"nav-item\">\n" +
                "                        <a href=\"home\" class=\"nav-link\">Home</a>\n" +
                "                    </li>\n" +
                "                    <li class=\"nav-item\">\n" +
                "                        <a href=\"#\" class=\"nav-link\">About</a>\n" +
                "                    </li>\n" +
                "                    <li class=\"nav-item active\">\n" +
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
                "        <div class=\"container my-4\">\n" +
                "            <h3 style=\"font-weight: 400;\">Customer Contact Form</h3>\n" +
                "            <div class=\"mb-2\" style=\"color:red;\">\n" +
                                (errorMessage == null ? "" : errorMessage) +
                "            </div>\n" +
                "            <form action=\"process-contact-form\" method=\"post\">\n" +
                "                <div class=\"form-group\">\n" +
                "                    <label for=\"name\">*Full Name:</label>\n" +
                "                    <input type=\"text\" class=\"form-control\" name=\"name\" value=\"" + getStringValue(name) + "\">\n" +
                "                    <small class=\"form-text text-muted\">Enter your full name.</small>\n" +
                "                </div>\n" +
                "                <label>*Gender:</label><br>\n" +
                "                <div class=\"form-group\">\n" +
                "                    <div class=\"custom-control custom-radio custom-control-inline\">\n" +
                "                        <input type=\"radio\" name=\"radioGender\" id=\"radioGenderMale\" class=\"custom-control-input\" value=\"male\"" +
                                            (getStringValue(gender).equals("male") ? "checked" : "") + ">\n" +
                "                        <label for=\"radioGenderMale\" class=\"custom-control-label\">Male</label>\n" +
                "                    </div>\n" +
                "                    <div class=\"custom-control custom-radio custom-control-inline\">\n" +
                "                        <input type=\"radio\" name=\"radioGender\" id=\"radioGenderFemale\" class=\"custom-control-input\" value=\"female\"" +
                                            (getStringValue(gender).equals("female") ? "checked" : "") + ">\n" +
                "                        <label for=\"radioGenderFemale\" class=\"custom-control-label\">Female</label>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"form-group\">\n" +
                "                    <labl for=\"category\">*Category:</label>\n" +
                "                    <select class=\"form-control\" id=\"category\" name=\"category\">\n" +
                "                        <option value=\"\">Select...</option>\n" +
                "                        <option value=\"Feedback\"" + (getStringValue(category).equals("Feedback") ? " selected" : "") + ">Feedback</option>\n" +
                "                        <option value=\"Inquiry\"" + (getStringValue(category).equals("Inquiry") ? " selected" : "") + ">Inquiry</option>\n" +
                "                        <option value=\"Complaint\"" + (getStringValue(category).equals("Complaint") ? " selected" : "") + ">Complaint</option>\n" +
                "                    </select>\n" +
                "                </div>\n" +
                "                <div class=\"form-group\">\n" +
                "                    <label for=\"message\">*Message:</label>\n" +
                "                    <textarea class=\"form-control\" name=\"message\" id=\"message\" cols=\"30\" rows=\"3\">" +
                                        getStringValue(message) + "</textarea>\n" +
                "                </div>\n" +
                "                <button class=\"btn btn-primary btn-block\" type=\"submit\">Submit</button>\n" +
                "            </form>\n" +
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

    private String getStringValue(String str) {
        return str == null ? "" : str.trim();
    }
}
