<%-- 
    Document   : exception
    Created on : 16 déc. 2022, 20:33:19
    Author     : P14A_77_Michael
--%>
<html>
    <head>
<link rel="stylesheet" href="css/bootstrap.css">
    </head>
    <body>
<%
    Exception e = (Exception) request.getAttribute("Exception");
    out.print("<h2 style='color: red'>" + e.getMessage()+ "</h2>");
%>
<hr>
<a href="./">retour</a>
    </body>
</html>
