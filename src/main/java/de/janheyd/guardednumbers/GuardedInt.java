package de.janheyd.guardednumbers;

import java.io.Serializable;

import static java.lang.Math.*;

public final class GuardedInt implements Serializable, Comparable<GuardedInt> {

	private final int value;

	public GuardedInt(int value) {
		this.value = value;
	}

	public int toInt() {
		return value;
	}

	public GuardedInt plus(GuardedInt number) {
		return plus(number.toInt());
	}

	public GuardedInt plus(int number) {
		return new GuardedInt(addExact(value, number));
	}

	public GuardedInt minus(GuardedInt number) {
		return minus(number.toInt());
	}

	public GuardedInt minus(int number) {
		return new GuardedInt(subtractExact(value, number));
	}

	public GuardedInt times(GuardedInt number) {
		return times(number.toInt());
	}

	public GuardedInt times(int number) {
		return new GuardedInt(multiplyExact(value, number));
	}

	public GuardedInt divideBy(GuardedInt number) {
		return divideBy(number.toInt());
	}

	public GuardedInt divideBy(int number) {
		if (value == Integer.MIN_VALUE && number == -1)
			throw new ArithmeticException("Overflow when dividing Integer.MIN_VALUE (" + Integer.MIN_VALUE + ") by -1");
		return new GuardedInt(value / number);
	}

	public GuardedInt negate() {
		return new GuardedInt(negateExact(value));
	}

	@Override
	public String toString() {
		return Integer.toString(value);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		GuardedInt that = (GuardedInt) o;

		return value == that.value;
	}

	@Override
	public int hashCode() {
		return value;
	}

	@Override
	public int compareTo(GuardedInt o) {
		return Integer.compare(value, o.toInt());
	}

}
