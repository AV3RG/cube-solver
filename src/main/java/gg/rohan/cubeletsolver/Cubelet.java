package gg.rohan.cubeletsolver;

public final class Cubelet {

	private final byte color;
	private final byte position;

	public Cubelet(final byte color, final int posX, final int posY, final int posZ) {
		this.color = color;
		this.position = (byte) (posX << 4 + posY << 2 + posZ);
	}

	public void applyMove(final int move) {
		switch (move >> 2) {
			case 0: {
				// U
				if (position % 4 == 0) {
					// make the move
				}
				break;
			}
			case 1: {
				// D
				if (position % 4 == 2) {
					// make the move
				}
				break;
			}
			case 2: {
				// F
				if (position % 16 < 12 && position % 16 > 7) /* 8 to 11 */ {
					// make the move
				}
				break;
			}
			case 3: {
				// B
				if (position % 16 < 4 && position % 16 > -1) /* 0 to 3 */ {
					// make the move
				}
				break;
			}
			case 4: {
				// L
				if (position % 64 < 16 && position % 64 > -1) /* 0 to 15 */ {
					// make the move
				}
				break;
			}
			case 5: {
				// R
				if (position % 64 < 48 && position % 64 > 31) /* 32 to 47 */ {
					// make the move
				}
				break;
			}
		}
	}

}
