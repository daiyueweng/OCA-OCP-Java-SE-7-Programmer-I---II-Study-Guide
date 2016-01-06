// Determine Whether a Default Constructor Will Be Created
class Animal{
	Animal(String name){

	}
}

class Horse4 extends Animal{
	Horse4(){
		super(); // Problem!
	}
}