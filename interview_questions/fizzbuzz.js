switch(true){
	case(n%3==0 && n%5==0):
		console.log("FizzBuzz");
		break;
	case(n%3==0):
		console.log("Fizz");
		break;
	case(n%5==0):
		console.log("Buzz");
		break;
	default:
		console.log(n);

}