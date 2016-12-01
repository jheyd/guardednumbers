package de.janheyd.guardednumbers;

import java.io.Serializable;

public final class GuardedInt implements Serializable {

	private final int value;

	public GuardedInt(int value) {
		this.value = value;
	}

	public int toInt() {
		return value;
	}

}
