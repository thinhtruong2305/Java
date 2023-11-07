package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Kho.Inventory;
import NhacCu.Guitar;

public class Test {
	static List<Guitar> inventory = new ArrayList<Guitar>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Guitar guitar = new Guitar("113K675", "Huỳnh lạc", "Hiện đại", "4 string", "tràm", "tràm", 150.000);
		Guitar guitar1 = new Guitar("113K676", "Huỳnh phương", "cũ", "Electric", "tràm", "tràm", 150.000);
		Guitar guitar2 = new Guitar("113K677", "Huỳnh lạc", "Hiện đại", "Electric", "xoài", "tràm", 150.000);
		Guitar guitar3 = new Guitar("113K678", "Huỳnh lạc", "Hiện đại", "4 string", "bàng", "tràm", 150.000);
		
		inventory.add(guitar);
		inventory.add(guitar1);
		inventory.add(guitar2);
		inventory.add(guitar3);
		
		System.out.println(search(new Guitar(null, "Huỳnh lạc", "Hiện đại", "4 string", "tràm", "tràm", 0)));
	}
	public static Guitar search(Guitar searchGuitar) {
		for(Iterator<Guitar> i = inventory.listIterator();i.hasNext();) {
			Guitar guitar = (Guitar)i.next();
			String builder = searchGuitar.getBuilder();
			if((builder != null) && (!builder.equals("")) && !builder.equalsIgnoreCase(guitar.getBuilder()))
				continue;
			String type = searchGuitar.getType();
			if((type !=null) && (!type.equals("")) && !type.equalsIgnoreCase(guitar.getType()))
				continue;
			String backWood = searchGuitar.getBackWood();
			if((backWood != null) && (!backWood.equals("")) && !backWood.equalsIgnoreCase(guitar.getBackWood())) 
				continue;
			String topWood = searchGuitar.getTopWood();
			if((topWood != null) && (!topWood.equals("")) && !topWood.equalsIgnoreCase(guitar.getTopWood()))
				continue;
			return guitar;
		}
		return null;
	}
	
}
