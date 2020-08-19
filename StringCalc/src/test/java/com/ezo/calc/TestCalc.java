package com.ezo.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalc {
	
	StringCalc strCalc = new StringCalc();
	
	@Test
	public void additionWSansEspaces() {
		
		String rslt = strCalc.calcString("1+1");
		
		assertEquals("1", rslt);
		
	}
	
	@Test
	public void additionAvecEspaces() {
		
		String rslt = strCalc.calcString("1 + 2");
		
		assertEquals("3", rslt);
		
	}
	
	@Test
	public void additionAvecEspacesEtNegatifs() {
		
		String rslt = strCalc.calcString("1 + -1");
		
		assertEquals("0", rslt);
		
	}
	
	@Test
	public void soustractionAvecEspacesEtNegatifs() {
		
		String rslt = strCalc.calcString("-1 - -1");
		
		assertEquals("0", rslt);
		
	}
	
	@Test
	public void soustractionSansEspaces() {
		
		String rslt = strCalc.calcString("5-4");
		
		assertEquals("1", rslt);
		
	}
	
	@Test
	public void multiplicationSansEspaces() {
		
		String rslt = strCalc.calcString("5*2");
		
		assertEquals("10", rslt);
		
	}
	
	@Test
	public void additionEtMultiplicationAvecParentheses() {
		
		String rslt = strCalc.calcString("(2+5)*3");
		
		assertEquals("21", rslt);
		
	}
	
	@Test
	public void divisionSansEspaces() {
		
		String rslt = strCalc.calcString("10/2");
		
		assertEquals("5", rslt);
		
	}
	
	@Test
	public void opDiversSandEspaces() {
		
		String rslt = strCalc.calcString("2+2*5+5");
		
		assertEquals("17", rslt);
		
	}
	
	@Test
	public void opDiversSandEspacesAvecFloat() {
		
		String rslt = strCalc.calcString("2.8*3-1");
		
		assertEquals("7.4", rslt);
		
	}
	
	@Test
	public void nombreALaPuissance() {
		
		String rslt = strCalc.calcString("2^8");
		
		assertEquals("256", rslt);
		
	}
	
	@Test
	public void nombreALaPuissanceOpDivers() {
		
		String rslt = strCalc.calcString("2^8*5-1");
		
		assertEquals("1279", rslt);
		
	}
	
	@Test
	public void nombreSqrt() {
		
		String rslt = strCalc.calcString("sqrt(4)");
		
		assertEquals("2", rslt);
		
	}
	@Test
	public void divisionParZero() {
		
		String rslt = strCalc.calcString("1/0");
		
		assertEquals("Erreur*", rslt);
		
	}

}
