package io.github.futurewl;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        WebApplication webApp = WebApplication.getInstance(this.getServletContext());
        // 设置用户数据
        Context ctx = new Context();
        ctx.setVariable("users", getUsers());
        // 获取模板引擎实例
        TemplateEngine engine = webApp.getEngine();
        String result = engine.process("user", ctx);
        response.setContentType("text/html;charset=UTF-8");
        // 输出渲染后的 HTML
        response.getWriter().print(result);
    }

    /**
     * 获取用户数据
     */
    private List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "User A"));
        users.add(new User(2, "User B"));
        users.add(new User(3, "User C"));
        return users;
    }
}
