import java.util.Arrays;

public class PlayListFromPoint {
	static void getPlayListPoint(int num) {
		int[] list = { 15, 4, 2, 0, 1, 5, 42, 41, 5, 10, 2, 41, 4, 20, 2 };
		// Arrays.sort(list);
		// for (int i = 0; i < list.length; i++) {
		for (int j = 0; j < list.length; j++) {
			if (list[j] == num) {
				
				int index_of_j = j;
				for (int i = 0; i < list.length - index_of_j; i++) {
					
					System.out.println(list[j]);
					j++;
				}
			}
		}
		// }
	}

	public static void main(String[] args) {
		getPlayListPoint(20);
	}
}
