public class Nums{
	public static void main(String [] args) {
		int i = 0; int j = 0;
		for (i = 0; i < 5; i++)
		{
			if (i == 2) continue;
			j++;
		}
		System.out.println("i=" + i + " j=" + j);
	}
}
