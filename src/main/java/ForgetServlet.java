import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static java.lang.System.out;

@WebServlet("/zapomnij")
public class ForgetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
//        super.doGet(req, resp);

        try {


            HttpSession session=req.getSession(true);
            req.setCharacterEncoding(StandardCharsets.UTF_8.name());
            String imie = req.getParameter("fname");
            session.removeAttribute(imie);
            resp.sendRedirect("index.jsp");
        }
        catch(Exception exp){
            out.println(exp);
        }
    }


}
