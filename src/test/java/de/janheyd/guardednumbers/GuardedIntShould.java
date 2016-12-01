package de.janheyd.guardednumbers;

import org.junit.Test;

public class GuardedIntShould {

	@Test(expected = ArithmeticException.class)
	public void throwArithMeticExceptionOn_divide_MINVALUE_by_minusOne() throws Exception {
		new GuardedInt(Integer.MIN_VALUE).divideBy(-1);
	}

}
