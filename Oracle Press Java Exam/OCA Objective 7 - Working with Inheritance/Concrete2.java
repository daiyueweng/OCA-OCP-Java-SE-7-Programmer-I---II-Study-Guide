interface Face1{
	int m1(int a1);
}
interface Face2{
	int m2(int a2);
}
class Concrete2 implements Face2{ // valid implementation 
	public int m2(int l){ return 7; } }
//abstract class Concrete2 implements Face2, Face1{ // abstract classes do not need to fully implement the interfaces they implement
	//public int m4(){ return 7; } }
//class Concrete2 extends Face1{ // a class cannot extend an interface
	//public int m3(int r); }
//interface Concrete2 implements Face1{ // an interface cannot implement anything
	//public int m1(int y) { return 7; } }
//class Concrete2 implements Face2{ // Face2 does not have method m1
	//public int m1(int r){ return 7; } }