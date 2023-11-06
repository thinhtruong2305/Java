package NhacCu;

public class Guitar {
	private String serialNumber, builder, model, type, backWood, topWood;
	private double price;
	
	public Guitar(){
		
	}
	public Guitar(String serialNumber,String builder,String model,String type,String backWood,String topWood,double price) {
		this.setSerialNumber(serialNumber);
		this.setBuilder(builder);
		this.setModel(model);
		this.setType(type);
		this.setBackWood(backWood);
		this.setTopWood(topWood);
		this.setPrice(price);
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBackWood() {
		return backWood;
	}
	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}
	public String getTopWood() {
		return topWood;
	}
	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Guitar [serialNumber=" + serialNumber + ", builder=" + builder + ", model=" + model + ", type=" + type
				+ ", backWood=" + backWood + ", topWood=" + topWood + ", price=" + price + "]";
	}
}
