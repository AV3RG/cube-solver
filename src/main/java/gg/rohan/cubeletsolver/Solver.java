package gg.rohan.cubeletsolver;

public final class Solver {

	public static void main(String[] args) {
		// Take cube input
		// Solve cube
		// Output solution steps
		test();
	}

	private static void test() {
		new CornerCubeletSolver(new CornerCubelet((byte) 2, (byte) 0, (byte) 2)).generateSolution(0, 0, 0);
	}

}
