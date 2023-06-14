package gg.rohan.cubeletsolver;

import java.util.Arrays;

public final class CornerCubeletSolver {

	private final CornerCubelet cubelet;

	public CornerCubeletSolver(final CornerCubelet cubelet) {
		this.cubelet = cubelet;
	}

	public SolutionSet generateSolution(final int solX, final int solY, final int solZ) {
		final SolutionSet solutionSet = new SolutionSet();
		System.out.println(
				Arrays.toString(Moves.effectiveMovesCornerCubelet(cubelet.getPosX(), cubelet.getPosY(), cubelet.getPosZ()))
		);
		explore(solX, solY, solZ, cubelet, new byte[20], 0, solutionSet);
		return solutionSet;
	}

	private void explore(
			final int solX,
			final int solY,
			final int solZ,
			final CornerCubelet cubelet,
			final byte[] currentPath,
			final int currentIndex,
			final SolutionSet solutionSet
	) {
		final byte lastMove;
		if (currentIndex == 0) lastMove = 0;
		else lastMove = currentPath[currentIndex - 1];
		for (byte move : Moves.effectiveMovesCornerCubelet(cubelet.getPosX(), cubelet.getPosY(), cubelet.getPosZ())) {
			if (move == (byte) 0) continue;
			if (lastMove >> 2 == move >> 2) continue;
			final CornerCubelet solved = new CornerCubelet(cubelet);
			if (currentIndex == 20) return;
			currentPath[currentIndex] = move;
			solved.applyMove(move);
			if (solved.getPosX() == solX && solved.getPosY() == solY && solved.getPosZ() == solZ) {
				solutionSet.addSolution(currentPath, currentIndex + 1);
				return;
			}
			explore(solX, solY, solZ, solved, Arrays.copyOf(currentPath, currentPath.length), currentIndex + 1, solutionSet);
		}
	}

}
