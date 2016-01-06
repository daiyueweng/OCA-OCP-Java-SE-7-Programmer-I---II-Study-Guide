public class For{
	public static void main(String [] args) {
		int [] nums = new int[] {4, 3, 2, 1};
		int total = 0;
		for (int x: nums) {
			if (x == nums.length)
				continue;
			total += x;
		}
		System.out.println(total);
	}
}