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

<h1>Création d'un utilisateur</h1>

<div class="container">

 <nav>
    <div class="nav-wrapper">
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="Utilisateur?action=Utilisateur">UTILISATEUR</a></li>

      </ul>
    </div>
  </nav>
  
  
    <form action="Utilisateur?action=Utilisateur" method="post">
   <label for="NomUtilisateur">Nom  :</label> <input type="text"  name="Nom">
   <label for="MotDePasseUtilisateur">Mot de passe :</label>  <input type="text"  name="MotDePasse">

   
   
   
   <input type="submit" value="Valider" />
 </form>
  
  
  
  
  
</div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</body>
</html>