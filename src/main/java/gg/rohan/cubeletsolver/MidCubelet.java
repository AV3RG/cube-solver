package gg.rohan.cubeletsolver;

public final class MidCubelet {

	private byte posX;
	private byte posY;
	private byte posZ;

	public MidCubelet(final byte posX, final byte posY, final byte posZ) {
		this.posX = posX;
		this.posY = posY;
		this.posZ = posZ;
	}

	public MidCubelet(final MidCubelet cubelet) {
		this.posX = cubelet.posX;
		this.posY = cubelet.posY;
		this.posZ = cubelet.posZ;
	}

	public void applyMove(final byte move) {
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
			// U
			case 0: {
				if (posZ == 0) {
					if (posX > posY) {
						if (posX == 1) {
							posX = 2;
							posY = 1;
						}
						else {
							posX = 1;
							posY = 2;
						}
					} else {
						if (posX == 1) {
							posX = 0;
							posY = 1;
						}
						else {
							posX = 1;
							posY = 0;
						}
					}
				}
				break;
			}
			case 1: {
				// D
				if (posZ == 2) {
					if (posX > posY) {
						if (posX == 1) {
							posX = 2;
							posY = 1;
						}
						else {
							posX = 1;
							posY = 2;
						}
					} else {
						if (posX == 1) {
							posX = 0;
							posY = 1;
						}
						else {
							posX = 1;
							posY = 0;
						}
					}
				}
				break;
			}
			case 2: {
				// F
				if (posY == 2) {
					if (posX > posZ) {
						if (posX == 1) {
							posX = 2;
							posZ = 1;
						}
						else {
							posX = 1;
							posZ = 2;
						}
					} else {
						if (posX == 1) {
							posX = 0;
							posZ = 1;
						}
						else {
							posX = 1;
							posZ = 0;
						}
					}
				}
				break;
			}
			case 3: {
				// B
				if (posY == 0) {
					if (posX > posZ) {
						if (posX == 1) {
							posX = 2;
							posZ = 1;
						}
						else {
							posX = 1;
							posZ = 2;
						}
					} else {
						if (posX == 1) {
							posX = 0;
							posZ = 1;
						}
						else {
							posX = 1;
							posZ = 0;
						}
					}
				}
				break;
			}
			case 4: {
				// L
				if (posX == 0) {
					if (posY > posZ) {
						if (posY == 1) {
							posY = 2;
							posZ = 1;
						}
						else {
							posY = 1;
							posZ = 2;
						}
					} else {
						if (posY == 1) {
							posY = 0;
							posZ = 1;
						}
						else {
							posY = 1;
							posZ = 0;
						}
					}
				}
				break;
			}
			case 5: {
				// R
				if (posX == 2) {
					if (posY > posZ) {
						if (posY == 1) {
							posY = 2;
							posZ = 1;
						}
						else {
							posY = 1;
							posZ = 2;
						}
					} else {
						if (posY == 1) {
							posY = 0;
							posZ = 1;
						}
						else {
							posY = 1;
							posZ = 0;
						}
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
