package gg.rohan.cubeletsolver;

public final class CornerCubelet {

	private byte posX;
	private byte posY;
	private byte posZ;

	public CornerCubelet(final byte posX, final byte posY, final byte posZ) {
		this.posX = posX;
		this.posY = posY;
		this.posZ = posZ;
	}

	public CornerCubelet(final CornerCubelet cubelet) {
		this.posX = cubelet.posX;
		this.posY = cubelet.posY;
		this.posZ = cubelet.posZ;
	}

	public void applyMove(final byte move) {
		if (move == 0) return;
		switch (move % 4) {
			case 0: {
				applyBaseMove(move);
				break;
			}
			case 1: {
				applyBaseMove(move);
				applyBaseMove(move);
				break;
			}
			case 2: {
				applyBaseMove(move);
				applyBaseMove(move);
				applyBaseMove(move);
				break;
			}
		}
	}

	private void applyBaseMove(final byte move) {
		switch (move >> 2) {
			case 1: {
				// U
				if (posZ == 0) {
					if (posX == 0) {
						if (posY == 0) posY = 2;
						else posX = 2;
					} else if (posX == 2) {
						if (posY == 2) posY = 0;
						else posX = 0;
					}
				}
				break;
			}
			case 2: {
				// D
				if (posZ == 2) {
					if (posX == 0) {
						if (posY == 0) posY = 2;
						else posX = 2;
					} else if (posX == 2) {
						if (posY == 2) posY = 0;
						else posX = 0;
					}
				}
				break;
			}
			case 3: {
				// F
				if (posY == 2) {
					if (posZ == 0) {
						if (posX == 0) posX = 2;
						else posZ = 2;
					} else if (posZ == 2) {
						if (posX == 2) posX = 0;
						else posZ = 0;
					}
				}
				break;
			}
			case 4: {
				// B
				if (posY == 0) {
					if (posZ == 0) {
						if (posX == 0) posX = 2;
						else posZ = 2;
					} else if (posZ == 2) {
						if (posX == 2) posX = 0;
						else posZ = 0;
					}
				}
				break;
			}
			case 5: {
				// L
				if (posX == 0) {
					if (posZ == 0) {
						if (posY == 0) posY = 2;
						else posZ = 2;
					} else if (posZ == 2) {
						if (posY == 2) posY = 0;
						else posZ = 0;
					}
				}
				break;
			}
			case 6: {
				// R
				if (posX == 2) {
					if (posZ == 0) {
						if (posY == 0) posY = 2;
						else posZ = 2;
					} else if (posZ == 2) {
						if (posY == 2) posY = 0;
						else posZ = 0;
					}
				}
				break;
			}
		}
	}

	public byte getPosX() {
		return posX;
	}

	public byte getPosY() {
		return posY;
	}

	public byte getPosZ() {
		return posZ;
	}

}
