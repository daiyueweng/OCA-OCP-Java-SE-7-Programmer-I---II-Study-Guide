class Animal { }
class Gerbil extends Animal { }
class Vet {
	Animal go() { return new Animal(); }
}
class SmallAnimalVet extends Vet {
	Gerbil go() { return new Gerbil(); } // 7 covariant return
	//Animal go() { return new Animal(); } // 8 
	//Gerbil go() { return new Animal(); } // 9 Animal object cannot do what Gerbil can do
	//Animal go() { return new Gerbil(); } // 10 uncommented simultaneously would create illegal overloads
}