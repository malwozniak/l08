import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;

import static java.lang.System.out;

@WebServlet("/zapisz")
public class SaveServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        try {

            HttpSession session=req.getSession(true);
            req.setCharacterEncoding(StandardCharsets.UTF_8.name());
            resp.setContentType("text/html");
            resp.setCharacterEncoding("UTF-8");
            PrintWriter out = resp.getWriter();
            out.println("<html >");
            out.println("<head><title>Save Servlet" +
                    "</title>" +
                    "<meta charset='UTF-8'>"+
                    "" +
                    "<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css'>"+
    "<script src='https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js'></script>"+
                    "<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n"+

                    "</head>");
            out.println("<body>");
            String imie = req.getParameter("fname");
            String obj = req.getParameter("object");
            session.setAttribute("fname", imie);

            java.util.Random rnd = new java.util.Random();
            out.println("<div class='container pt-3'>");
            out.println("<div class='form-inline'>");
            out.println("<div class='col'>");
            out.println("<h2>Hello");
            out.println(imie);
            out.println("</h2></div>");
            out.println("<div class='col'>");
            out.println("<form action=\"zapomnij\" method=\"get\">");
            out.println("<input type='submit' name='item' class='btn btn-secondary mb-2' value='zapomnij'>");
            out.println("</form>");
            out.println("</div>");
            out.println("</div>");
            int randomNum = rnd.nextInt(14)+1;
            String[] arrayText = {"Rozmawia dw??ch informatyk??w, jeden m??wi do drugiego. \n"+
                    "-Sluchaj, moze pozyczysz mi 500 PLN, no powiedzmy 512 tak dla r??wnego rachunku.",

                    "-Halo?\n"+
                            "- Sklep obuwniczy, s??ucham.\n"+
                            " -Przepraszam, pomyli??am numer.\n"+"- Niech Pani przyjdzie, wymienimy.",


                    "W sklepie:\n"+
                            " - Czy te ??ar??wki rzeczywi??cie ??wiec?? 7 lat?" +
                            "\n"+"- Oczywi??cie. Dajemy na to dwa lata gwarancji.",


                    "Rozmawia dw??ch koleg??w:\n" +
                            "- Mam najwy??sze stanowisko w firmie.\n" +
                            "- Moje gratulacje, jakie?\n" +
                            "- Operator ??urawia wie??owego.",
                    "Dobry programista wiesza si?? razem ze swoim programem.",


                    "??ona informatyka wysy??a go po zakupy.\n" +
                            "- Kup par??wki, a jak b??d?? jajka, to kup dziesi????.\n" +
                            "Ch??opina po wej??ciu do sklepu pyta:\n" +
                            "- Czy s?? jajka?\n" +
                            "- Tak - odpowiada sprzedawca.\n" +
                            "- To poprosz?? dziesi???? par??wek.",



                    "Trzeci raz z rz??du wpisa??em nieprawid??owe captcha. A co, je??li naprawd?? jestem botem?!",


                    "Wysprz??tane mieszkanie to znak, ??e komputer jest zepsuty.",



                    "Prawdziwy informatyk ma grup?? krwi C:\\",

                    "Czarne dziury powsta??y tam, gdzie Pan B??g podzieli?? przez zero."

            };
            if( (randomNum > 9 )) {
                out.println("<img name='object' src='images/image" + randomNum + ".png' height=400 width=400/>");

//    out.println(randomNum);
            }
            else{
                out.println("<h4 name='object'>"+arrayText[randomNum]+"</h4>");

            }
            out.println("</div>");
            out.println("</body></html>");
            out.close();

           if(imie == " ") resp.sendRedirect("/index.jsp");
        }
        catch(Exception exp){
            out.println(exp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        resp.sendRedirect("/index.jsp");
    }

}

