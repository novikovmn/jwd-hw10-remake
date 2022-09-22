package by.epam.hw10.dragon_treasure.bean;

import java.io.Serializable;
import java.util.Objects;

public class Treasure implements Serializable{

	private static final long serialVersionUID = 5652149178504368101L;
	
	private String name;
	private double price;

	public Treasure() {
		
	}

	public Treasure(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treasure other = (Treasure) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public String toString() {
		return "Treasure [name=" + name + ", price=" + price + "]";
	}

}
