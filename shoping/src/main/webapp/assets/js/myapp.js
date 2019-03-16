$(function(){
	//solving the active menu problame
	switch (menu) {
	case 'home':
		$('#about').addClass('active');
		break;
	case 'contact':
		$('#contact').addClass('active');
		break;
	case 'about':
		$('#about').addClass('active');
		break;

	default:
		$('#about').addClass('active');
		break;
	}
	
});