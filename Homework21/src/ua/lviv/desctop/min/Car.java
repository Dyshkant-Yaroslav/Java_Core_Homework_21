package ua.lviv.desctop.min;

public class Car {
	@CarFields("The best model")
	private String model;
	@CarFields("It is my favourite color")
	private int color;
	private int yearOfProduction;
	@CarFields("Nice choose")
	private double price;

	public Car(String model, int color, int yearOfProduction, double price) {
		super();
		this.model = model;
		this.color = color;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", yearOfProduction=" + yearOfProduction + ", price="
				+ price + "]";
	}

}
