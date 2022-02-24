package com.capg.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

public class RepeatedTestExample {
	@DisplayName("Testcase for Multiplication")
	@RepeatedTest(5)
	void multiply(TestInfo testInfo) {
		int a, b;
		a = 10;
		b = 20;
		assertEquals(200, (a * b), "Matched. Test status - Passed");
	}

}
