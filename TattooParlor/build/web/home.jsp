<%-- 
    Advanced Systems Project 
    Team 3
    Tattoo Parlor 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<title>Team 3 Tattoo</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>
<!-- Navbar (sit on top) -->
<div class="w3-top">
  <div class="w3-bar w3-white w3-wide w3-padding w3-card">
    <a href="#home" class="w3-bar-item w3-button"><b>Team 3</b>Tattoo</a>
    <!-- Float links to the right. Hide them on small screens -->
    <div class="w3-right w3-hide-small">
      <a href="#gallery" class="w3-bar-item w3-button">Gallery</a>
      <a href="#about" class="w3-bar-item w3-button">About</a>
      <a href="LogInPage.jsp" class="w3-bar-item w3-button">Log In</a>
    </div>
  </div>
</div>

<!-- Header -->
<header class="w3-display-container w3-content w3-wide" style="max-width:1500px;" id="home">
    <img class="w3-image" src="homepic.jpg" alt="Tattoo Parlor" width="1500" height="800">
  <div class="w3-display-middle w3-margin-top w3-center">
    <h1 class="w3-xxlarge w3-text-white">Team 3 <span class="w3-hide-small w3-text-light-grey">Tattoo</span></h1>
  </div>
</header>

<!-- Page content -->
<div class="w3-content w3-padding" style="max-width:1564px">

  <!-- Gallery Section -->
  <div class="w3-container w3-padding-32" id="gallery">
    <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16">Gallery</h3>
  </div>

  <div class="w3-row-padding">
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <div class="w3-display-topleft w3-black w3-padding">Women Sleeve Tattoos</div>
        <img src="tattoo1.jpg" alt="Tattoo1" style="width:100%">
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <div class="w3-display-topleft w3-black w3-padding">Men Sleeve Tattoos</div>
        <img src="tattoo 2.jpeg" alt="Tattoo2" style="width:100%">
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <div class="w3-display-topleft w3-black w3-padding">Black and White Tattoos</div>
        <img src="tattoo 3.jpeg" alt="Tattoo3" style="width:100%">
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <div class="w3-display-topleft w3-black w3-padding">Couples Tattoos</div>
        <img src="tattoo 4.jpg" alt="Tattoo4" style="width:100%">
      </div>
    </div>
  </div>
    

  <!-- About Section -->
  <div class="w3-container w3-padding-32" id="about">
    <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16">About</h3>
    <p>We are the premier tattoo and piercing studio with highly sought after artists and skilled piercers. We offer a welcoming environment with a friendly and diverse staff that strives to exceed your expectations. Our artists are skilled in realism, traditional, neo-traditional, portrait and watercolor tattoos. 
    </p>
  </div>

  <div class="w3-row-padding w3-grayscale">
    <div class="w3-col l3 m6 w3-margin-bottom">
        <img src="tattooartist2.jpeg" alt="John" style="width:100%">
      <h3>John Doe</h3>
      <p class="w3-opacity">Lead Tattoo Artist</p>
      <p>something something something</p>
 
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
        <img src="tattooartist1.jpg" alt="Jane" style="width:80%">
      <h3>Jane Doe</h3>
      <p class="w3-opacity">Tattoo Artist</p>
      <p>Blah blah brain fart</p>
 
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
        <img src="tattooartist3.jpeg" alt="Mike" style="width:100%">
      <h3>Mike Ross</h3>
      <p class="w3-opacity">Tattoo Artist</p>
      <p>Something about this guy... </p>
     
    </div>
  </div>
  
      
      
      
      
      
  
<!-- Image of location/map -->
<div class="w3-container">
    <img src="tattooshop.jpg" class="w3-image" style="width:50%">
</div>

<!-- End page content -->



<!-- Footer -->
<footer class="w3-center w3-black w3-padding-16">
 
</footer>

</body>
</html>
