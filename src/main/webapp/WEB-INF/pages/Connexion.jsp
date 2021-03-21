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

<h1>PAGE DE CONNEXION</h1>

<div class="container">

 <nav>
    <div class="nav-wrapper">
      <ul id="nav-mobile" class="right hide-on-med-and-down">

      </ul>
    </div>
  </nav>
  
  
    <form action="Utilisateur?action=Connexion" method="post">
   <label for="NomUtilisateur">Nom  :</label> <input type="text"  name="NomConnexion">
   <label for="MotDePasseUtilisateur">Mot de passe :</label>  <input type="text"  name="MotDePasseConnexion">

   
   
   
   
   <input type="submit" value="Valider" />
 </form>
  
  
</div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</body>
</html>