import java.util.Random;

public class Feladat17 {

	public static void main(String[] args) {
		int[][] teke = new int[2][10];
		matrixFeltolt(teke);
		matrixKiir(teke);

		// a
		System.out.println("a)");
		System.out.println("1. játékos összpontszáma: " + sorOsszead(teke, 0));
		System.out.println("2. játékos összpontszáma: " + sorOsszead(teke, 1));

		// b
		System.out.println("b)");
		kiNyert(teke);

		// c
		System.out.println("\nc)");
		kiVezetaFelenel(teke);

		// d
		System.out.println("\nd)");
		System.out.println("1. játékos: " + kiHanyszorTarol(teke, 0));
		System.out.println("2. játékos: " + kiHanyszorTarol(teke, 1));
		
		// e
		System.out.println("e)");
		if (azNyerAkiTarol(teke)) {
			System.out.println("Igen");
		} else {
			System.out.println("Nem");
		}
	}

	public static void matrixFeltolt(int[][] matrix) {
		Random r = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = r.nextInt(11);
			}
		}
	}

	public static void matrixKiir(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(i + 1 + ". játékos: ");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int sorOsszead(int[][] matrix, int sorszam) {
		int osszeg = 0;
		for (int j = 0; j < matrix[sorszam].length; j++) {
			osszeg += matrix[sorszam][j];
		}
		return osszeg;
	}

	public static void kiNyert(int[][] matrix) {
		if (sorOsszead(matrix, 0) > sorOsszead(matrix, 1)) {
			System.out.printf("Az 1. játékos nyert %d ponttal.", sorOsszead(matrix, 0) - sorOsszead(matrix, 1));
		} else if (sorOsszead(matrix, 1) > sorOsszead(matrix, 0)) {
			System.out.printf("Az 2. játékos nyert %d ponttal.", sorOsszead(matrix, 1) - sorOsszead(matrix, 0));
		} else {
			System.out.printf("Döntetlen.");
		}
	}

	public static int sorOsszeadFelenel(int[][] matrix, int sorszam) {
		int osszeg = 0;
		for (int j = 0; j < 5; j++) {
			osszeg += matrix[sorszam][j];
		}
		return osszeg;
	}

	public static void kiVezetaFelenel(int[][] matrix) {
		if (sorOsszeadFelenel(matrix, 0) > sorOsszeadFelenel(matrix, 1)) {
			System.out.printf("Az 1. játékos vezet a felénél %d ponttal.",
					sorOsszeadFelenel(matrix, 0) - sorOsszeadFelenel(matrix, 1));
		} else if (sorOsszeadFelenel(matrix, 1) > sorOsszeadFelenel(matrix, 0)) {
			System.out.printf("Az 2. játékos vezet a felénél %d ponttal.",
					sorOsszeadFelenel(matrix, 1) - sorOsszeadFelenel(matrix, 0));
		} else {
			System.out.printf("Döntetlen.");
		}
	}

	public static int kiHanyszorTarol(int[][] matrix, int sorszam) {
		int darab = 0;
		for (int j = 0; j < matrix[sorszam].length; j++) {
			if (matrix[sorszam][j] == 10) {
				darab++;
			}
		}
		return darab;
	}

	public static boolean azNyerAkiTarol(int[][] matrix) {
		boolean f = false;
		if (kiHanyszorTarol(matrix, 0) > (kiHanyszorTarol(matrix, 1))
				&& sorOsszead(matrix, 0) > sorOsszead(matrix, 1)) {
			f = true;
		} else {
			f = false;
		}
		return f;
	}
}
