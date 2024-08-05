package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AreacalculatorTest {
	Areacalculator areacalculator;

	@BeforeEach
	public void init() {
		areacalculator = new Areacalculator();
	}

	@Test
	void testAreacalculator() {
		assertEquals(78.5, areacalculator.Areacalculatortest(5));
	}

}
