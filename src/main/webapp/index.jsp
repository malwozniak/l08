<%@ page contentType="text/html;charset=UTF-8" import="javax.swing.*" %>
<!DOCTYPE html>
<html xmlns='http://www.w3.org/1999/xhtml'>

<head>
    <title>Main Form</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>

</head>
<body>
<div class="container pt-3 d-flex-column">
<form action="zapisz" method="post" class="form-inline">
    <div class="form-group  mx-sm-3  mb-2">
    <div class="col">
    <label>Podaj imie:  </label>
    </div>
    <div class="col">
    <input  class="form-control" type="text" id="fname" name="fname">
    </div>
       </div>
    <input type="submit" name="item" class="btn btn-primary mb-2" value="zapisz">
</form>

<%--    <form action="forget" method="get" class="form-inline">--%>
<%--        <input type="hidden" name="item" class="btn btn-secondary mb-2" value="forget">--%>
<%--    </form>--%>

<div class="p-2">Wpisz swoje imię, aby zobaczyć kontent.</div>
</div>
<%--<p><%--%>
<%--java.util.Random rnd = new java.util.Random();--%>

<%--int randomNum = rnd.nextInt(14)+1;--%>
<%--String[] arrayText = {"Rozmawia dwóch informatyków, jeden mówi do drugiego. \n"+--%>
<%--        "-Sluchaj, moze pozyczysz mi 500 PLN, no powiedzmy 512 tak dla równego rachunku.",--%>

<%--        "-Halo?\n"+--%>
<%--                "- Sklep obuwniczy, słucham.\n"+--%>
<%--                " -Przepraszam, pomyliłam numer.\n"+"- Niech Pani przyjdzie, wymienimy.",--%>


<%--    "W sklepie:\n"+--%>
<%--            " - Czy te żarówki rzeczywiście świecą 7 lat?" +--%>
<%--            "\n"+"- Oczywiście. Dajemy na to dwa lata gwarancji.",--%>


<%--        "Rozmawia dwóch kolegów:\n" +--%>
<%--                "- Mam najwyższe stanowisko w firmie.\n" +--%>
<%--                "- Moje gratulacje, jakie?\n" +--%>
<%--                "- Operator żurawia wieżowego.",--%>
<%--        "Dobry programista wiesza się razem ze swoim programem.",--%>


<%--        "Żona informatyka wysyła go po zakupy.\n" +--%>
<%--                "- Kup parówki, a jak będą jajka, to kup dziesięć.\n" +--%>
<%--                "Chłopina po wejściu do sklepu pyta:\n" +--%>
<%--                "- Czy są jajka?\n" +--%>
<%--                "- Tak - odpowiada sprzedawca.\n" +--%>
<%--                "- To poproszę dziesięć parówek.",--%>



<%--        "Trzeci raz z rzędu wpisałem nieprawidłowe captcha. A co, jeśli naprawdę jestem botem?!",--%>


<%--        "Wysprzątane mieszkanie to znak, że komputer jest zepsuty.",--%>



<%--        "Prawdziwy informatyk ma grupę krwi C:\\",--%>

<%--        "Czarne dziury powstały tam, gdzie Pan Bóg podzielił przez zero."--%>

<%--};--%>
<%--if( (randomNum > 9 )) {--%>
<%--    out.println("<img src='images/image" + randomNum + ".png' height=400 width=400/>");--%>
<%--//    out.println(randomNum);--%>
<%--}--%>
<%--else{--%>
<%--    out.println(arrayText[randomNum]);--%>
<%--//    out.println(randomNum);--%>
<%--}--%>
<%--%>--%>
<%--&lt;%&ndash;    <img src="images/image01.jpg" />&ndash;%&gt;--%>
<%--</p>--%>
</body>
</html>
