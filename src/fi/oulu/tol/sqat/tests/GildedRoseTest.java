package fi.oulu.tol.sqat.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import fi.oulu.tol.sqat.GildedRose;
import fi.oulu.tol.sqat.Item;

public class GildedRoseTest {
	
	GildedRose gil;
	ArrayList<Item> ite;
	
	
	@Test
	public void testTheTruth() {
		assertTrue(true);
	}
	
	@Test
	public void testupdate(){
		
		gil.main(null);
		ite = new ArrayList<Item>();
		ite.add(new Item("ciao",0,30));
		assertEquals(ite.get(0).getQuality(),18);
	}
}
