<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

</head>
<body>

<h1>Création d'une idée</h1>

<div class="container">

 <nav>
    <div class="nav-wrapper">
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="idee?action=creer">IDEE</a></li>

      </ul>
    </div>
  </nav>
  
  
    <form action="idee" method="post">
   <label for="titreIdee">Titre  :</label> <input type="text"  name="titre">
   <label for="descriptionIdee">Description :</label>  <input type="text"  name="description">
   <label for="categorieIdee">Catégorie :</label>  <input type="text"  name="categorie">
   <label for="urlImageIdee">Adresse de l'image :</label>  <input type="text"  name="urlImage">
   
   
   <input type="submit" value="Valider" />
 </form>
  
  
</div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</body>
</html>