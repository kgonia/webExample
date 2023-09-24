package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Get1", urlPatterns = "/get1")
public class Get1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String startParam = req.getParameter("start");
        String endParam = req.getParameter("end");

        if(startParam == null || endParam == null) {
            resp.getWriter().print("BRAK");
            return;
        }

        Integer start = Integer.parseInt(startParam);
        Integer end = Integer.parseInt(endParam);

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = start; i<= end; i++){
            stringBuilder.append(i).append(" ");
        }

        resp.getWriter().print(stringBuilder.toString());
    }
}
