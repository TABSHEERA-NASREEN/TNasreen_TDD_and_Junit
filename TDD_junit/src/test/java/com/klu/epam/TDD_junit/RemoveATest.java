package com.klu.epam.TDD_junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RemoveATest {

	RemoveA remove;
	@Before
	public void setup()
	{
		remove=new RemoveA();	
	}
	@Test
	public void testOneA()
	{
		assertEquals("BCD",remove.removeAinFirst2("ABCD"));
	}
	@Test
	public void testTwoA()
	{
		assertEquals("CD",remove.removeAinFirst2("AACD"));
	}
	@Test
	public void testOneAat1()
	{
		assertEquals("BCD",remove.removeAinFirst2("BACD"));
	}
	@Test
	public void testNoA()
	{
		assertEquals("BBAA",remove.removeAinFirst2("BBAA"));
	}
	@Test
	public void testtwoAs()
	{
		assertEquals("BAA",remove.removeAinFirst2("AABAA"));
	}
	@Test
	public void nulltest()
	{
		assertEquals("",remove.removeAinFirst2(""));
	}
	@Test
	public void singleAtest()
	{
		assertEquals("",remove.removeAinFirst2("A"));
	}
	@Test
	public void doubleAtest()
	{
		assertEquals("",remove.removeAinFirst2("AA"));
	}

}
