class Mystery{
	public static void main(String [] args) {
		for (int i = 0; true | false; i++){         // the loop will execute twice, i = 1 at the 2nd iteration
			if (--i == 0 || i == 2){                // when i = 1, --i == 0 evaluated to true
			   System.out.print("Yes: " + i + " "); // print "Yes: 0"
			   break;                               // then exit the for loop
			}else if (i++ % 2 == 0){
				System.out.print("No: " + i + "");
			}
		}
	}
}
