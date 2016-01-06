// Invoking Overloaded Methods
class Animal{
}
class Horse extends Animal{
}
class UseAnimals{
	public void doStuff(Animal a){
		System.out.println ("In the Animal version");
	}
	public void doStuff(Horse h){
		System.out.println ("In the Horse version");
	}
	public static void main (String[] args) {
		UseAnimals ua=new UseAnimals();
		Animal animalObj=new Animal();
		Animal animalRefToHorse = new Horse();
		Horse horseObj=new Horse();
		ua.doStuff(animalObj);
		ua.doStuff(horseObj);
		ua.doStuff(animalRefToHorse);
    }
}
