import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login")
public class Test extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello Servlet!!!");//向控制台输出
        //设置编码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        //设置服务器响应的格式
        resp.setContentType("text/html");

        //从浏览器接收参数
        String name = req.getParameter("name");
        //在控制台输出从浏览器接收的参数
        System.out.println(name);
        //向浏览器页面输出
        resp.getWriter().println("<font color='red'>我要通过Servlet在浏览器页面输出</font>");
    }
}
