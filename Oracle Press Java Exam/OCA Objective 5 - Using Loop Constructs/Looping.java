class Looping{
	public static void main(String [] args) {
		int i = 5, j = 3;
		do{
			System.out.print(i + " " + j + " ");
		} while (i++ == 5 || ++j == 3); 
	}
}
/*
 * the do loop executes twice
 * j wasn't incremented in the 1st iteration 
 * as '||' evaluates i++ == 5 to true
 * in the 2nd iteration, i++ == 5 evaluates to false
 * '||' evaluates ++j == 3 to false
 * j was also incremented
 */
