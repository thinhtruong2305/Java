package Kho;

import java.util.*;
import NhacCu.*;

public class Inventory {
	private List<Guitar> guitar;
	
	public Inventory() {
		setGuitar(new ArrayList<Guitar>());
	}

	public List<Guitar> getGuitar() {
		return guitar;
	}

	public void setGuitar(List<Guitar> guitar) {
		this.guitar = guitar;
	}
	
	public void addGuitar(String serialNumber,String builder,String model,String type,String backWood,String topWood,double price) {
		Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
		this.add(guitar);
	}
	
	public void add(Guitar guitar) {
		this.guitar.add(guitar);
	}
	public Guitar take(String serialNumber) {
		Iterator<Guitar> i = guitar.iterator();
		while(i.hasNext()) {
			Guitar guitar = (Guitar)i.next();
			if(guitar.getSerialNumber().equalsIgnoreCase(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
	public Guitar takeGuitar(String serialNumber) {
		Iterator<Guitar> i = guitar.iterator();
		Guitar guitarTemp = null;
		while(i.hasNext()) {
			Guitar guitar = (Guitar)i.next();
			if(guitar.getSerialNumber().equalsIgnoreCase(serialNumber)) {
				guitarTemp = guitar;
			}
		}
		return guitarTemp;
	}
	public Guitar search(Guitar searchGuitar) {
		for(Iterator<Guitar> i = guitar.iterator();i.hasNext();) {
			Guitar guitar =(Guitar)i.next();
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
	public Guitar search1(Guitar searchGuitar) {
		for(Iterator<Guitar> i = guitar.iterator();i.hasNext();) {
			Guitar guitar = (Guitar)i.next();
			String builder = searchGuitar.getBuilder().toLowerCase();
			if((builder != null) && (!builder.equals("")) && builder.equals(guitar.getBuilder().toLowerCase()));
			String type = searchGuitar.getType().toLowerCase();
			if((type !=null) && (!type.equals("")) && type.equals(guitar.getType().toLowerCase()));
			String backWood = searchGuitar.getBackWood().toLowerCase();
			if((backWood != null) && (!backWood.equals("")) && backWood.equals(guitar.getBackWood().toLowerCase())); 
			String topWood = searchGuitar.getTopWood().toLowerCase();
			if((topWood != null) && (!topWood.equals("")) && topWood.equals(guitar.getTopWood().toLowerCase()));
			return guitar;
		}
		return null;
	}
	public Guitar searchGuitar(Guitar searchGuitar) {
		Iterator<Guitar> i = guitar.iterator();
		Guitar guitarTemp = null;
		while(i.hasNext()) {
			Guitar guitar = (Guitar)i.next();
			String builder = searchGuitar.getBuilder().toLowerCase();
			if(!builder.equals(null) && !builder.equals("") && builder.equals(guitar.getBuilder().toLowerCase())) {
				String type = searchGuitar.getType().toLowerCase();
				if(!type.equals(null) && !type.equals("") && type.equals(guitar.getType().toLowerCase())) {
					String backWood = searchGuitar.getBackWood().toLowerCase();
					if(!backWood.equals(null) && !backWood.equals("") && backWood.equals(guitar.getBackWood().toLowerCase())) {
						String topWood = searchGuitar.getTopWood().toLowerCase();
						if(!topWood.equals(null) && !topWood.equals("") && topWood.equals(guitar.getTopWood().toLowerCase())) {
							guitarTemp = guitar;
						}
					}
				}
			}
		}
		return guitarTemp;
	}
}
