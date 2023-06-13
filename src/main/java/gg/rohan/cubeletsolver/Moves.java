package gg.rohan.cubeletsolver;

@SuppressWarnings("PointlessBitwiseExpression")
public final class Moves {

	public static final byte U = 0 << 2;
	public static final byte U2 = U + 1;
	public static final byte U_PRIME = U + 2;

	public static final byte D = 1 << 2;
	public static final byte D2 = D + 1;
	public static final byte D_PRIME = D + 2;

	public static final byte F = 2 << 2;
	public static final byte F2 = F + 1;
	public static final byte F_PRIME = F + 2;

	public static final byte B = 3 << 2;
	public static final byte B2 = B + 1;
	public static final byte B_PRIME = B + 2;

	public static final byte L = 4 << 2;
	public static final byte L2 = L + 1;
	public static final byte L_PRIME = L + 2;

	public static final byte R = 5 << 2;
	public static final byte R2 = R + 1;
	public static final byte R_PRIME = R + 2;


}
