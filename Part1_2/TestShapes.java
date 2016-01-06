class GameShape{
	public void displayShape(){
		System.out.println ("displaying shape");
	}
	// more code
}

class PlayerPiece extends GameShape{
	public void movePiece(){
		System.out.println ("moving game piece");
	}
	// more code
}

class TilePiece extends GameShape{
	public void getAdjacent(){
		System.out.println ("getting adjacent tiles");
	}
	// more code
}

public class TestShapes{
	public static void main(String args[]) {
    	PlayerPiece shape=new PlayerPiece();
    	TilePiece tile=new TilePiece();
    	shape.displayShape();
    	shape.movePiece();
    	doShapes(shape);
    	doShapes(tile);
    }

    public static void doShapes(GameShape shape){
    	shape.displayShape();
    }
}