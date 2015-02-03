package es.upm.oeg.smartcity;

public class HTMLblocksDataPage {

	public static final String header = "<!DOCTYPE html>\n" + 
	"<html lang=\"en\">\n" + 
	"  <head>\n" + 
	"    <meta charset=\"UTF-8\">\n" + 
	"    <title>smartcity.linkeddata.es</title>\n" + 
	"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" + 
	"    <meta name=\"description\" content=\"This web displayes the information of a dataset identify in smart city dataset catalogue.\">\n" + 
	"    <meta name=\"Languaje\" content=\"English\">\n" + 
	"    <meta name=\"Keywords\" content=\"ontology, smart city, energy efficiency\">\n" + 
	"    <meta name=\"author\" content=\"Mar�a Poveda Villal�n\">\n" + 
	"    \n" + 
    "    <script src=\"../../dist/js/jquery-1.11.0.js\"></script>\n" +
    "    <script src=\"../../dist/js/bootstrap.min.js\"></script>\n" + 
	"    <script src=\"../../dist/js/jquery.js\"></script>\n" +
	"    <link rel=\"stylesheet\" href=\"../../themes/blue/style.css\" type=\"text/css\" media=\"print, projection, screen\" />\n" +
	"    <script type=\"text/javascript\" src=\"../../dist/js/jquery.tablesorter.min.js\"></script>\n" +
	"    <script type=\"text/javascript\" id=\"js\">\n" +
	"	    $(document).ready(function() \n" +
	"		    { \n" +
	"		    	$(\"#tablesorter-demo\").tablesorter(); \n" +
	"		    	$('.collapse').collapse({ \n"+
	"		    	toggle: false\n"+
	"		    	});\n"+
	"		    } \n" +
	"	    ); \n" +
	"    </script>\n" +
	"\n" + 
	"    <!-- Le styles -->\n" + 
	"    <link href=\"../../dist/css/bootstrap.css\" rel=\"stylesheet\">\n" + 
	"    <style type=\"text/css\">\n" + 
	"      body {\n" + 
	"        padding-top: 60px;\n" + 
	"        padding-bottom: 40px;\n" + 
	"      }\n" + 
	"    </style>\n" + 
	"    <link href=\"../../dist/css/bootstrap-responsive.css\" rel=\"stylesheet\">\n" + 
	"    \n" + 
	"    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\n" + 
	"    <!--[if lt IE 9]>\n" + 
	"      <script src=\"../../dist/js/html5shiv.js\"></script>\n" + 
	"    <![endif]-->\n" + 
	"\n" + 
	"    <!-- Fav and touch icons -->\n" + 
	"    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"../../dist/ico/apple-touch-icon-144-precomposed.png\">\n" + 
	"    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"../../dist/ico/apple-touch-icon-114-precomposed.png\">\n" + 
	"    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"../../dist/ico/apple-touch-icon-72pcomposed.png\">\n" + 
	"    <link rel=\"apple-touch-icon-precomposed\" href=\"dist/ico/apple-touch-icon-57-precomposed.png\">\n" + 
	"    <link rel=\"shortcut icon\" href=\"../../dist/ico/favicon.png\">\n" + 
	"  </head>\n" + 
	"\n" + 
	"  <body>\n" + 
	"\n" + 
	
    "<div class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n" + 
    "  <div class=\"container\">\n" + 
    "    <div class=\"navbar-header\">\n" + 
    "      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n" + 
    "        <span class=\"sr-only\">Toggle navigation</span>\n" + 
    "        <span class=\"icon-bar\"></span>\n" + 
    "        <span class=\"icon-bar\"></span>\n" + 
    "        <span class=\"icon-bar\"></span>\n" + 
    "      </button>\n" + 
    "    </div>\n" + 
    "    <div class=\"collapse navbar-collapse\">\n" + 
    "      <ul class=\"nav navbar-nav\">\n" + 
    "        <li><a href=\"../../index.html\">Ontologies</a></li>\n" + 
    "        <li><a href=\"../../datasets/index.html\">Datasets</a></li>\n" + 
    "        <li><a href=\"../../about.html\">About</a></li>\n" + 
    "      </ul>\n" + 
    "    </div><!--/.nav-collapse -->\n" + 
    "  </div>\n" + 
   " </div>\n" + 
    
	"    <div class=\"container\">\n" + 
	"\n" ;

public static final String end = "<hr>\n" +
	"" +
	"      <footer>\n" +
	"      " +
	"      <div class=\"row\">\n" +
	"    	<div class=\"col-md-7\">\n" +
	"    		Developed by " +
	"	        <a href = \"http://oeg-upm.net\" target=\"_blank\">Ontology Engineering Group</a>\n" +
//	"	        <br>\n" +
//	"	        Contact email: mpoveda(at)fi.upm.es\n" +
	"	        <br>\n" +
	"    	Built with <a target=\"_blank\" href=\"http://getbootstrap.com/\">Bootstrap</a>\n" +
	"    	Icons from <a target=\"_blank\" href=\"http://glyphicons.com/\">Glyphicons</a>\n " +	
	"	        <br>\n" +
	"	        Latest revision June 2014\n" +
	"        </div>\n" +			
	"    	<div class=\"col-md-5\">\n" +
	"		<p class=\"text-center\"> Supported by: </p>\n" +
	"		<p class=\"text-right\">\n" +
	"    		<a href=\"http://www.ready4smartcities.eu\" target=\"_blank\"><img src=\"../../images/logoReadySmall.jpg\" alt=\"Ready4SmartCities logo\" class=\"img-rounded\" class=\"img-responsive\" /></a>\n " +
	"    		<a href=\"http://www.oeg-upm.net/\" target=\"_blank\"><img src=\"../../images/logoOEG.png\" alt=\"OEG logo\" class=\"img-rounded\" class=\"img-responsive\" /></a>\n" +
	"    	</p>\n" +
	"    	</div>\n" +
	"      </div>\n" +
	"" +
	"      </footer>\n" +
	"" +
	"    </div> <!-- /container -->\n" +
	"" +
	"    <!-- Le javascript\n" +
	"    ================================================== -->\n" +
	"    <!-- Placed at the end of the document so the pages load faster -->\n" +
	"    <script src=\"assets/js/bootstrap-transition.js\"></script>\n" +
	"    <script src=\"assets/js/bootstrap-alert.js\"></script>\n" +
	"    <script src=\"assets/js/bootstrap-modal.js\"></script>\n" +
	"    <script src=\"assets/js/bootstrap-dropdown.js\"></script>\n" +
	"    <script src=\"assets/js/bootstrap-scrollspy.js\"></script>\n" +
	"    <script src=\"assets/js/bootstrap-tab.js\"></script>\n" +
	"    <script src=\"assets/js/bootstrap-tooltip.js\"></script>\n" +
	"    <script src=\"assets/js/bootstrap-popover.js\"></script>\n" +
	"    <script src=\"assets/js/bootstrap-button.js\"></script>\n" +
	"    <script src=\"assets/js/bootstrap-collapse.js\"></script>\n" +
	"    <script src=\"assets/js/bootstrap-carousel.js\"></script>\n" +
	"    <script src=\"assets/js/bootstrap-typeahead.js\"></script>\n" +
	"" +
	"<script>\n" +
	"(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){ (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n" +
	"m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n" +
	"})(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n" +
	"ga('create', 'UA-48904250-1', 'linkeddata.es');\n" +
	"ga('send', 'pageview');\n" +
	"</script>\n" +
	"" +
	"  </body>\n" +
	"</html>\n";
	
}
