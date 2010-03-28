<% include '/WEB-INF/includes/header.gtpl' %>

<h1>Welcome to agilesquared.com </h1>

<p id="patient" >
    Please be patient. Something awesome is coming here soon.
</p>
<script type="text/javascript">
    \$(document).ready(function() {
        \$("#img_div").fadeIn("slow");

    });
</script>
<div id = "img_div">
     <img class="centered" src=<%=request.getAttribute('randomConstructionPic')%>>
</div>

<!--
<p>
    Click <a href="datetime.groovy">here</a> to view the current date/time.
</p>
-->

<% include '/WEB-INF/includes/footer.gtpl' %>

