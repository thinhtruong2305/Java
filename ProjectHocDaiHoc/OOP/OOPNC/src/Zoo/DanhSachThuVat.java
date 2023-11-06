package Zoo;

import java.util.ArrayList;
import Animal.Animal;
import AnimalDetail.Cat;
import AnimalDetail.Dog;
import AnimalDetail.Lion;
import AnimalDetail.Tiger;
import AnimalDetail.Wolf;
import AnimalDetail.Hippo;

import java.util.Scanner;

public class DanhSachThuVat {
	private ArrayList<Animal> animals;
	Scanner sc = new Scanner(System.in);
	
	public DanhSachThuVat() {
		setDanhSachThuVat(new ArrayList<Animal>());
	}
	
	public void setDanhSachThuVat(ArrayList<Animal> animals) {
		this.animals = animals;
	}
	public ArrayList<Animal> getDanhSachThuVat(){
		return this.animals;
	}
	
	protected void them(Animal animals) {
		this.animals.add(animals);
	}
	
	protected void nhap() {
		Animal animals=null;
		System.out.println("Nhập nơi sinh sống: ");
		String location = sc.nextLine();
		System.out.println("Nhập độ đói: ");
		int doDoi = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập tên loài(Feline/Canine): ");
		String kind = sc.nextLine();
		if(kind.equalsIgnoreCase("FeLine")) {
			System.out.println("Nhập tên loài vật thuộc họ mèo: ");
			String name = sc.nextLine();
			if(name.equalsIgnoreCase("Sư tử")) {
				System.out.println("Có bờm không(true/false): ");
				boolean bom = sc.nextBoolean();sc.nextLine();
				System.out.println("Nhập giới tính: ");
				String sexual = sc.nextLine();
				animals = new Lion(location, doDoi, kind, name, bom, sexual);
			}else if(name.equalsIgnoreCase("Cọp")) {
				System.out.println("Màu lông: ");
				String furColor = sc.nextLine();
				animals = new Tiger(location, doDoi, kind, name, furColor);
			}else if(name.equalsIgnoreCase("Mèo")) {
				System.out.println("Nhập giống: ");
				String breed = sc.nextLine();
				animals = new Cat(location, doDoi, kind, name, breed);
			}
		}else if(kind.equalsIgnoreCase("Canine")) {
			System.out.println("Nhập tên loài vật thuộc họ chó: ");
			String name = sc.nextLine();
			if(name.equalsIgnoreCase("Chó")) {
				System.out.println("Nhập giống: ");
				String breed = sc.nextLine();
				animals = new Dog(location, doDoi, kind, name, breed);
			}else if(name.equalsIgnoreCase("Sói")) {
				System.out.println("Có phải con đầu đàn không(true/false): ");
				boolean leaderWolf = sc.nextBoolean();sc.nextLine();
				animals = new Wolf(location, doDoi, kind, name, leaderWolf);
			}
		}else {
			System.out.println("Nhập tên loài vật: ");
			String name = sc.nextLine();
			if(name.equalsIgnoreCase("Hà mã")) {
				System.out.println("Nhập cân nặng: ");
				float weight = sc.nextFloat();
				System.out.println("Nhập số lượng thức ăn: ");
				float soLuongThucAn = sc.nextFloat();sc.nextLine();
				animals = new Hippo(location, doDoi, kind, name, weight, soLuongThucAn);
			}
		}
		them(animals);
	}
	
	protected void in() {
		for(Animal animals:this.animals) {
				System.out.println(animals.toString());;
		}
	}
	
}
