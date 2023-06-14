package gg.rohan.cubeletsolver;

public final class Moves {

	public static final byte U = 1 << 2;
	public static final byte U2 = U + 1;
	public static final byte U_PRIME = U + 2;

	public static final byte D = 2 << 2;
	public static final byte D2 = D + 1;
	public static final byte D_PRIME = D + 2;

	public static final byte F = 3 << 2;
	public static final byte F2 = F + 1;
	public static final byte F_PRIME = F + 2;

	public static final byte B = 4 << 2;
	public static final byte B2 = B + 1;
	public static final byte B_PRIME = B + 2;

	public static final byte L = 5 << 2;
	public static final byte L2 = L + 1;
	public static final byte L_PRIME = L + 2;

	public static final byte R = 6 << 2;
	public static final byte R2 = R + 1;
	public static final byte R_PRIME = R + 2;

	public static final byte[] MOVES = {
			U, U2, U_PRIME,
			D, D2, D_PRIME,
			F, F2, F_PRIME,
			B, B2, B_PRIME,
			L, L2, L_PRIME,
			R, R2, R_PRIME
	};

	public static byte[] effectiveMovesCornerCubelet(byte posX, byte posY, byte posZ) {
		byte[] effectiveMoves = new byte[9];
		if (posX == 0) {
			effectiveMoves[0] = L;
			effectiveMoves[1] = L2;
			effectiveMoves[2] = L_PRIME;
		} else {
			effectiveMoves[0] = R;
			effectiveMoves[1] = R2;
			effectiveMoves[2] = R_PRIME;
		}
		if (posY == 0) {
			effectiveMoves[3] = B;
			effectiveMoves[4] = B2;
			effectiveMoves[5] = B_PRIME;
		} else {
			effectiveMoves[3] = F;
			effectiveMoves[4] = F2;
			effectiveMoves[5] = F_PRIME;
		}
		if (posZ == 0) {
			effectiveMoves[6] = U;
			effectiveMoves[7] = U2;
			effectiveMoves[8] = U_PRIME;
		} else {
			effectiveMoves[6] = D;
			effectiveMoves[7] = D2;
			effectiveMoves[8] = D_PRIME;
		}
		return effectiveMoves;
	}


	public static String nameForByte(final byte b) {
		switch (b) {
			case U: return "U";
			case U2: return "U2";
			case U_PRIME: return "U'";
			case D: return "D";
			case D2: return "D2";
			case D_PRIME: return "D'";
			case F: return "F";
			case F2: return "F2";
			case F_PRIME: return "F'";
			case B: return "B";
			case B2: return "B2";
			case B_PRIME: return "B'";
			case L: return "L";
			case L2: return "L2";
			case L_PRIME: return "L'";
			case R: return "R";
			case R2: return "R2";
			case R_PRIME: return "R'";
			default: return "Unknown";
		}
	}
}
