package gg.rohan.cubeletsolver;

import java.util.Arrays;

public final class CornerCubeletSolver {

	private final CornerCubelet cubelet;

	public CornerCubeletSolver(final CornerCubelet cubelet) {
		this.cubelet = cubelet;
	}

	public SolutionSet generateSolution(final int solX, final int solY, final int solZ) {
		final SolutionSet solutionSet = new SolutionSet();
		explore(solX, solY, solZ, cubelet, new int[20], 0, solutionSet);
		return solutionSet;
	}

	private void explore(
			final int solX,
			final int solY,
			final int solZ,
			final CornerCubelet cubelet,
			int[] currentPath,
			int currentIndex,
			SolutionSet solutionSet
	) {

		for (byte move : Moves.MOVES) {
			final CornerCubelet solved = new CornerCubelet(cubelet);
			currentPath[currentIndex++] = move;
			if (solved.getPosX() == solX && solved.getPosY() == solY && solved.getPosZ() == solZ) {
				solutionSet.addSolution(currentPath);
				return;
			}
			explore(solX, solY, solZ, solved, Arrays.copyOf(currentPath, currentPath.length), currentIndex, solutionSet);
		}
	}

}
