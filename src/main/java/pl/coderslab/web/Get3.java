package pl.coderslab.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Get3", value = "/Get3")
public class Get3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String widthParam = request.getParameter("width");
        String heightParam = request.getParameter("height");

        Integer width;
        if(widthParam == null) {
            width = 5;
        } else {
            width = Integer.parseInt(widthParam);
        }

        Integer height;
        if(heightParam == null) {
            height = 10;
        } else {
            height = Integer.parseInt(heightParam);
        }

        for(int i = 1; i <= height; i++){

            for (int j=1; j <= width; j++){
                response.getWriter().print(i * j);

            }
            response.getWriter().println("");
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
