//overall app logic and loader
function fireResturant() {
	"use strict";

	$(function(){
		$("#header").load("views/templates/header.html"); 
		$("#navbar").load("views/templates/navbar.html");
		$("#content").load("views/main.html");
		$("#footer").load("views/templates/footer.html");
	});

	$(document).on('click', '#aNav', function(e) {

		e.preventDefault();
		$('#content').load($(this).attr('href'));
	});
};

$(document).ready(fireResturant);
