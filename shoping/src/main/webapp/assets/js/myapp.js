$(function(){
	//solving the active menu problame
	switch (menu) {
	case 'home':
		$('#home').addClass('active');
		break;
	case 'contact':
		$('#contact').addClass('active');
		break;
	case 'about':
		$('#about').addClass('active');
		break;

	default:
		$('#home').addClass('active');
		break;
	}
	
});