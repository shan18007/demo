package com.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

class MathUtilsTest {
	MathUtils mt;
	TestInfo testInfo;
	TestReporter testReporter;

	@BeforeAll
	static void beforeAllInit() {
//		System.out.println("Beofre All....");
	}

	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		mt = new MathUtils();
//		System.out.println("Instance created... ");
		testReporter.publishEntry("Running " +testInfo.getDisplayName() + "with tags "+ testInfo.getTags());
	}

	@AfterEach
	void cleanup() {
		System.out.println("cleaning up... ");
	}

	@Nested
	@DisplayName("AddMethod")
	@Tag("math")
	class testAdd {

		@Test
		@DisplayName("when adding two positive numbers")
		void testAddPositive() {
			int expected = 4;
			int actual = mt.add(3, 1);
			assertEquals(expected, actual, "should be add both values..");
		}

		@Test
		@DisplayName("when adding two negative numbers")
		void testAddNegative() {
			int expected = -4;
			int actual = mt.add(-3, -1);
			// compute the String only when test get failed
			// using lamda
			assertEquals(expected, actual, () -> "should be" + expected + " but got " + actual);
		}
	}

	@Test
	@Tag("math")
	void testDevide() {

//		if(repetitionInfo.getCurrentRepetition() == 1) {
//			//some code based on repetition
//		}
		boolean bol = false;
		// it will abort the test if value is false
		Assumptions.assumeTrue(bol);
		assertThrows(ArithmeticException.class, () -> mt.divide(1, 0), "should get exception");
	}

	@Test
	@DisplayName("Multiply method")
	@Tag("math")
	void testMultiply() {
		
		System.out.println("Running " +testInfo.getDisplayName() + "with tags "+ testInfo.getTags());

		assertAll(() -> assertEquals(4, mt.multiply(2, 2)), () -> assertEquals(0, mt.multiply(2, 0)),
				() -> assertEquals(-2, mt.multiply(2, -1)));
	}

	@Test
	@DisplayName("Disable Method")
	@Disabled
	void testDisabled() {
		fail("This should be disabled..");
	}

}
