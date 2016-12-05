package de.janheyd.guardednumbers;

public class IntNumber {

	private int i;

	public IntNumber(int i) {
		this.i = i;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(!(obj instanceof IntNumber))
			return false;
		IntNumber that = (IntNumber) obj;
		return this.i == that.i;
	}
}
