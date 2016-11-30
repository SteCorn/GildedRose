package fi.oulu.tol.sqat.tests;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import fi.oulu.tol.sqat.GildedRose;
import fi.oulu.tol.sqat.Item;

public class GildedRoseTest {
	
	GildedRose gil = new GildedRose();
	ArrayList<Item> ite;
	
	@Before
	public void setup (){
		
		GildedRose.main(null);
		ite = (ArrayList<Item>) gil.getItems();
	}
	
	@Test
	public void degrQualityTest() {
		
		assertEquals(19, ite.get(1).getQuality());	
		assertEquals(18, ite.get(0).getQuality());
	}
	
	@Test
	public void negaQualityTest() {
		
		assertEquals(0, ite.get(2).getQuality());
		assertEquals(6, ite.get(3).getQuality());	
	}
	
	@Test
	public void briQualityTest() {
		
		assertEquals(7, ite.get(4).getQuality());
		assertEquals(4, ite.get(5).getQuality());
		assertEquals(51, ite.get(6).getQuality());
	}
	
	@Test
	public void maxQualityTest() {
		
		assertEquals(50, ite.get(7).getQuality());
	}
	
	@Test
	public void LegendaryQualityTest() {
		
		assertEquals(80, ite.get(8).getQuality());
		assertEquals(10, ite.get(9).getQuality());
	}
	
	@Test
	public void BackstageQualityTest() {
		
		assertEquals(0, ite.get(13).getQuality());
		assertEquals(50, ite.get(14).getQuality());
		assertEquals(50, ite.get(15).getQuality());
		assertEquals(21, ite.get(10).getQuality());
		assertEquals(32, ite.get(11).getQuality());
		assertEquals(43, ite.get(12).getQuality());

	}
	
	@Test
	public void LimitQualityTest() {
		
		assertEquals(0, ite.get(16).getQuality());
	}
}
