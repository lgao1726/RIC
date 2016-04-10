<%@ include file="header.jsp" %>
<script src="js/login.js"></script>

<div class="container">

      
        <h2 class="form-signin-heading">Connexion</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="text" id="inputEmail" class="form-control" placeholder="Mail" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Mot de Passe" required>
        <button onclick='verification()' class="btn btn-lg btn-primary btn-block"  >Connexion</button>
     

</div>
<%@ include file="footer.jsp" %>