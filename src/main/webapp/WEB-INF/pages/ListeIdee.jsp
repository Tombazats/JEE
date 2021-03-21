<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

</head>
<body>

<h1>Liste des idées</h1>

<div class="container">

 <nav>
    <div class="nav-wrapper">
      <a href="home" class="brand-logo">HOME</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="idee?action=creer">Créer une idée</a></li>

      </ul>
    </div>
  </nav>
  

  <div class="row">
    <div class="col s12 m7">
      <c:forEach items="${idee}" var="idee">
      <div class="card">
        <div class="card-image">
          <img src=<c:out value="${idee.getUrlImage()}"/>>
          <span class="card-title"><c:out value="${idee.getTitre()}"/></span>
        </div>
        <div class="card-content">
          <p><c:out value="${idee.getDescription()}"/></p>
        </div>
        <div class="card-action">
          <p><c:out value="${idee.getCategorie()}"/></p>
        </div>
        <div>
        <input type="submit" value="Top" /><p>Compteur TOP</p>
        <input type="submit" value="Flop" /><p>Compteur FLOP</p><br>
        </div>
      </div>
      </c:forEach>
    </div>
  </div>
  
  
  <!--  
  
      <table> 
        <tr>
            <td>Titre</td>
            <td>Description</td>
            <td>Catégorie</td>
            <td>Note</td>
        </tr>
   

           <c:forEach items="${idee}" var="idee">
            <tr>
                <td><c:out value="${idee.getTitre()}"/></td>
                <td><c:out value="${idee.getDescription()}"/></td>
                <td><c:out value="${idee.getCategorie()}"/></td>
            </tr>
           </c:forEach>
   </table>
   
   -->
  
  
</div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</body>
</html>