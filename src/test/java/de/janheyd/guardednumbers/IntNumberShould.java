package de.janheyd.guardednumbers;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class IntNumberShould {

	@Test
	public void equal_0_0() throws Exception {
		IntNumber zero1 = new IntNumber(0);
		IntNumber zero2 = new IntNumber(0);

		boolean equal = zero1.equals(zero2);

		assertThat(equal, is(true));
	}

	@Test
	public void notEqual_0_1() throws Exception {
		IntNumber zero = new IntNumber(0);
		IntNumber one = new IntNumber(1);

		boolean equal = zero.equals(one);

		assertThat(equal, is(false));
	}

	@Test
	public void notEqual_0_null() throws Exception {
		IntNumber zero = new IntNumber(0);

		boolean equal = zero.equals(null);

		assertThat(equal, is(false));
	}

	@Test
	public void notEqual_0_foo() throws Exception {
		IntNumber zero = new IntNumber(0);

		boolean equal = zero.equals("foo");

		assertThat(equal, is(false));
	}
}
