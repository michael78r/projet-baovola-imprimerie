<%-- 
    Document   : insertemployee
    Created on : 12 janv. 2023, 15:37:20
    Author     : P14A_77_Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="assets/css/style_form4.css">
    <title>Formulaire d'Ajout Employée</title>
  </head>

  <body>
    <div class="login-root">
      <div class="box-root flex-flex flex-direction--column" style="min-height: 100vh;flex-grow: 1;">
        <div class="loginbackground box-background--white padding-top--64">
          <div class="loginbackground-gridContainer">
          <div class="box-root flex-flex" style="grid-area: top / start / 8 / end;">
               <div class="box-root" style="background-image: linear-gradient(white 0%, rgb(247, 250, 252) 33%); flex-grow: 1;">
              </div>
            </div>
          </div>
        </div>
        <div class="box-root padding-top--24 flex-flex flex-direction--column" style="flex-grow: 1; z-index: 9;">
          <div class="box-root padding-top--48 padding-bottom--24 flex-flex flex-justifyContent--center">
            <h1><a href="http://blog.stackfindover.com/" rel="dofollow">Ajout d'employée</a></h1>
          </div>
          <div class="formbg-outer">
            <div class="formbg">
              <div class="formbg-inner padding-horizontal--48">
                <form id="stripe-login" action="InsertionEmployee">
                  <div class="field padding-bottom--24">
                    <label for="nom">Nom</label>
                    <input type="text" name="nom">
                  </div>
                    
                  <div class="field padding-bottom--24">
                    <label for="nom">Prénom</label>
                    <input type="text" name="prenom">
                  </div>
                    
                  <div style="margin:0 0 10px 0;">
                    <label for="nom">Genre</label>
                    <select name="genre">
                      <option value="GENRE3">male</option>
                      <option value="GENRE4" selected>female</option>
                    </select>
                  </div>
                    
                  <div class="field padding-bottom--24">
                    <label for="dtn">Date de naissance</label>
                    <input type="date" name="date_naissance">
                  </div>
                    
                  <div class="field padding-bottom--24">
                    <label for="specs">Spécialité</label>
                    <select name="specialite">
                      <option value="SPEC13">Machiniste</option>
                      <option value="SPEC14" selected>Reliure</option>              
                    </select>
                  </div>
                    
                  <div class="field padding-bottom--24">
                    <label for="NE">Niveau d'étude</label>
                    <select name="NE">
                      <option value="Niv_etude1">BACC</option>
                      <option value="Niv_etude2" selected>LICENSE</option>              
                    </select>
                  </div>
                  <div class="field padding-bottom--24">
                    <input type="submit" name="submit" value="Inserer">
                  </div>
                </form>
              </div>
            </div>
            <div class="footer-link padding-top--24">
              <div class="listing padding-top--24 padding-bottom--24 flex-flex center-center">
                <span><a href="#">Contact</a></span>
                <span><a href="#">Acceuil</a></span>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>

  </html>
  </body>
</html>
