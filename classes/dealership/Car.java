
import java.util.Arrays;

public class Car {
  private int year;
  private String make;
  private String model;
  private String color;
  private double price;
  private String[] parts;

  public Car(int year, String make, String model, String color, double price, String[] parts) {
    this.year = year;
    this.make = make;
    this.model = model;
    this.color = color;
    this.price = price;
    this.parts = Arrays.copyOf(parts, parts.length);
  }

  public Car(Car source) {
    this.year = source.year;
    this.make = source.make;
    this.model = source.model;
    this.color = source.color;
    this.price = source.price;
    this.parts = Arrays.copyOf(source.parts, source.parts.length);
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getMake() {
    return this.make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String[] getParts() {
    return Arrays.copyOf(this.parts, this.parts.length);
  }

  public void setParts(String[] parts) {
    this.parts = Arrays.copyOf(parts, parts.length);
  }

  @Override
  public String toString() {
    return (
      this.year + " " + this.make + " " + this.model + "\n\tColor: " + this.color
      + "\tPrice: $" + this.price + "\n\tParts: " + Arrays.toString(this.parts) + "\n" 
    );
  }

  public void drive() {
    System.out.println("Congrats on your " + this.color + " " + this.year + " " + this.make + " " + this.model + ".");
    System.out.println("This set you back by $" + this.price + ". Please drive responsibly!");
  } 
}
