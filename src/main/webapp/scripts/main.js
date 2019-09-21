
function redirect(url){
	document.location = url;
}

function load(url){
	document.querySelector(".page-holder").innerHTML='<object type="text/html" class="page" data="'+url+'" ></object>';
}

/*check and add clicks to all menu items */
function initMenu() {
	var menuItems = document.querySelectorAll(".home .menu .menu-item");
	menuItems.forEach( (menu) => { 
	    menu.addEventListener('click', function(event) {
	        var url = this.getAttribute('url');
	    	if(url!=undefined)
	    		load(url);
	    });
	});
}

initMenu();