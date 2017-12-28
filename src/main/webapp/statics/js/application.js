function turnPage(nowPage) {
	var urls = window.location.href;
    var sites = urls.indexOf("#");
    if(sites > 0){
    	urls = urls.substring(0,sites);
    }
	var site = urls.indexOf("?");
	if(site > 0) {
		urls = urls.substring(0,site);
	}
	urls = urls+"?nowPage="+nowPage;
	
	var queryJsonStr = document.getElementById("queryJsonStr").value;
	if(queryJsonStr!=null && queryJsonStr!=""){
		urls = urls + "&queryJsonStr="+queryJsonStr;
	}
		
	window.location.href = urls;
}