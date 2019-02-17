public class Tomb {
	
	public static void main(String[] args) {
		int[][] tomb2d = new int[][] {
					new int[] { 7, 6, 3, 2 },
					new int[] { 1, 2 },
					new int[] { 3, 9, 5 },
		};
		tomb2dKiir(tomb2d);
		System.out.println("sorok száma: " + tomb2d.length); // 3
		System.out.println("elemek száma a 0. sorban: " + tomb2d[0].length); // 4
		System.out.println("elemek száma a 1. sorban: " + tomb2d[1].length); // 2
		System.out.println("elemek száma a 2. sorban: " + tomb2d[2].length); // 3
	}
	public static void tomb2dKiir(int[][] tomb2d) {
		for (int i = 0; i < tomb2d.length; i++) {
			for (int j = 0; j < tomb2d[i].length; j++) {
				System.out.print(tomb2d[i][j] + " ");
			}
			System.out.println();
		}
	}
}
