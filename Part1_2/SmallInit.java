//Initialization Blocks
class SmallInit{
	static int x;
	int y;

	static { x = 7; } // static init block
	{ y = 8; } 		  // instance init block

}