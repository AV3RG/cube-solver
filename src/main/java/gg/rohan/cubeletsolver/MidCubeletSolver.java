package gg.rohan.cubeletsolver;

import java.util.Arrays;

public final class MidCubeletSolver {

	private final MidCubelet cubelet;

	public MidCubeletSolver(final MidCubelet cubelet) {
		this.cubelet = cubelet;
	}

	public SolutionSet generateSolution(final int solX, final int solY, final int solZ) {
		final SolutionSet solutionSet = new SolutionSet();
		explore(solX, solY, solZ, cubelet, new byte[20], 0, solutionSet);
		return solutionSet;
	}

	private void explore(
			final int solX,
			final int solY,
			final int solZ,
			final MidCubelet cubelet,
			byte[] currentPath,
			int currentIndex,
			SolutionSet solutionSet
	) {

		for (byte move : Moves.MOVES) {
			final MidCubelet solved = new MidCubelet(cubelet);
			currentPath[currentIndex++] = move;
			if (solved.getPosX() == solX && solved.getPosY() == solY && solved.getPosZ() == solZ) {
				solutionSet.addSolution(currentPath, currentIndex);
				return;
			}
			explore(solX, solY, solZ, solved, Arrays.copyOf(currentPath, currentPath.length), currentIndex, solutionSet);
		}
	}

}

