package gg.rohan.cubeletsolver;

public final class SolutionSet {

	private int solutionCount = 0;
	private final int[][] solutions = new int[10000][20];

	public void addSolution(final int[] solution) {
		solutions[solutionCount++] = solution;
	}

	public int[][] getSolutions() {
		return solutions;
	}

}
