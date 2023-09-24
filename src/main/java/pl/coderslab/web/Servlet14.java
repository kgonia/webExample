package pl.coderslab.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet14", value = "/Servlet14")
public class Servlet14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String browserDetails = request.getHeader("User-Agent");
        String ipAddress = request.getRemoteAddr();
        response.getWriter().println("browser: " + browserDetails);
        response.getWriter().println("ip: " + ipAddress);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
