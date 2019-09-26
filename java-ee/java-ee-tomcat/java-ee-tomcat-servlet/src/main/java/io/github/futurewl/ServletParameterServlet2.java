package io.github.futurewl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "servletParameterServlet2",
        urlPatterns = "/servletParameters2",
        initParams = {
                @WebInitParam(name = "database", value = "CustomerSupport"),
                @WebInitParam(name = "server", value = "10.0.12.5")
        }
)
public class ServletParameterServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = this.getServletConfig();
        PrintWriter writer = resp.getWriter();
        writer
                .append("servletParameters2 ->")
                .append("database: ").append(servletConfig.getInitParameter("database"))
                .append(", server: ").append(servletConfig.getInitParameter("server"));
    }
}
