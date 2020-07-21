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
	public void oneA0test()
	{
		assertEquals("BCD",remove.removeAinFirst2("ABCD"));
	}
	@Test
	public void twoAtest()
	{
		assertEquals("CD",remove.removeAinFirst2("AACD"));
	}
	@Test
	public void oneA1test()
	{
		assertEquals("BCD",remove.removeAinFirst2("BACD"));
	}
	@Test
	public void noAtest()
	{
		assertEquals("BBAA",remove.removeAinFirst2("BBAA"));
	}
	@Test
	public void test()
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
