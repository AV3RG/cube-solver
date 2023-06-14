package gg.rohan.cubeletsolver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public final class SolutionSet {

	private int solutionCount = 0;
	private final byte[][] solutions = new byte[Integer.MAX_VALUE][20];
	private final FileWriter writer;

	public SolutionSet() {
		File file = new File("solutions.txt");
		if (file.exists()) {
			file.delete();
		}
		try {
			file.createNewFile();
			writer = new FileWriter(file);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void addSolution(final byte[] solution, final int currentIndex) {
		/*solutions[solutionCount++] = solution;*/
		try {
			final String[] moves = new String[currentIndex];
			for (int i = 0; i < currentIndex; i++) {
				moves[i] = Moves.nameForByte(solution[i]);
			}
			writer.write(Arrays.toString(moves) + "\n");
			writer.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public byte[][] getSolutions() {
		return solutions;
	}

}
