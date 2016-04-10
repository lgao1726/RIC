<%@ include file="header.jsp" %>
	<div id="content">
	   <!-- Main jumbotron for a primary marketing message or call to action -->
    <!-- Carousel
    ================================================== -->
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img class="img-responsive center-block" src="images/tennis_shoes.jpg" alt="First slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>Jouez avec nous.</h1>
              <p>Racquettes INSA Club</p>
              <p><a class="btn btn-lg btn-primary" href="./about.jsp" role="button">Découvrez nous &raquo</a></p>
            </div>
          </div>
        </div>
        <div class="item">
          <img class="img-responsive center-block" src="images/RIC_banner.png" alt="Second slide">
          <div class="container">
            <div class="carousel-caption">
              <h1 style="color:grey"></h1>
              <p style="color:black">Racquettes INSA Club</p>
              <p><a class="btn btn-lg btn-primary" href="./about.jsp" role="button">Découvrez nous &raquo</a></p>
            </div>
          </div>
        </div>
        <div class="item">
          <img class="img-responsive center-block" src="images/bureau.jpg">
          <div class="container">
            <div class="carousel-caption">
              <h1></h1>
              <p> </p>
              <p><a class="btn btn-lg btn-primary" href="./about.jsp" role="button">Decouvrez nous</a></p>
            </div>
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div><!-- /.carousel -->
   

    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-md-4">
          <h2>Découvrez nous</h2>
          <p>          	
          	Le Racquettes INSA Club est l'association des fous des sports de raquettes depuis des 
          	décennies (1988) ! Nous sommes toujours contents d'acceuillir des nouvels joueurs<br><br>
          </p>
          <p><a class="btn btn-default" href="./WHOOPS.jsp" role="button">Découvrez nous &raquo;</a></p>
        </div>
        <div class="col-md-4">
          <h2>Évènements</h2>
          <p>
          	Nous organisons régulièrement des tournois pendant l'année scolaire, hésitez
          	pas à vous inscrire. Ce qu'il y a de bien, c'est que ces sports sont ouverts à tous les niveaux !
          	Trouvez toutes les événements ici et soit bien préparé pour le prochain tournoi.
          </p>
          <p><a class="btn btn-default" href="./WHOOPS.jsp" role="button">Événements &raquo;</a></p>
        </div>
        <div class="col-md-4">
          <h2>Contactez nous</h2>
          <p>
          	Nous sommes une association active avec beacoup de membres motivés. Si vous avez des
          	questions sur les sports de racquettes, les entraînements ou même les couleurs préférés
          	par nos membres hésitez pas à nous contacter  
          </p>
          <p><a class="btn btn-default" href="./WHOOPS.jsp" role="button">Événements &raquo;</a></p>
       </div>
      </div>
	</div>
    
<%@ include file="footer.jsp" %>