/*!
 * A bit of jquery to handle the drop down panel for each skill category
 */

$(document).ready(function(){
    $(document).click(function(event){
    	var list = event.target.nextSibling.nextSibling.children[0];
    	var arrow = event.target.children[0];
    	if(event.target.className=="panel-heading"){
    		$(list).toggle();
    		if($(list).is(":visible")){
    			arrow.innerHTML = "&#9650";
    		}else if($(list).is(":hidden")){
    			arrow.innerHTML = "&#9660";
    		}
    	}
    });
});
