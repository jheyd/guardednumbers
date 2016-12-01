package de.janheyd.guardednumbers;

import java.io.Serializable;

import static java.lang.Math.*;

public final class GuardedInt implements Serializable {

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

	public GuardedInt negate() {
		return new GuardedInt(negateExact(value));
	}

}
