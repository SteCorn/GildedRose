package fi.oulu.tol.sqat;

import java.util.ArrayList;
import java.util.List;


public class GildedRose {

	private static List<Item> items = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        System.out.println("OMGHAI!");
		
        items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 0, 20));
        items.add(new Item("+10 Dexterity Vest", 5, 20));
        items.add(new Item("Elixir of the Mongoose", 5, 0));
        items.add(new Item("Potion of the Mongoose", 5, 7));
        items.add(new Item("Aged Brie", 0, 5));
        items.add(new Item("Aged Brie", 2, 3));
        items.add(new Item("Aged Brie", 0, 51));
        items.add(new Item("+15 Dexterity Vest", 5, 51));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Sulfuras, Hand of Ragnaros", -1, 10));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 30));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 40));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 48));
        items.add(new Item("+5 Dexterity Vest", 0, 0));      
        items.add(new Item("Conjured Mana Cake", 3, 6));

        updateQuality();
}
	
	public static List<Item> getItems() {
		return items;
	}

	
    public static void updateQuality()
    {
        for (int i = 0; i < items.size(); i++)
        {
            if ((!"Aged Brie".equals(items.get(i).getName())) && !"Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) 
            {
                if (items.get(i).getQuality() > 0)
                {
                    if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName()))
                    {
                        items.get(i).setQuality(items.get(i).getQuality() - 1);
                    }
                }
            }
            else
            {
                if (items.get(i).getQuality() < 50)
                {
                    items.get(i).setQuality(items.get(i).getQuality() + 1);

                    if ("Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName()))
                    {
                        if (items.get(i).getSellIn() < 11)
                        {
                            if (items.get(i).getQuality() < 50)
                            {
                                items.get(i).setQuality(items.get(i).getQuality() + 1);
                            }
                        }

                        if (items.get(i).getSellIn() < 6)
                        {
                            if (items.get(i).getQuality() < 50)
                            {
                                items.get(i).setQuality(items.get(i).getQuality() + 1);
                            }
                        }
                    }
                }
            }

            if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName()))
            {
                items.get(i).setSellIn(items.get(i).getSellIn() - 1);
            }

            if (items.get(i).getSellIn() < 0)
            {
                if (!"Aged Brie".equals(items.get(i).getName()))
                {
                    if (!"Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName()))
                    {
                        if (items.get(i).getQuality() > 0)
                        {
                            if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName()))
                            {
                                items.get(i).setQuality(items.get(i).getQuality() - 1);
                            }
                        }
                    }
                    else
                    {
                        items.get(i).setQuality(items.get(i).getQuality() - items.get(i).getQuality());
                    }
                }
                else
                {
                    if (items.get(i).getQuality() < 50)
                    {
                        items.get(i).setQuality(items.get(i).getQuality() + 1);
                    }
                }
            }
        }
    }

}
