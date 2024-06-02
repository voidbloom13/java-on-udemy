public class Main {
  public static void main(String[] args) {
    Car car1 = new Car(2012, "Chevrolet", "Impala", "White", 7750, new String[] {"Tire"});
    Car car2 = new Car(2015, "Chevrolet", "Sonic", "White", 10000, new String[] {""});
    Car car3 = new Car(2001, "Toyota", "Highlander", "White", 1500, new String[] {""});
    Car car4 = new Car(2019, "Toyota", "Rav4", "Gunmetal Gray", 33000, new String[] {"Tire, Keys, Oil Change"});
    Car car5 = new Car(2022, "Toyota", "Tacoma", "Gunmetal Gray", 40000, new String[] {"Tire, Keys, Oil Change, Tire Alignment"});
    Car car6 = new Car(2014, "Kia", "Soul", "Gunmetal Gray", 12500, new String[] {"Tire"});

    Car[] cars = {car1, car2, car3, car4, car5, car6};
    for (Car car : cars) {
      System.out.println(car);
    }
  }
}
