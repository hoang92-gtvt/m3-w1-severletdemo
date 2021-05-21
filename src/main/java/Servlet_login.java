import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet_login", value = "/login")
public class Servlet_login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("usename");
        String pass = request.getParameter("pass");

        PrintWriter writer = response.getWriter();


        writer.println("<html> <body>");
        writer.println("<META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        writer.println("<body>");
            if ("admin".equals(name)&& "123".equals(pass)){
                writer.println(name + "Đăng nhập thành công");
            }else
                writer.println("Login thất bại");

        writer.println("</body> </html>");

    }
}
