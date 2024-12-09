package com.testing.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SampleUtilTest {
	
	@Test
	public void testAdd() {
		System.out.println("Testing add function with both integers");
		
		Integer a = 15;
		Integer b = 15;
		
		Integer expectedResult = 30;
		Integer result = SampleUtil.add(a, b);
		
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testFirstParamNull() {
		System.out.println("Testing add function with first param as null");
		assertEquals(null, SampleUtil.add(null, 15));
	}
	
	@Test
	public void testSecondParamNull() {
		System.out.println("Testing add function with second param as null");
		assertEquals(null, SampleUtil.add(15, null));
	}
	
	@Test
	public void testAllParamsNull() {
		System.out.println("Testing add function with all params as null");
		assertEquals(null, SampleUtil.add(null, null));
	}

}
