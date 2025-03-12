package com.example.chenlei2023211001000407;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "ConfigDemoServlet",
        urlPatterns = "/config",
        initParams = {
                @WebInitParam(name= "name1" ,value = "ChenLei2"),
                @WebInitParam(name= "studentId1" , value = "2023211001000407")
        }
)


public class ConfigDemoServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //super.doGet(req, resp);
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        // 获取注解配置的Servlet参数
        String name1 = getServletConfig().getInitParameter("name1");
        String studentId1 = getServletConfig().getInitParameter("studentId1");

        // 获取web.xml配置的Servlet参数
        String name = getServletConfig().getInitParameter("name");
        String studentId = getServletConfig().getInitParameter("studentId");

        // 打印参数名称和值
        out.println("<html><body>");
        out.println("<h2>Task 1-Get init parameters from web.xml</h2>");
        out.println("<p>姓名：" + name + "</p>");
        out.println("<p>学生 ID：" + studentId + "</p>");
        out.println("</body></html>");

        out.println("<html><body>");
        out.println("<h2>Task 2-Get init parameters from @WebServlet</h2>");
        out.println("<p>姓名: " + name1 + "</p>");
        out.println("<p>学生ID: " + studentId1 + "</p>");

    }
}
